package HWanswer;

import java.util.Scanner;

public class NameAge {
	
	public static void main(String[] args) {
		NameAge na = new NameAge();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� ���̸� �Է����ּ���");
		String name = sc.next();
		int age = sc.nextInt();
		
		na.printInformation(name);
		na.printInformation(age);
		
		
		
		
	}
	
	
	
	private void printInformation(String name) {
		System.out.println("�̸��� " + name + "�̰�, ");
	}
	
	private void printInformation(int age) {
		System.out.println("���̴� " + age + "�Դϴ�.");
	}

	
}
