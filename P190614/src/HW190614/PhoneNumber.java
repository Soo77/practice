package HW190614;

import java.util.Scanner;


//과제1]
//문제] N개의 이름과 전화번호를 입력하여 배열에 저장하고,
//저장된 내용을 출력하는 프로그램을 작성하세요.
//  ---------------------------
//    전체회원수: 3 명
//  ---------------------------
//  이 름 		전 화 번 호
//  ---------------------------
//  홍길동		010-3311-4531
//  이길동		02-456-3771
//  박길동		010-5678-1234
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
		System.out.print("회원수는 몇명? >>");
		num = sc.nextInt();
		
		
		for(int i=0; i<3; i++) {
			System.out.print("이름? >>");
			String name = sc.next();
			System.out.print("전화번호? >>");
			String number = sc.next();
			PhoneNumberbook book = new PhoneNumberbook(name, number);
			booklist[i] = book;
		}
		pn.show();
	}

	
	
	private void show() {
		System.out.println("------------------------");
		System.out.println("전체회원수: "+num + "명");
		System.out.println("------------------------");
		System.out.println("이름 \t 전화번호");
		System.out.println("------------------------");
		for(int i=0; i<num; i++)
		{
			System.out.println(booklist[i].getName() + "\t" + booklist[i].getNumber());
		}
		System.out.println("------------------------");
	}

}
