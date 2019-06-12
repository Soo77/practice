import java.util.Scanner;

class Calc {
	static void Add(int num1, double num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
	
	static void Mul(int num1, double num2) {
		System.out.printf("%d * %f = %.3f\n", num1, num2, num1*num2);
	}
	
	static void Min(int num1, double num2) {
		System.out.printf("%d - %f = %.3f\n", num1, num2, num1-num2);
	}

	static void Div(int num1, double num2) {
		System.out.printf("%d / %f = %.3f\n", num1, num2, num1/num2);
	}

	public static int fivo(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int a=0;
		int b=1;
		int c=1;
		for(int i=0; i<n-2; i++) {
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}

	public static int pactorial(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1) 
			return 1;
		else 
			return n*pactorial(n-1);
	}
}

public class p190612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
//		System.out.print("���� �Ѱ��� �Ǽ� �Ѱ� �Է� >>");
//		int num1 = sc.nextInt();
//		double num2 = sc.nextDouble();
//		
//		Calc.Add(num1, num2);
//		Calc.Mul(num1, num2);
//		Calc.Div(num1, num2);
//		Calc.Min(num1, num2);
		
		//�Ǻ���ġ ������ ����� ���
//		System.out.print("�Ǻ���ġ ������ ����� ���� �Է� >> ");
//		int num = sc.nextInt();
//		System.out.println(Calc.fivo(num));
		
		//���丮�� ���� ���
		System.out.println("���丮�� ����� �� �Է�>> ");
		int num = sc.nextInt();
		System.out.println(Calc.pactorial(num));
	}

	

}
