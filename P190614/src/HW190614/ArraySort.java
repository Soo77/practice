package HW190614;

import java.util.Arrays;

public class ArraySort {
	
	
	public static void main(String[] args) {
		int[] list = {400, 500, 300, 100, 200};
		
		ArraySort as = new ArraySort();
		as.sort(list, list.length);
	}
	
	private void sort(int[] list, int n) {

		int i, j, temp;

		  for(i=n-1; i>1; i--){
		    // 0 ~ (i-1)���� �ݺ�
		    for(j=0; j<i; j++){
		      // j��°�� j+1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
		      if(list[j]>list[j+1]){
		        temp = list[j];
		        list[j] = list[j+1];
		        list[j+1] = temp;
		      	}
		    }
		    System.out.println((n-i)+"ȸ�� ���"+Arrays.toString(list));
		  }
		
		
		
	}
	

	

}
