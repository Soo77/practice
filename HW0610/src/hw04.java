import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����4] �� ���� �Է¹ް�, ������������ �ϴ� ������ �޼ҵ带 �̿��Ͽ� �ۼ��ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ��� >>      ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1+"+"+num2+"="+Add(num1,num2));
		System.out.println(num1+"-"+num2+"="+Min(num1,num2));
		System.out.println(num1+"*"+num2+"="+Mul(num1,num2));
		System.out.println(num1+"/"+num2+"="+Div(num1,num2));
	}

	private static int Div(int num1, int num2) {
		int result = num1/num2;
		return result;
	}

	private static int Mul(int num1, int num2) {
		int result = num1*num2;
		return result;
	}

	private static int Min(int num1, int num2) {
		int result = num1-num2;
		return result;
	}

	private static int Add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	

}
