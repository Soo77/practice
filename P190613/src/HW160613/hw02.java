package HW160613;

import java.util.Scanner;

//����2] �̸��� ���̸� �Է� �޾Ƽ� �޼ҵ� �����ε����� ������ ������.
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
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		Name.printInformation(name);
		Age.printInformation(age);
		
		
//		printInformation(name);
//		printInformation(age);
		
	}

}
