package HW190612;

public class hw02 {
//과제2] 기섭의 점수가 다음과 같습니다. 국어 90점, 영어 90점, 수학 90점입니다.
//	세 과목의 점수를 각 과목별 생성자를 이용하여 저장하고, 각 과목별 메소드를 이용하여 출력하세요.
	
	
	public static void main(String[] args) {
		ScoreKorea korea = new ScoreKorea(90);
		ScoreEng eng = new ScoreEng(90);
		ScoreMath math = new ScoreMath(90);
		
		korea.print();
		eng.print();
		math.print();
		
	}

}
