package MethodSample;

import java.util.Scanner;
//생성자 메소드: 클래스간의 값을 주고 받거나 합니다.
//생성자는 상속이 되지 않습니다. 생성자는 클ㄹ래스명과 같은 이름을 사용.
//반환타입이 없다. 그래서 return을 사용하지 않는다.
//접근제한자는 public 이거나 생략가능하다.
//생성자 메서드는 오버로딩이 가능하다.
//프로그래머가 생성자 메소드를 작성하지않으면 JVM이 자동으로 만들어줍니다.
//생성자 메소드가 하나라도 없으면 그 때 만들어 줍니다.
// 그리고, 클래스에 클래스 변수에 값을 초기화할 목적으로 사용합니다.

//메소드 측면 비교
//1. 메소드는 객체의 동작에 해당하는 중괄호 { } 블럭을 사용합니다.
//2. 메소드를 호출하면 중괄호 블럭에 있는 모든 코드들이 일괄적으로 실행됩니다.
//3. 메소드는 필드를 읽고 수정하는 역할을 합니다.
//4. 또한 다른 객체를 생성하여 다양한 기능을 수행하기도 합니다.
//5. *** 메소드는 객체간의 데이터 전달의 수단으로 사용됩니다.
//6. 외부로부터 매개변수값을 받을 수 있고, 실행 후에 임의의 값을 반환할 수도 있습니다.
//7. 


//문제] 2개의 숫자를 입력받아서 메소드에 전달하고, 그 결과를 리턴받아서 출력하는 로직을 작성하세요.

public class ConstructorSample {
	//field area :  객체 고유의 데이터나 상태정보를 저장하는 곳
	//선언형태는 변수와 비슷하지만, 필드를 변수라고 부르지 않습니다.
	//클래스 변수는 생성자와 메소드내에서만 사용되고, 생성자와 메소드가 실행이 종료되면 
	//자동으로 소멸됩니다.
	//
	
	
	static int x;
	static int y;
	private int total;
	private int sum2;
	
	//생성자
	
	public ConstructorSample() {
		
	}
	
	
	public ConstructorSample(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public int SUM(int n1, int n2) {
		int total;
		total = n1+n2;
		return total;
	}
	
	
	private void Adder() {
		sum2 = this.x +  this.y;
		
	}
	
	private void display() {
		System.out.println("생성자를 이용하여 메소드를 호출한 결과는 "+sum2);
		
	}


	public static void main(String[] args) {
		ConstructorSample cs = new ConstructorSample(100, 50);
		
		int n1, n2, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요.");
		n1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		n2 = sc.nextInt();
		
		sum = cs.SUM(n1, n2);
		System.out.println("합계는 "+sum);
		
		

		//method를 만들어 접근하라.
		cs.Adder();
		cs.display();
	}


	
}

//생성자
//자동차 클래스가 있습니다. 그 클래스에 색상과 가격을 생성자를 통하여 입력하고 출력하세요.