package ArraySample;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int numList[] = {123, 567, 20, 12, 24, 56, 4567, 15, 
				547, 2589};
		int max = numList[0];
		for(int i=1; i<numList.length; i++) {
			if(max < numList[i]) {
				max = numList[i];
			}
		}
		int min = numList[0];
		for(int i=1; i<numList.length; i++) {
			if(min > numList[i]) {
				min = numList[i];
			}
		}
		System.out.println("�ִ�: "+ max +", �ּڰ�: " + min);
	}

}
