package HWanswer;
//����1] ���� ������ �����ϴ� ���α׷��� �ۼ��� ������.
// - ������ �Ͽ� ���¸� �����մϴ�.
// - �����ϴ� �޼ҵ�� ã�� �޼ҵ带 �����մϴ�
// - ���� �ܾ��� ����մϴ�.
// hint> ������, �޼ҵ� �̿� 



public class Account {

	private int money;//1000����

	public Account(int money) {
		this.money = money;//1000, ���尳���� ���� �ʱⰪ
	}

	public static void main(String[] args) {
		Account acc = new Account(1000);
		acc.deposit(2000);//���� �޼ҵ�
		acc.deposit(3000);
		acc.withdraw(500);//��� �޼ҵ�
		
		System.out.println(acc.money+"��");
		System.out.println(acc.getMoney()+"��");
		
		
	}
	
	public double getMoney() {
		return money;
	}

	private void withdraw(int amount) {//��ݾ׿� ���� üũ
		if(amount > 0 && money-amount >= 0) {
			money-=amount;//6000-500=5500
		}
	}
	

	private void deposit(int amount) {//�Աݾ׿� ���� üũ 0���� Ŀ���Ѵ�.
		if(amount > 0) {
			money+=amount;//1000+2000=3000, 3000+3000=6000
		}
	}


}
