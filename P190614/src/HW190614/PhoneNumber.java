package HW190614;

import java.util.Scanner;


//����1]
//����] N���� �̸��� ��ȭ��ȣ�� �Է��Ͽ� �迭�� �����ϰ�,
//����� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//  ---------------------------
//    ��üȸ����: 3 ��
//  ---------------------------
//  �� �� 		�� ȭ �� ȣ
//  ---------------------------
//  ȫ�浿		010-3311-4531
//  �̱浿		02-456-3771
//  �ڱ浿		010-5678-1234
//  ---------------------------
class PhoneNumberbook {

	private String name;
	private String number;

	
	
	public PhoneNumberbook(String name, String number) {
		this.setName(name);
		this.setNumber(number);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}
	
}

public class PhoneNumber {
	
	static int num = 0;
	
	private static PhoneNumberbook[] booklist =new PhoneNumberbook[100];
	
	public static void main(String[] args) {
		PhoneNumber pn = new PhoneNumber();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ������ ���? >>");
		num = sc.nextInt();
		
		
		for(int i=0; i<3; i++) {
			System.out.print("�̸�? >>");
			String name = sc.next();
			System.out.print("��ȭ��ȣ? >>");
			String number = sc.next();
			PhoneNumberbook book = new PhoneNumberbook(name, number);
			booklist[i] = book;
		}
		pn.show();
	}

	
	
	private void show() {
		System.out.println("------------------------");
		System.out.println("��üȸ����: "+num + "��");
		System.out.println("------------------------");
		System.out.println("�̸� \t ��ȭ��ȣ");
		System.out.println("------------------------");
		for(int i=0; i<num; i++)
		{
			System.out.println(booklist[i].getName() + "\t" + booklist[i].getNumber());
		}
		System.out.println("------------------------");
	}

}
