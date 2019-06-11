import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과제4] 두 수를 입력받고, 가감승제산을 하는 로직을 메소드를 이용하여 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 >>      ");
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
