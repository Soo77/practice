import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class p0605 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String position = "과장";
		
//		switch(position) {
//			case "부장" :
//				System.out.println("700만원");
//				break;
//			case "과장" :
//				System.out.println("500만원");
//				break;
//			default :
//				System.out.println("300만원");
//		}
		
//		int ch = 0;
//		System.out.println("문자 한개를 입력하세요.");
//		ch = System.in.read();
//		
//		if(ch>='A' && ch<='Z') {
//			ch = (ch + 32);
//			System.out.println((char)ch);
//		} else if(ch>='a' && ch<='z') {
//			ch = (ch - 32);
//			System.out.println((char)ch);
//		}
		//[과제2] 레스토랑과제
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("===================");
		System.out.println("메뉴판\t      가격");
		System.out.println("===================");
		System.out.println("1. 피자 \t 8600원");
		System.out.println("2. 스파게티  15000원");
		System.out.println("3. 햄버거 \t 100000원");
		System.out.println("4. 스프 \t 5000원");
		System.out.println("5. 토마토 \t 3500원");
		System.out.println("6. 종료");
		
		System.out.print("숫자를 입력하여 메뉴를 골라주세요:");
		Scanner sc = new Scanner(System.in);
		int num;
		int pizza=8600, spa=15000, hamber=100000, soup=5000, tomato=3500;
		int p=0, s=0, h=0, sou=0, t = 0;
		int price = 0;
		
		while(true) {
			num = sc.nextInt();
			if(num==1) {
				System.out.println("피자를 선택하셨습니다.(6번을 누르면 종료.)");
				p++;
				price += pizza;
				
//				System.out.println("주문금액은 " + total + "입니다.");
			} else if(num==2) {
				System.out.println("스파게티를 선택하셨습니다.(6번을 누르면 종료.)");
				s++;
				price += spa;
//				System.out.println("주문금액은 " + total + "입니다.");
			} else if(num==3) {
				System.out.println("햄버거를 선택하셨습니다.(6번을 누르면 종료.)");
				h++;
				price += hamber;
//				System.out.println("주문금액은 " + total + "입니다.");
			} else if(num==4) {
				System.out.println("스프를 선택하셨습니다.(6번을 누르면 종료.)");
				sou++;
				price += soup;
//				System.out.println("주문금액은 " + total + "입니다.");
			} else if(num==5) {
				System.out.println("토마토를 선택하셨습니다.(6번을 누르면 종료.)");
				t++;
				price += tomato;
//				System.out.println("주문금액은 " + total + "입니다.");
			} else if(num==6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("숫자를 잘못입력하셨습니다.");
			}
		}
		int sum = p+s+h+sou+t;
		System.out.print("총 "+sum+"개");
//		if(sum!=0) {
//			if(p>0) {
//				System.out.print("피자 "+p+"개 ");
//			} else if(s>0) {
//				System.out.print("스파게티 "+s+"개 ");
//			} else if(h>0) {
//				System.out.print("햄버거 "+h+"개 ");
//			} else if(sou>0) {
//				System.out.print("스프 "+sou+"개 ");
//			} else if(t>0) {
//				System.out.print("토마토 "+t+"개");
//			} 
//		}
		String dfSu = df.format(price);
		System.out.print("주문하셔서 "+dfSu+"원 나왔습니다.");
		
		
		
//		switch(num) {
//			case 1:
//				System.out.println("피자를 선택하셨습니다.");
//				price = 8600;
//				System.out.println("주문금액은 " + price + "입니다.");
//				break;
//			case 2:
//				System.out.println("스파게티를 선택하셨습니다.");
//				price = 15000;
//				System.out.println("주문금액은 " + price + "입니다.");
//				break;
//			case 3:
//				System.out.println("햄버거를 선택하셨습니다.");
//				price = 100000;
//				System.out.println("주문금액은 " + price + "입니다.");
//				break;
//			case 4:
//				System.out.println("스프를 선택하셨습니다.");
//				price = 5000;
//				System.out.println("주문금액은 " + price + "입니다.");
//				break;
//			case 5:
//				System.out.println("토마토를 선택하셨습니다.");
//				price = 3500;
//				System.out.println("주문금액은 " + price + "입니다.");
//				break;
//			case 6:
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			default:
//				System.out.println("숫자를 잘못입력하셨습니다.");
//				break;
//		}

		
	}

}
