package HWanswer;

import java.text.DecimalFormat;
import java.util.Scanner;

//과제2] 기섭의 점수가 다음과 같습니다. 국어 90점, 영어 90점, 수학 90점입니다.
//	세 과목의 점수를 각 과목별 생성자를 이용하여 저장하고, 각 과목별 메소드를 이용하여 출력하세요.
// 번호 이름 국어 영어 수학 총점 평균	

class Count {
	private int number;

	public Count(int number) {//첨값 입력받움
		this.number = number;
	}
	
	public int Cn() {
		return number++;//첫번째사람은 1번 두번째사람은 2번..//첨 값에다가 1씩더함
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
		
		System.out.println("번호 이름 국어 영어 수학 점수를 입력하세요!");
		int number = sc.nextInt();//학번 번호
		String name = sc.next(); //이름
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		//title 출력
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("--------------------------------------------------------");
		
		//생성자에게 데이터를 넘겨주는 루틴(데이터 저장)
		Count Num = new Count(number);
		NameData Name = new NameData(name);
		korData Kor = new korData(kor);
		engData Eng = new engData(eng);
		mathData Math = new mathData(math);
		
		
		//연산 루틴
		DecimalFormat df = new DecimalFormat("#.##"); 
		int sum = Kor.printKor() + Eng.printEng() + Math.printMath();
		double ave = sum / 3.0;
		String average = df.format(ave);
		
		//성적처리 내용 출력 
		String str = Num.Cn() + "\t" + Name.printName() + "\t" +
		Kor.printKor() + "\t" + Eng.printEng() + "\t" +
		Math.printMath() + "\t" + sum + "\t" + average;
	
		System.out.println(str);
	}

}
