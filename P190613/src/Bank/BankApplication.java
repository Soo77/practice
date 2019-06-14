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
			System.out.println("|1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료 |");
			System.out.println("------------------------------------");
			System.out.println("번호를 입력하세요.");
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
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
			}
			
			
			
		}
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String acnum = sc.next();
		System.out.print("인출할 돈: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금되었습니다.");
		
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
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String acnum = sc.next();
		System.out.println("예금할 돈: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금되었습니다.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
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
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String acnum = sc.next();
		System.out.print("계좌주: ");
		String name = sc.next();
		System.out.print("초기입금액: ");
		int money = sc.nextInt();
		
		for(int i=0; i<AcArray.length; i++) {
			if(AcArray[i]==null) {
				AcArray[i] = new Account(acnum, name, money);
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
	}

}
