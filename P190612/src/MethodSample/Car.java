package MethodSample;
//������
//�ڵ��� Ŭ������ �ֽ��ϴ�. �� Ŭ������ ����� ������ �����ڸ� ���Ͽ� �Է��ϰ� ����ϼ���.
public class Car {

	private String color;
	private int price;

	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}
	private String Display() {
		return this.color +" "+ this.price;
	}	
	
	private String output() {
		return this.color + this.price;
	}
	
	
	
	public static void main(String[] args) {
		
		Car car = new Car("YELLOW ", 50000);
		Car car2 = new Car("RED ", 45000);
		
//		System.out.println(car.Display());
//		System.out.println(car2.Display());
		String msg = car.output();
		System.out.println(msg);
	}
	

	

}
