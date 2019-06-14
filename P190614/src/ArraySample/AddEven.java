package ArraySample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//1차원 배열에 1~10까지의 데이터를 저장하고,그 중에서 짝수의 데이터의 합을 구하세요.


public class AddEven {
	static Scanner sc = new Scanner(System.in);
	private static int kor;
	private static int eng;
	private static int math;
	
	public static void main(String[] args) {

//		int[] arr = new int[10];
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2==0) {
//				sum += arr[i];
//			}
//		}
//		System.out.println("짝수데이터의 합은: "+sum);
//	
//	
//	
//		//문자 데이터 처리
//		String[] movies = {"토르", "맘마미마", "레미제라블", "엣지 오브 투모로우", "X-Man"};
//		System.out.println("배열의 갯수: "+movies.length);
//		int[] years = {2010, 1999, 2012, 2014, 2014};
//		
//		int cnt=-1;
//		
//		while(true) {
//			cnt++;
//			System.out.println(movies[cnt]);
//			
//			if(cnt==movies.length-1) {
//				break;
//			}
//		}
//	
//	
//		System.out.println();
//		cnt=-1;
//		while(cnt <movies.length-1) {
//			cnt++;
//			System.out.println(movies[cnt]+":" + years[cnt]+"년도판");
//		}
		
		//배열 A에 임의의 숫자를 입력하고, 그 중에서 3의 배수이면서 4의배수가 되는 수의 개수를 구하세요.
//		
//		
//		int[] arr = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//	
//	
//		
//		int cnt=0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%3==0 && arr[i]%4==0) {
//				cnt++;
//				System.out.println(arr[i]);
//			}
//		}
//		System.out.println("3의 배수이면서 4의배수가 되는 수의 개수: "+cnt);
	
		//N개의 정수를 입력받아서 배열에 저장하고, 그 데이터중에서 가장큰값을
//		구하여 출력하세요
	
	
//		System.out.print("몇개의 값을 배열에 저장할까요? >>");
//		String str = sc.nextLine();
//		int num = Integer.parseInt(str);
//		
//		int[] arr = new int[num];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));//
//	
//	
//		
//		int max=arr[0];
//		for(int i=1; i<arr.length; i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println("최댓값: "+max);
	
		
		
		//문제] n개의 1차원 배열이 존재합니다. 국어, 영어, 수학 점수를 
		// 메소드를 이용하여 입력하고
		// 총점과 평균을 구하는 부분은 메소드를 이용하여 처리하고, 출력되도록
		//로직을 완성하세요.
		
//		System.out.println("국어 영어 수학 점수를 입력하세요.");
//		inputScore();
//		Sum();
//		Avg();
		
		
		//구구단 중에서 원하는 단을 배열에 저장하고, 출력하는 프로그램.
		int[] arr = new int[9];
		System.out.print("원하는 단? >>");
		int num = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			arr[i] = num*(i+1);
		}
		for(int i=0; i<9; i++) {
			System.out.println(num + "x" + (i+1) + "="+ arr[i]);
		}
	}

	private static void Avg() {
		double avg = (kor+eng+math)/3;
		System.out.println("평균: "+avg);
	}

	private static void Sum() {
		System.out.println("합계: "+(kor+eng+math));
	}

	private static void inputScore() {
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
	}


	
	

		
	

	

}
