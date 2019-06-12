package HW190612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw01 {
//과제1] 숫자 2개를 입력받아서, Number 클래스에 생성자로 전달하고, 반환하여 출력하되, getNumber메소드를 이용하여
	//출력하세요.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자를 입력하세요 >>");
		int n1 = Integer.parseInt(bf.readLine());
		System.out.print("두번째 숫자를 입력하세요 >>");
		int n2 = Integer.parseInt(bf.readLine());
		
		Number numbers = new Number(n1, n2);
		String str = numbers.getNumber();
		System.out.println(str);
	}

}
