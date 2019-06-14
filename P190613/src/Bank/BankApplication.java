package Bank;

import java.util.Scanner;

public class BankApplication {

	static Account[] AcArray = new Account[100];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Account ac = new Account();
		
		
		boolean run = true;
		while(run) {
	
			
			System.out.println("------------------------------------");
			System.out.println("|1.���»���|2.���¸��|3.����|4.���|5.���� |");
			System.out.println("------------------------------------");
			System.out.println("��ȣ�� �Է��ϼ���.");
			int num = sc.nextInt();
			if(num==1) {
				createAccount();
			} else if(num==2) {
				accountList();
			} else if(num==3) {
				deposit();
			} else if(num==4) {
				withdraw();
			} else if(num==5) {
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			} else {
				System.out.println("���ڸ� �ٽ� �Է����ּ���.");
			}
			
			
			
		}
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String acnum = sc.next();
		System.out.print("������ ��: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("���: ��ݵǾ����ϴ�.");
		
	}

	private static Account findAccount(String acnum) {
		Account account = null;
		for(int i=0; i<AcArray.length; i++) {
			if(AcArray[i] != null) {
				String dbAno = AcArray[i].getAno();
				if(dbAno.equals(acnum)) {
					account = AcArray[i];
					break;
				}
			}
		}
		return account;
	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String acnum = sc.next();
		System.out.println("������ ��: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("���: ���ݵǾ����ϴ�.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		
		for(int i=0; i<AcArray.length; i++) {
			Account account = AcArray[i];
			if(account != null) {
				System.out.print(account.getAno()+"\t");
				System.out.print(account.getName()+"\t");
				System.out.println(account.getBalance()+"\t");
			}
		}
	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		
		System.out.print("���¹�ȣ: ");
		String acnum = sc.next();
		System.out.print("������: ");
		String name = sc.next();
		System.out.print("�ʱ��Աݾ�: ");
		int money = sc.nextInt();
		
		for(int i=0; i<AcArray.length; i++) {
			if(AcArray[i]==null) {
				AcArray[i] = new Account(acnum, name, money);
				break;
			}
		}
		System.out.println("���°� �����Ǿ����ϴ�.");
	}

}
