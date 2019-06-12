package MethodSample;
//생성자
//자동차 클래스가 있습니다. 그 클래스에 색상과 가격을 생성자를 통하여 입력하고 출력하세요.
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
