package ArraySample;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum =0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: "+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균: "+avg);
		
		//합계구하는 부분을 메소드로 대체하여 구현해보세요.
		System.out.println("\n=== Method Implementation ===");
		Sum(scores);
	}

	private static void Sum(int[] scores) {
		int i;
		int sum=0;
		for(i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("합계는: "+sum);
		
	}

	
	//1차원 배열에 1~10까지의 데이터를 저장하고,그 중에서 짝수의 데이터의 합을 구하세요.
	
}
