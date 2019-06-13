package MethodSample;


//문제] 어떤  수의 자승을 구하는 프로그램을 작성하세요.
//1.재귀호출 2.반복문 3.오버로딩...
public class MethodOverloadSample2 {
	//정보은닉 = 무결성
	
	private static int square(int i) {
		return i*i;
	}
	
	private static double square(double i) {
		return i*i;
	}
	
	
	public static void main(String[] args) {
		MethodOverloadSample2 mo = new MethodOverloadSample2();
		System.out.println(mo.square(100));
		System.out.println(mo.square(12.3456));
		
		
		//static이 반드시 필요합니다.
		System.out.println(square(2));
		System.out.println(square(4.0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	

}
