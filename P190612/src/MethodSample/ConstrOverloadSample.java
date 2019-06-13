package MethodSample;

import java.util.Scanner;

//������ �����ε�: �����ڸ� ���� �̸����� �ٸ� ����� ���� �ϴ� ��.
//�޼ҵ� �����ε�: �޼ҵ尡 ���� �̸����� �ٸ� ����� ���� �ϴ� ��.
//Ư��: �ڷ����̳� �ڷ��� ������ �ٸ��� �����ε��� �����մϴ�.


class OverLoad {
	
	 static int kor;//private�� �����Ϸ��� �ݵ�� �޼ҵ�� 
	 static double eng;
	 static int math;
	private String score;

	public OverLoad() {//���ڰ��� ���� ������ = default ������
		
	}

	public OverLoad(int x) {
		this.kor = x;
	}

	public OverLoad(double y) {
		this.eng = y;
	}

	public OverLoad(int x, double y) {
		this.kor = x;
		this.eng = y;
	}

	public OverLoad(String str) {
		this.score = str;
	}

	public OverLoad(int x, String str) {
		this.kor= x;
		this.score = str;
	}

	public OverLoad(int x, double y, int z) {
		this.kor = x;
		this.eng = y;
		this.math = z;
		
	}

	public OverLoad(int x, double y, int z, String str) {
		this.kor = x;
		this.eng = y;
		this.math = z;
		this.score = str;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
	
}







public class ConstrOverloadSample {

		
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		double eng = sc.nextDouble();
		int math = sc.nextInt();
		String score = sc.next();
		
		//Overloading �غ�ܰ�
		OverLoad ol1 = new OverLoad();
		OverLoad ol2 = new OverLoad(kor);//�������� �Է�
		OverLoad ol3 = new OverLoad(eng);//�������� �Է�
		OverLoad ol4 = new OverLoad(kor, eng);//����, �������� �Է�
		OverLoad ol5 = new OverLoad(kor, math);//����, �������� �Է�
		OverLoad ol6 = new OverLoad(score);//����
		OverLoad ol7 = new OverLoad(kor, score);//���������� ����
		OverLoad ol8 = new OverLoad(kor, eng , math);//���� ���� �������� �Է�
		OverLoad ol9 = new OverLoad(kor, eng, math, score);//���� ���� ���� ���� ���� �Է�
		
		System.out.println("===== ������ �����ε� ��� =====");
		
		System.out.println("===== 1. Object�� �̿��� Ŭ���� ���� �� ��� =====");
		System.out.println("������ ������ 2�� ���: " + ol5.kor+ ol5.math);
		
		System.out.println("===== 2. ClassName�� �̿��Ͽ� Ŭ�������� �� ��� =====");
		System.out.println(OverLoad.kor);
		System.out.println(OverLoad.eng);
		System.out.println(OverLoad.math);
		
		
		
//����] �̸��� ���̸� �Է¹޾Ƽ�, �����ڸ� �̿��Ͽ� �����ϰ�, ����غ�����.
//	Object�� �̿��� Ŭ���� ������ ���, ClassName�� �̿��Ͽ� Ŭ�������� �� ���
		
		
	}

}
