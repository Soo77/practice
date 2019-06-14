package HWanswer;

import java.util.Scanner;

public class NameAge {
	
	public static void main(String[] args) {
		NameAge na = new NameAge();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 나이를 입력해주세요");
		String name = sc.next();
		int age = sc.nextInt();
		
		na.printInformation(name);
		na.printInformation(age);
		
		
		
		
	}
	
	
	
	private void printInformation(String name) {
		System.out.println("이름은 " + name + "이고, ");
	}
	
	private void printInformation(int age) {
		System.out.println("나이는 " + age + "입니다.");
	}

	
}
