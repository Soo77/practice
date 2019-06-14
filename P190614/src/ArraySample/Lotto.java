package ArraySample;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		//로또복권(1~45)

		//System.out.println(lotto());
		lotto();
	}

	private static void lotto() {

		int[] lottoArr = new int[6];
		for(int i=0; i<lottoArr.length; i++) {
			lottoArr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lottoArr[i]==lottoArr[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lottoArr));
		//return Arrays.toString(lottoArr);
	}
}
