package MethodSample;


//����] �  ���� �ڽ��� ���ϴ� ���α׷��� �ۼ��ϼ���.
//1.���ȣ�� 2.�ݺ��� 3.�����ε�...
public class MethodOverloadSample2 {
	//�������� = ���Ἲ
	
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
		
		
		//static�� �ݵ�� �ʿ��մϴ�.
		System.out.println(square(2));
		System.out.println(square(4.0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	

}
