package HWanswer;

import java.text.DecimalFormat;
import java.util.Scanner;

//����2] �⼷�� ������ ������ �����ϴ�. ���� 90��, ���� 90��, ���� 90���Դϴ�.
//	�� ������ ������ �� ���� �����ڸ� �̿��Ͽ� �����ϰ�, �� ���� �޼ҵ带 �̿��Ͽ� ����ϼ���.
// ��ȣ �̸� ���� ���� ���� ���� ���	

class Count {
	private int number;

	public Count(int number) {//÷�� �Է¹޿�
		this.number = number;
	}
	
	public int Cn() {
		return number++;//ù��°����� 1�� �ι�°����� 2��..//÷ �����ٰ� 1������
	}
}

class NameData {
	private String name;

	public NameData(String name) {
		this.name = name;
	}
	
	public String printName() {
		return name;
	}
}

class korData {
	private int kor;

	public korData(int kor) {
		this.kor = kor;
	}
	
	public int printKor() {
		return kor;
	}
}

class engData {
	private int eng;

	public engData(int eng) {
		this.eng = eng;
	}
	
	public int printEng() {
		return eng;
	}
}

class mathData {
	private int math;

	public mathData(int math) {
		this.math = math;
	}
	
	public int printMath() {
		return math;
	}
}




public class Score {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȣ �̸� ���� ���� ���� ������ �Է��ϼ���!");
		int number = sc.nextInt();//�й� ��ȣ
		String name = sc.next(); //�̸�
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		//title ���
		System.out.println("--------------------------------------------------------");
		System.out.println("��ȣ\t �̸�\t ����\t ����\t ����\t ����\t ���");
		System.out.println("--------------------------------------------------------");
		
		//�����ڿ��� �����͸� �Ѱ��ִ� ��ƾ(������ ����)
		Count Num = new Count(number);
		NameData Name = new NameData(name);
		korData Kor = new korData(kor);
		engData Eng = new engData(eng);
		mathData Math = new mathData(math);
		
		
		//���� ��ƾ
		DecimalFormat df = new DecimalFormat("#.##"); 
		int sum = Kor.printKor() + Eng.printEng() + Math.printMath();
		double ave = sum / 3.0;
		String average = df.format(ave);
		
		//����ó�� ���� ��� 
		String str = Num.Cn() + "\t" + Name.printName() + "\t" +
		Kor.printKor() + "\t" + Eng.printEng() + "\t" +
		Math.printMath() + "\t" + sum + "\t" + average;
	
		System.out.println(str);
	}

}
