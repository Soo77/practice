package MethodSample;

import java.util.Scanner;

//문제] 이름과 나이를 입력받아서, 생성자를 이용하여 저장하고, 출력해보세요.
//Object를 이용한 클래스 변수값 출력, ClassName을 이용하여 클래스변수 값 출력
//추가: 오버로딩




public class ConstrOverloadSample2 {

	private static String name;
	private static int age;

	public ConstrOverloadSample2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ConstrOverloadSample2(String name) {
		this.name = name;
	}
	
	public ConstrOverloadSample2(int age) {
		this.age = age;
	}
	
	
	public void show() {
		System.out.println("이름: "+this.name +", 나이: "+ this.age + "세");
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요.");
		String name = sc.next();
		int age = sc.nextInt();
		
		ConstrOverloadSample2 overload = new ConstrOverloadSample2(name, age);
		
		
		overload.show();
		
		overload.name = "홍길동";
		overload.age = 24;
		
		overload.show();
		
		System.out.println(ConstrOverloadSample2.name);
		System.out.println(ConstrOverloadSample2.age);
		
		
	}

}
