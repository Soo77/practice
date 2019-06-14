package HWanswer;
//과제1] 다음 조건을 만족하는 프로그램을 작성해 보세요.
// - 저축을 하여 계좌를 생성합니다.
// - 저축하는 메소드와 찾는 메소드를 구현합니다
// - 현재 잔액을 출력합니다.
// hint> 생성자, 메소드 이용 



public class Account {

	private int money;//1000저장

	public Account(int money) {
		this.money = money;//1000, 통장개설을 위한 초기값
	}

	public static void main(String[] args) {
		Account acc = new Account(1000);
		acc.deposit(2000);//저축 메소드
		acc.deposit(3000);
		acc.withdraw(500);//출금 메소드
		
		System.out.println(acc.money+"원");
		System.out.println(acc.getMoney()+"원");
		
		
	}
	
	public double getMoney() {
		return money;
	}

	private void withdraw(int amount) {//출금액에 대한 체크
		if(amount > 0 && money-amount >= 0) {
			money-=amount;//6000-500=5500
		}
	}
	

	private void deposit(int amount) {//입금액에 대한 체크 0보다 커야한다.
		if(amount > 0) {
			money+=amount;//1000+2000=3000, 3000+3000=6000
		}
	}


}
