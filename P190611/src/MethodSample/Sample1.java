package MethodSample;

import java.util.Scanner;

public class Sample1 {
static //method(function): �ݺ������� ���Ǵ� ���(���)�� �����Ѱ�.
	public double result1;
	public static double result2;

	private static void Adder(int su1, double su2) {
		result1 = su1+su2;
		System.out.println("�հ�� "+result1);
	}
	
	private static void Multi(int su1, double su2) {
		result2 = su1*su2;
		System.out.println("������ "+result2);
	}
	
	
	public static void main(String[] args) {
		//�� ���� �Է� �ϴµ�, �ϳ��� ��������, �ٸ� �ϳ��� �Ǽ����� �Է��ϼ���.
		//���: +, *
		//�׸���, �޼ҵ带 ���� �����մϴ�.
		//����: Ŭ����(Sample1,), �޼ҵ�(+:adder, *:multi )
		//����(sum, su1, su2 ), �˰���( class�� �Ѱ��ΰ�? �ΰ��ΰ�?)
		
		int su1;
		double su2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ѱ�, �Ǽ� �Ѱ� �Է� >>");
		su1 = sc.nextInt();
		su2 = sc.nextDouble();
		
		Adder(su1, su2);//double sum = su1 + su2;
		Multi(su1, su2);
		
		//System.out.println(sum);
		
	}


	



}
