package HWanswer;
//����1] ���� 2���� �Է¹޾Ƽ�, Number Ŭ������ �����ڷ� �����ϰ�, ��ȯ�Ͽ� ����ϵ�, getNumber�޼ҵ带 �̿��Ͽ�
//����ϼ���.

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
