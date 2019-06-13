package HW160613;

import java.util.Scanner;

//����1] ���� ������ �����ϴ� ���α׷��� �ۼ��� ������.
// - ������ �Ͽ� ���¸� �����մϴ�.
// - �����ϴ� �޼ҵ�� ã�� �޼ҵ带 �����մϴ�
// - ���� �ܾ��� ����մϴ�.
// hint> ������, �޼ҵ� �̿� 


public class BankApplication {
	
	static Account[] accountArray = new Account[100];
	static Scanner sc = new Scanner(System.in);
	
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		
		System.out.print("���¹�ȣ: ");
		String Acnumber = sc.next();
		
		System.out.print("������ ����: ");
		String owner = sc.next();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(Acnumber, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = newAccount;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}




	
	private static void accountList() {
		System.out.println("-----");
		System.out.println("���¸��");
		System.out.println("-----");
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAcnumber()+"\t");
				System.out.print(account.getOwner()+"\t");
				System.out.println(account.getBalance());
			}
		}
	}
	
	
	private static void deposit() {
		System.out.println("-----");
		System.out.println("����");
		System.out.println("-----");
		System.out.println("���¹�ȣ: ");
		String acnum = sc.next();
		System.out.println("���ݾ�: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account==null) {
			System.out.println("���: ���°� �������� �ʽ��ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("���: ������ ���������� �Ǿ����ϴ�.");
	}
	
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("���");
		System.out.println("-----");
		System.out.println("���¹�ȣ: ");
		String acnum = sc.next();
		System.out.println("��ݾ�: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account==null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("���: ����� ���������� �Ǿ����ϴ�.");
	}
	
	private static Account findAccount(String acnum) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				String dbAcnum = accountArray[i].getAcnumber();
				if(dbAcnum.equals(acnum)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	public static void main(String[] args) {

		boolean run = true;
		
		while(run) {
			
			System.out.println("------------------------------------------");
			System.out.println("|1.���»��� |2.���¸�� |3.���� |4.��� |5.���� |");
			System.out.println("------------------------------------------");
			
			System.out.println("���ڸ� �Է��ϼ���.");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run=false;System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
			}
			
		}
		
	}
}
