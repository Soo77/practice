import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//1. 크기가 10인 배열을 만들어서, 1~10까지 값을 채우고, 그 값을 뒤섞어 출력하시오.
	//
	//ex) 만들어질 배열은 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	//이걸 무작위로 섞어 [5, 4, 3, 7, 9, 10, 1, 2, 6, 8,]같이 출력하시오.(결과는 무작위로 달라질 수 있음)			
	//그리고 무작위로 섞인 배열을 다시 오름차순으로 정렬하여 출력하시오.
	//Arrays.toString(a) 배열로 출력하는 메소드 [a,b,c,e,d]
	//Arrays.sort(a);정렬 메소드
		
//		int[] arr = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=i+1;
//		}//배열에 1부터 10까지 저장.
//		System.out.println("섞기 전: "+java.util.Arrays.toString(arr));
//		
//		int temp, rand;
//		for(int i=0; i<arr.length; i++) {
//			rand = (int)(Math.random()*(arr.length-1))+1;
//			System.out.println(rand);//rand 뭐가 나오나 출력해보기
//			temp = arr[i];
//			arr[i] = arr[rand];
//			arr[rand] = temp;
//		}
//		System.out.println("섞은 후: "+java.util.Arrays.toString(arr));
//		
//		java.util.Arrays.sort(arr);
//		System.out.println("다시 정렬 후: "+java.util.Arrays.toString(arr));
	
	
	
	
//		2. 문자열을 입력받아 회문문자인지 확인하고, 아니라면 문자를 뒤집어 출력하시오.
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String str;
//		System.out.print("문자열을 입력하세요 >>");
//		str = bf.readLine();
//		
//		System.out.println(str);
//		
//		char[] arr = null;
//		arr = str.toCharArray();//문자열을 배열로 변경
//		//System.out.println(java.util.Arrays.toString(arr));
//		
//		char temp;
//		int mid = (int)(arr.length/2);
//		
//		for(int i=0; i<mid; i++) {
//			if(arr[i] != arr[arr.length-i-1]) {
//				System.out.println("회문이 아닙니다. 문자를 뒤집어서 출력합니다.");
//				
//				for(int j=0; j<mid; j++) {
//					temp = arr[j];
//					arr[j] = arr[arr.length-j-1];
//					arr[arr.length-j-1]=temp;
//				}
//				System.out.print("문자를 뒤집은 후: ");
//				for(int j=0; j<arr.length; j++) {
//					System.out.print(arr[j]);
//				}
//				break;
//
//			} else {
//				System.out.println("회문입니다.");
//				break;
//			}
//		}
		
		
		
//		3. while 문을 활용해 다음의 값을 출력하시오.
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
	
	
	
//		4. while 문을 활용해 다음의 값을 출력하시오.
//		12345
//		23456
//		34567
//		45678
//		56789
//		System.out.println("출력");
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
