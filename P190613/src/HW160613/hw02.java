package HW160613;

import java.util.Scanner;

//과제2] 이름과 나이를 입력 받아서 메소드 오버로딩으로 구현해 보세요.
//hint> printInformation()

public class hw02 {
	
	void printInformation(String name) {
		System.out.println(name);
	}
	
	void printInformation(int age) {
		System.out.println(age);
	}

	public static void main(String[] args) {

		hw02 Name = new hw02();
		hw02 Age = new hw02();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		Name.printInformation(name);
		Age.printInformation(age);
		
		
//		printInformation(name);
//		printInformation(age);
		
	}

}
