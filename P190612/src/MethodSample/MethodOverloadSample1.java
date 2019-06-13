package MethodSample;

public class MethodOverloadSample1 {

	
	
	private void add(int i, int j) {
		int sum = i + j;
		System.out.println(sum);
	}
	
	private void add(int i, int j, int k) {
		int sum2 = i*j*k;
		System.out.println(sum2);
	}
	
	private void str() {
		String msg = "방가방가";
		System.out.println(msg);
	}
	

	public static void main(String[] args) {
		MethodOverloadSample1 ms1 = new MethodOverloadSample1();
		MethodOverloadSample1 ms2 = new MethodOverloadSample1();
		MethodOverloadSample1 ms3 = new MethodOverloadSample1();
		MethodOverloadSample1 ms4 = new MethodOverloadSample1();
		
		
		ms1.add(1, 5);//add메소드 호출
		ms2.add(5, 7);
		ms3.add(1,2,3);
		ms4.str();
	}




	

}
