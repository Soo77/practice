
public class Study02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1. 크기가 10인 배열을 만들어서, 1~10까지 값을 채우고, 그 값을 뒤섞어 출력하시오.
	//
	//ex) 만들어질 배열은 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	//이걸 무작위로 섞어 [5, 4, 3, 7, 9, 10, 1, 2, 6, 8,]같이 출력하시오.(결과는 무작위로 달라질 수 있음)			
	//그리고 무작위로 섞인 배열을 다시 오름차순으로 정렬하여 출력하시오.
	//Arrays.toString(a) 배열로 출력하는 메소드 [a,b,c,e,d]
	//Arrays.sort(a);정렬 메소드
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}//배열에 1부터 10까지 저장.
		System.out.println("섞기 전: "+java.util.Arrays.toString(arr));
		
		int temp, rand;
		for(int i=0; i<arr.length; i++) {
			rand = (int)(Math.random()*(arr.length-1))+1;
			System.out.println(rand);//rand 뭐가 나오나 출력해보기
			temp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = temp;
		}
		System.out.println("섞은 후: "+java.util.Arrays.toString(arr));
		
		java.util.Arrays.sort(arr);
		System.out.println("다시 정렬 후: "+java.util.Arrays.toString(arr));
	}

}
