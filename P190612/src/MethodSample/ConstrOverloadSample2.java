package MethodSample;

import java.util.Scanner;

//����] �̸��� ���̸� �Է¹޾Ƽ�, �����ڸ� �̿��Ͽ� �����ϰ�, ����غ�����.
//Object�� �̿��� Ŭ���� ������ ���, ClassName�� �̿��Ͽ� Ŭ�������� �� ���
//�߰�: �����ε�




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
		System.out.println("�̸�: "+this.name +", ����: "+ this.age + "��");
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� ���̸� �Է��ϼ���.");
		String name = sc.next();
		int age = sc.nextInt();
		
		ConstrOverloadSample2 overload = new ConstrOverloadSample2(name, age);
		
		
		overload.show();
		
		overload.name = "ȫ�浿";
		overload.age = 24;
		
		overload.show();
		
		System.out.println(ConstrOverloadSample2.name);
		System.out.println(ConstrOverloadSample2.age);
		
		
	}

}
