package HW190612;

public class hw02 {
//����2] �⼷�� ������ ������ �����ϴ�. ���� 90��, ���� 90��, ���� 90���Դϴ�.
//	�� ������ ������ �� ���� �����ڸ� �̿��Ͽ� �����ϰ�, �� ���� �޼ҵ带 �̿��Ͽ� ����ϼ���.
	
	
	public static void main(String[] args) {
		ScoreKorea korea = new ScoreKorea(90);
		ScoreEng eng = new ScoreEng(90);
		ScoreMath math = new ScoreMath(90);
		
		korea.print();
		eng.print();
		math.print();
		
	}

}
