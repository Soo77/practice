package MethodSample;

import java.util.Scanner;

//생성자 오버로딩: 생성자를 같은 이름으로 다른 기능을 구현 하는 것.
//메소드 오버로딩: 메소드가 같은 이름으로 다른 기능을 구현 하는 것.
//특성: 자료형이나 자료의 갯수가 다르면 오버로딩이 가능합니다.


class OverLoad {
	
	 static int kor;//private에 접근하려면 반드시 메소드로 
	 static double eng;
	 static int math;
	private String score;

	public OverLoad() {//인자값이 없는 생성자 = default 생성자
		
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
		
		//Overloading 준비단계
		OverLoad ol1 = new OverLoad();
		OverLoad ol2 = new OverLoad(kor);//국어점수 입력
		OverLoad ol3 = new OverLoad(eng);//영어점수 입력
		OverLoad ol4 = new OverLoad(kor, eng);//국어, 영어점수 입력
		OverLoad ol5 = new OverLoad(kor, math);//국어, 수학점수 입력
		OverLoad ol6 = new OverLoad(score);//학점
		OverLoad ol7 = new OverLoad(kor, score);//국어점수와 학점
		OverLoad ol8 = new OverLoad(kor, eng , math);//국어 영어 수학점수 입력
		OverLoad ol9 = new OverLoad(kor, eng, math, score);//국어 영어 수학 학점 점수 입력
		
		System.out.println("===== 생성자 오버로딩 출력 =====");
		
		System.out.println("===== 1. Object를 이용한 클래스 변수 값 출력 =====");
		System.out.println("정수형 데이터 2개 출력: " + ol5.kor+ ol5.math);
		
		System.out.println("===== 2. ClassName을 이용하여 클래스변수 값 출력 =====");
		System.out.println(OverLoad.kor);
		System.out.println(OverLoad.eng);
		System.out.println(OverLoad.math);
		
		
		
//문제] 이름과 나이를 입력받아서, 생성자를 이용하여 저장하고, 출력해보세요.
//	Object를 이용한 클래스 변수값 출력, ClassName을 이용하여 클래스변수 값 출력
		
		
	}

}
