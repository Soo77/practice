package HW160613;

import java.util.Scanner;

//과제1] 다음 조건을 만족하는 프로그램을 작성해 보세요.
// - 저축을 하여 계좌를 생성합니다.
// - 저축하는 메소드와 찾는 메소드를 구현합니다
// - 현재 잔액을 출력합니다.
// hint> 생성자, 메소드 이용 


public class BankApplication {
	
	static Account[] accountArray = new Account[100];
	static Scanner sc = new Scanner(System.in);
	
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호: ");
		String Acnumber = sc.next();
		
		System.out.print("계좌주 성명: ");
		String owner = sc.next();
		
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(Acnumber, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}




	
	private static void accountList() {
		System.out.println("-----");
		System.out.println("계좌목록");
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
		System.out.println("예금");
		System.out.println("-----");
		System.out.println("계좌번호: ");
		String acnum = sc.next();
		System.out.println("예금액: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account==null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공적으로 되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("출금");
		System.out.println("-----");
		System.out.println("계좌번호: ");
		String acnum = sc.next();
		System.out.println("출금액: ");
		int money = sc.nextInt();
		Account account = findAccount(acnum);
		if(account==null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공적으로 되었습니다.");
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
			System.out.println("|1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료 |");
			System.out.println("------------------------------------------");
			
			System.out.println("숫자를 입력하세요.");
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
				run=false;System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
			
		}
		
	}
}
