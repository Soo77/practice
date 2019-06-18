
public class ex02 {
	
	private static final int SIZE = 5;
	
	public static void main(String[] args) {

		
		String[] arrStrings = new String[SIZE];
		arrStrings[0] = "aaa";
		arrStrings[1] = "bbb";
		arrStrings[2] = "ccc";
		arrStrings[3] = "ddd";
		arrStrings[4] = "eee";
//		for(int i=0; i<arrStrings.length; i++) {
//			System.out.println(arrStrings[i]);
//		}
		for(String str : arrStrings) {
			str+=2;
		}
		
		for(String str : arrStrings) {
			System.out.println(str);
		}
		
		int[][] arrInt = new int[3][];
		arrInt[0] = new int[4];
		arrInt[1] = new int[5];
		arrInt[2] = new int[6];
		
		int count = 1;
		for(int i=0; i<arrInt.length; i++) {
			for(int j=0; j<arrInt[i].length; j++) {
				arrInt[i][j] = count;
				count++;
			}
		}
		
		
		for(int[] arr : arrInt) {
			for(int i : arr) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}
