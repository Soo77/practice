package HW160613;

import java.util.Scanner;

//����1] ���� ������ �����ϴ� ���α׷��� �ۼ��� ������.
// - ������ �Ͽ� ���¸� �����մϴ�.
// - �����ϴ� �޼ҵ�� ã�� �޼ҵ带 �����մϴ�
// - ���� �ܾ��� ����մϴ�.
// hint> ������, �޼ҵ� �̿� 

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
