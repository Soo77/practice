package MethodSample;

import java.util.Scanner;
//������ �޼ҵ�: Ŭ�������� ���� �ְ� �ްų� �մϴ�.
//�����ڴ� ����� ���� �ʽ��ϴ�. �����ڴ� Ŭ��������� ���� �̸��� ���.
//��ȯŸ���� ����. �׷��� return�� ������� �ʴ´�.
//���������ڴ� public �̰ų� ���������ϴ�.
//������ �޼���� �����ε��� �����ϴ�.
//���α׷��Ӱ� ������ �޼ҵ带 �ۼ����������� JVM�� �ڵ����� ������ݴϴ�.
//������ �޼ҵ尡 �ϳ��� ������ �� �� ����� �ݴϴ�.
// �׸���, Ŭ������ Ŭ���� ������ ���� �ʱ�ȭ�� �������� ����մϴ�.

//�޼ҵ� ���� ��
//1. �޼ҵ�� ��ü�� ���ۿ� �ش��ϴ� �߰�ȣ { } ���� ����մϴ�.
//2. �޼ҵ带 ȣ���ϸ� �߰�ȣ ���� �ִ� ��� �ڵ���� �ϰ������� ����˴ϴ�.
//3. �޼ҵ�� �ʵ带 �а� �����ϴ� ������ �մϴ�.
//4. ���� �ٸ� ��ü�� �����Ͽ� �پ��� ����� �����ϱ⵵ �մϴ�.
//5. *** �޼ҵ�� ��ü���� ������ ������ �������� ���˴ϴ�.
//6. �ܺηκ��� �Ű��������� ���� �� �ְ�, ���� �Ŀ� ������ ���� ��ȯ�� ���� �ֽ��ϴ�.
//7. 


//����] 2���� ���ڸ� �Է¹޾Ƽ� �޼ҵ忡 �����ϰ�, �� ����� ���Ϲ޾Ƽ� ����ϴ� ������ �ۼ��ϼ���.

public class ConstructorSample {
	//field area :  ��ü ������ �����ͳ� ���������� �����ϴ� ��
	//�������´� ������ ���������, �ʵ带 ������� �θ��� �ʽ��ϴ�.
	//Ŭ���� ������ �����ڿ� �޼ҵ峻������ ���ǰ�, �����ڿ� �޼ҵ尡 ������ ����Ǹ� 
	//�ڵ����� �Ҹ�˴ϴ�.
	//
	
	
	static int x;
	static int y;
	private int total;
	private int sum2;
	
	//������
	
	public ConstructorSample() {
		
	}
	
	
	public ConstructorSample(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�޼ҵ�
	public int SUM(int n1, int n2) {
		int total;
		total = n1+n2;
		return total;
	}
	
	
	private void Adder() {
		sum2 = this.x +  this.y;
		
	}
	
	private void display() {
		System.out.println("�����ڸ� �̿��Ͽ� �޼ҵ带 ȣ���� ����� "+sum2);
		
	}


	public static void main(String[] args) {
		ConstructorSample cs = new ConstructorSample(100, 50);
		
		int n1, n2, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		n1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		n2 = sc.nextInt();
		
		sum = cs.SUM(n1, n2);
		System.out.println("�հ�� "+sum);
		
		

		//method�� ����� �����϶�.
		cs.Adder();
		cs.display();
	}


	
}

//������
//�ڵ��� Ŭ������ �ֽ��ϴ�. �� Ŭ������ ����� ������ �����ڸ� ���Ͽ� �Է��ϰ� ����ϼ���.