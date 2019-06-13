package HW160613;

import java.util.Scanner;

//과제1] 다음 조건을 만족하는 프로그램을 작성해 보세요.
// - 저축을 하여 계좌를 생성합니다.
// - 저축하는 메소드와 찾는 메소드를 구현합니다
// - 현재 잔액을 출력합니다.
// hint> 생성자, 메소드 이용 

public class Account {
	
	private String acnumber;
	private String owner;
	private int balance;
	
	

	public Account(String acnumber, String owner, int balance) {
		this.acnumber = acnumber;
		this.owner = owner;
		this.balance = balance;
	}



	public String getAcnumber() {
		return acnumber;
	}



	public String getOwner() {
		return owner;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	

}
