package ProblemTest;

import java.util.Scanner;

public class answer02 {

	public static void main(String[] args) {
		/*
		 * 1����Ż: �������ڰ��� �հ�, ���ϰ� ����
		 * 2��: �������ڰ� �ְ� ���ϰ� ����
		 * 3�� : �������ڰ� ����, ���ϰ� ����
		 * 4��: �������ڰ��� ����, ���ϰ� ����.
		 */
		
		
//		�μ��� �Է¹޾Ƽ� �������� �Ͽ� ����ϼ���. 1����Ÿ��
//		//1��
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ���� �Է� >>");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int result = OneAdd(num1,num2);
//		System.out.println("�հ�: "+result);
		
		
		//2��
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ���� �Է� >>");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		TwoAdd(num1, num2);
		
		//3��
//		System.out.println("�հ�: "+ThreeAdd());
		
		//4��
		FourAdd();
		
	}

	private static void FourAdd() {
		int num1=100, num2=200;
		System.out.println("�հ�: "+(num1+num2));
	}

	private static int ThreeAdd() {
		int result=0, num1=100, num2=200;
		result = num1+num2;
		return result;
	}

	private static void TwoAdd(int num1, int num2) {
		System.out.println("�հ�: "+(num1+num2));
	}

	private static int OneAdd(int num1, int num2) {
		return num1+num2;
	}
	
	

}
