package ArraySample;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum =0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����: "+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("���: "+avg);
		
		//�հ豸�ϴ� �κ��� �޼ҵ�� ��ü�Ͽ� �����غ�����.
		System.out.println("\n=== Method Implementation ===");
		Sum(scores);
	}

	private static void Sum(int[] scores) {
		int i;
		int sum=0;
		for(i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("�հ��: "+sum);
		
	}

	
	//1���� �迭�� 1~10������ �����͸� �����ϰ�,�� �߿��� ¦���� �������� ���� ���ϼ���.
	
}
