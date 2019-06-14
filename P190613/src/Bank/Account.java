package Bank;

public class Account {

	private String acnum;
	private String name;
	private int balance;

	public Account(String acnum, String name, int balance) {
		this.acnum = acnum;
		this.name = name;
		this.balance = balance;
	}

	public String getAno() {
		return this.acnum;
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}






	

}
