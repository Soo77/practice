package ProblemTest;

import java.util.Scanner;

public class answer02 {

	public static void main(String[] args) {
		/*
		 * 1번스탈: 전달인자값이 잇고, 리턴값 존재
		 * 2번: 전달인자값 있고 리턴값 없음
		 * 3번 : 전달인자값 없고, 리턴값 존재
		 * 4번: 전달인자값이 없고, 리턴값 없음.
		 */
		
		
//		두수를 입력받아서 덧셈ㅇ를 하여 출력하세요. 1번스타일
//		//1번
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 수를 입력 >>");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int result = OneAdd(num1,num2);
//		System.out.println("합계: "+result);
		
		
		//2번
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 수를 입력 >>");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		TwoAdd(num1, num2);
		
		//3번
//		System.out.println("합계: "+ThreeAdd());
		
		//4번
		FourAdd();
		
	}

	private static void FourAdd() {
		int num1=100, num2=200;
		System.out.println("합계: "+(num1+num2));
	}

	private static int ThreeAdd() {
		int result=0, num1=100, num2=200;
		result = num1+num2;
		return result;
	}

	private static void TwoAdd(int num1, int num2) {
		System.out.println("합계: "+(num1+num2));
	}

	private static int OneAdd(int num1, int num2) {
		return num1+num2;
	}
	
	

}
