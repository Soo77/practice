package MethodSample;

import java.util.Scanner;

public class Sample1 {
static //method(function): 반복적으로 사용되는 모듈(기능)을 구현한것.
	public double result1;
	public static double result2;

	private static void Adder(int su1, double su2) {
		result1 = su1+su2;
		System.out.println("합계는 "+result1);
	}
	
	private static void Multi(int su1, double su2) {
		result2 = su1*su2;
		System.out.println("곱셈은 "+result2);
	}
	
	
	public static void main(String[] args) {
		//두 수를 입력 하는데, 하나는 정수형을, 다른 하나는 실수형을 입력하세요.
		//기능: +, *
		//그리고, 메소드를 만들어서 구현합니다.
		//설계: 클래스(Sample1,), 메소드(+:adder, *:multi )
		//변수(sum, su1, su2 ), 알고리즘( class가 한개인가? 두개인가?)
		
		int su1;
		double su2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개, 실수 한개 입력 >>");
		su1 = sc.nextInt();
		su2 = sc.nextDouble();
		
		Adder(su1, su2);//double sum = su1 + su2;
		Multi(su1, su2);
		
		//System.out.println(sum);
		
	}


	



}
