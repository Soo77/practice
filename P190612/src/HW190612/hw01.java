package HW190612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw01 {
//����1] ���� 2���� �Է¹޾Ƽ�, Number Ŭ������ �����ڷ� �����ϰ�, ��ȯ�Ͽ� ����ϵ�, getNumber�޼ҵ带 �̿��Ͽ�
	//����ϼ���.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° ���ڸ� �Է��ϼ��� >>");
		int n1 = Integer.parseInt(bf.readLine());
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� >>");
		int n2 = Integer.parseInt(bf.readLine());
		
		Number numbers = new Number(n1, n2);
		String str = numbers.getNumber();
		System.out.println(str);
	}

}
