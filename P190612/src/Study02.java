
public class Study02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1. ũ�Ⱑ 10�� �迭�� ����, 1~10���� ���� ä���, �� ���� �ڼ��� ����Ͻÿ�.
	//
	//ex) ������� �迭�� {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	//�̰� �������� ���� [5, 4, 3, 7, 9, 10, 1, 2, 6, 8,]���� ����Ͻÿ�.(����� �������� �޶��� �� ����)			
	//�׸��� �������� ���� �迭�� �ٽ� ������������ �����Ͽ� ����Ͻÿ�.
	//Arrays.toString(a) �迭�� ����ϴ� �޼ҵ� [a,b,c,e,d]
	//Arrays.sort(a);���� �޼ҵ�
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}//�迭�� 1���� 10���� ����.
		System.out.println("���� ��: "+java.util.Arrays.toString(arr));
		
		int temp, rand;
		for(int i=0; i<arr.length; i++) {
			rand = (int)(Math.random()*(arr.length-1))+1;
			System.out.println(rand);//rand ���� ������ ����غ���
			temp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = temp;
		}
		System.out.println("���� ��: "+java.util.Arrays.toString(arr));
		
		java.util.Arrays.sort(arr);
		System.out.println("�ٽ� ���� ��: "+java.util.Arrays.toString(arr));
	}

}
