package HWanswer;
//과제1] 숫자 2개를 입력받아서, Number 클래스에 생성자로 전달하고, 반환하여 출력하되, getNumber메소드를 이용하여
//출력하세요.

import java.util.Scanner;

public class Number {

	private int num;

	public Number(int n) {
		num = n;
	}
	
	public int getNumber() {
		return num;
	}
	
	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		Number n1 = new Number(num1);
		System.out.println(n1.getNumber());
		Number n2 = new Number(num2);
		System.out.println(n2.getNumber());
	}
}
