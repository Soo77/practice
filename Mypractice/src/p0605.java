import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class p0605 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String position = "����";
		
//		switch(position) {
//			case "����" :
//				System.out.println("700����");
//				break;
//			case "����" :
//				System.out.println("500����");
//				break;
//			default :
//				System.out.println("300����");
//		}
		
//		int ch = 0;
//		System.out.println("���� �Ѱ��� �Է��ϼ���.");
//		ch = System.in.read();
//		
//		if(ch>='A' && ch<='Z') {
//			ch = (ch + 32);
//			System.out.println((char)ch);
//		} else if(ch>='a' && ch<='z') {
//			ch = (ch - 32);
//			System.out.println((char)ch);
//		}
		//[����2] �����������
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("===================");
		System.out.println("�޴���\t      ����");
		System.out.println("===================");
		System.out.println("1. ���� \t 8600��");
		System.out.println("2. ���İ�Ƽ  15000��");
		System.out.println("3. �ܹ��� \t 100000��");
		System.out.println("4. ���� \t 5000��");
		System.out.println("5. �丶�� \t 3500��");
		System.out.println("6. ����");
		
		System.out.print("���ڸ� �Է��Ͽ� �޴��� ����ּ���:");
		Scanner sc = new Scanner(System.in);
		int num;
		int pizza=8600, spa=15000, hamber=100000, soup=5000, tomato=3500;
		int p=0, s=0, h=0, sou=0, t = 0;
		int price = 0;
		
		while(true) {
			num = sc.nextInt();
			if(num==1) {
				System.out.println("���ڸ� �����ϼ̽��ϴ�.(6���� ������ ����.)");
				p++;
				price += pizza;
				
//				System.out.println("�ֹ��ݾ��� " + total + "�Դϴ�.");
			} else if(num==2) {
				System.out.println("���İ�Ƽ�� �����ϼ̽��ϴ�.(6���� ������ ����.)");
				s++;
				price += spa;
//				System.out.println("�ֹ��ݾ��� " + total + "�Դϴ�.");
			} else if(num==3) {
				System.out.println("�ܹ��Ÿ� �����ϼ̽��ϴ�.(6���� ������ ����.)");
				h++;
				price += hamber;
//				System.out.println("�ֹ��ݾ��� " + total + "�Դϴ�.");
			} else if(num==4) {
				System.out.println("������ �����ϼ̽��ϴ�.(6���� ������ ����.)");
				sou++;
				price += soup;
//				System.out.println("�ֹ��ݾ��� " + total + "�Դϴ�.");
			} else if(num==5) {
				System.out.println("�丶�並 �����ϼ̽��ϴ�.(6���� ������ ����.)");
				t++;
				price += tomato;
//				System.out.println("�ֹ��ݾ��� " + total + "�Դϴ�.");
			} else if(num==6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.");
			}
		}
		int sum = p+s+h+sou+t;
		System.out.print("�� "+sum+"��");
//		if(sum!=0) {
//			if(p>0) {
//				System.out.print("���� "+p+"�� ");
//			} else if(s>0) {
//				System.out.print("���İ�Ƽ "+s+"�� ");
//			} else if(h>0) {
//				System.out.print("�ܹ��� "+h+"�� ");
//			} else if(sou>0) {
//				System.out.print("���� "+sou+"�� ");
//			} else if(t>0) {
//				System.out.print("�丶�� "+t+"��");
//			} 
//		}
		String dfSu = df.format(price);
		System.out.print("�ֹ��ϼż� "+dfSu+"�� ���Խ��ϴ�.");
		
		
		
//		switch(num) {
//			case 1:
//				System.out.println("���ڸ� �����ϼ̽��ϴ�.");
//				price = 8600;
//				System.out.println("�ֹ��ݾ��� " + price + "�Դϴ�.");
//				break;
//			case 2:
//				System.out.println("���İ�Ƽ�� �����ϼ̽��ϴ�.");
//				price = 15000;
//				System.out.println("�ֹ��ݾ��� " + price + "�Դϴ�.");
//				break;
//			case 3:
//				System.out.println("�ܹ��Ÿ� �����ϼ̽��ϴ�.");
//				price = 100000;
//				System.out.println("�ֹ��ݾ��� " + price + "�Դϴ�.");
//				break;
//			case 4:
//				System.out.println("������ �����ϼ̽��ϴ�.");
//				price = 5000;
//				System.out.println("�ֹ��ݾ��� " + price + "�Դϴ�.");
//				break;
//			case 5:
//				System.out.println("�丶�並 �����ϼ̽��ϴ�.");
//				price = 3500;
//				System.out.println("�ֹ��ݾ��� " + price + "�Դϴ�.");
//				break;
//			case 6:
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			default:
//				System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.");
//				break;
//		}

		
	}

}
