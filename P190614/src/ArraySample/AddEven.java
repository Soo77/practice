package ArraySample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//1���� �迭�� 1~10������ �����͸� �����ϰ�,�� �߿��� ¦���� �������� ���� ���ϼ���.


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
//		System.out.println("¦���������� ����: "+sum);
//	
//	
//	
//		//���� ������ ó��
//		String[] movies = {"�丣", "�����̸�", "���������", "���� ���� ����ο�", "X-Man"};
//		System.out.println("�迭�� ����: "+movies.length);
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
//			System.out.println(movies[cnt]+":" + years[cnt]+"�⵵��");
//		}
		
		//�迭 A�� ������ ���ڸ� �Է��ϰ�, �� �߿��� 3�� ����̸鼭 4�ǹ���� �Ǵ� ���� ������ ���ϼ���.
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
//		System.out.println("3�� ����̸鼭 4�ǹ���� �Ǵ� ���� ����: "+cnt);
	
		//N���� ������ �Է¹޾Ƽ� �迭�� �����ϰ�, �� �������߿��� ����ū����
//		���Ͽ� ����ϼ���
	
	
//		System.out.print("��� ���� �迭�� �����ұ��? >>");
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
//		System.out.println("�ִ�: "+max);
	
		
		
		//����] n���� 1���� �迭�� �����մϴ�. ����, ����, ���� ������ 
		// �޼ҵ带 �̿��Ͽ� �Է��ϰ�
		// ������ ����� ���ϴ� �κ��� �޼ҵ带 �̿��Ͽ� ó���ϰ�, ��µǵ���
		//������ �ϼ��ϼ���.
		
//		System.out.println("���� ���� ���� ������ �Է��ϼ���.");
//		inputScore();
//		Sum();
//		Avg();
		
		
		//������ �߿��� ���ϴ� ���� �迭�� �����ϰ�, ����ϴ� ���α׷�.
		int[] arr = new int[9];
		System.out.print("���ϴ� ��? >>");
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
		System.out.println("���: "+avg);
	}

	private static void Sum() {
		System.out.println("�հ�: "+(kor+eng+math));
	}

	private static void inputScore() {
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
	}


	
	

		
	

	

}
