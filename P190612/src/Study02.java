import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//1. ũ�Ⱑ 10�� �迭�� ����, 1~10���� ���� ä���, �� ���� �ڼ��� ����Ͻÿ�.
	//
	//ex) ������� �迭�� {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	//�̰� �������� ���� [5, 4, 3, 7, 9, 10, 1, 2, 6, 8,]���� ����Ͻÿ�.(����� �������� �޶��� �� ����)			
	//�׸��� �������� ���� �迭�� �ٽ� ������������ �����Ͽ� ����Ͻÿ�.
	//Arrays.toString(a) �迭�� ����ϴ� �޼ҵ� [a,b,c,e,d]
	//Arrays.sort(a);���� �޼ҵ�
		
//		int[] arr = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=i+1;
//		}//�迭�� 1���� 10���� ����.
//		System.out.println("���� ��: "+java.util.Arrays.toString(arr));
//		
//		int temp, rand;
//		for(int i=0; i<arr.length; i++) {
//			rand = (int)(Math.random()*(arr.length-1))+1;
//			System.out.println(rand);//rand ���� ������ ����غ���
//			temp = arr[i];
//			arr[i] = arr[rand];
//			arr[rand] = temp;
//		}
//		System.out.println("���� ��: "+java.util.Arrays.toString(arr));
//		
//		java.util.Arrays.sort(arr);
//		System.out.println("�ٽ� ���� ��: "+java.util.Arrays.toString(arr));
	
	
	
	
//		2. ���ڿ��� �Է¹޾� ȸ���������� Ȯ���ϰ�, �ƴ϶�� ���ڸ� ������ ����Ͻÿ�.
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String str;
//		System.out.print("���ڿ��� �Է��ϼ��� >>");
//		str = bf.readLine();
//		
//		System.out.println(str);
//		
//		char[] arr = null;
//		arr = str.toCharArray();//���ڿ��� �迭�� ����
//		//System.out.println(java.util.Arrays.toString(arr));
//		
//		char temp;
//		int mid = (int)(arr.length/2);
//		
//		for(int i=0; i<mid; i++) {
//			if(arr[i] != arr[arr.length-i-1]) {
//				System.out.println("ȸ���� �ƴմϴ�. ���ڸ� ����� ����մϴ�.");
//				
//				for(int j=0; j<mid; j++) {
//					temp = arr[j];
//					arr[j] = arr[arr.length-j-1];
//					arr[arr.length-j-1]=temp;
//				}
//				System.out.print("���ڸ� ������ ��: ");
//				for(int j=0; j<arr.length; j++) {
//					System.out.print(arr[j]);
//				}
//				break;
//
//			} else {
//				System.out.println("ȸ���Դϴ�.");
//				break;
//			}
//		}
		
		
		
//		3. while ���� Ȱ���� ������ ���� ����Ͻÿ�.
//		12345
//		12345
//		12345
//		12345
//		12345
//		int i=0;
//		while(i<5) {
//			System.out.println("12345");
//			i++;
//		}
	
	
	
//		4. while ���� Ȱ���� ������ ���� ����Ͻÿ�.
//		12345
//		23456
//		34567
//		45678
//		56789
//		System.out.println("���");
		int i=0;
		int j=0;
		while(i<5) {
			j=i+1;
			while(j<=i+5) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
//		for(int i=0; i<5; i++) {
//			for(int j=i+1; j<=i+5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
