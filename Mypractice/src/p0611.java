import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Scanner;


public class p0611 {
	enum Week {
				//SUNDAY,
				MONDAY, //index=0
				TUESDAY, //index=1
				WEDNESDAY, //index=2
				THURSDAY, //index=3
				FRIDAY, //index=4
				SATURDAY, //index=5
				SUNDAY //index=6
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������(enum)
		//�����ͺ��̽� ������ �����Ҷ� ���.=>if������ ��Ű���
		
		
//		Week today = null;
//		Calendar cal = Calendar.getInstance();
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//		
//		switch(week) {
//		case 1: today = Week.SUNDAY; break;
//		case 2: today = Week.MONDAY; break;
//		case 3: today = Week.TUESDAY; break;
//		case 4: today = Week.WEDNESDAY; break;
//		case 5: today = Week.THURSDAY; break;
//		case 6: today = Week.FRIDAY; break;
//		case 7: today = Week.SATURDAY; break;
//		}
//		
//		System.out.println("������ " + today);
//	
//		if(today == Week.SUNDAY) {
//			System.out.println("�Ͽ����̴�~");
//		} else {
//			System.out.println("���Ͽ� �����մϴ�.");
//		}
		
		
//		//����.
//		//1. �Ź� ������
//		
//		
//		//Scanner + ���(ȭ�����, ��з�)
//		double num;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�Ǽ��� �Է��ϼ���.");
//		num = sc.nextDouble();
//		
//		DecimalFormat df = new DecimalFormat("###,###");
//		System.out.println(df.format(num));//������ ���´�.
//		
//		DecimalFormat df2 = new DecimalFormat("###,###.##");
//		System.out.println(df2.format(num));
//		
//		
//		
//		//ȭ��ǥ��
//		NumberFormat nf = NumberFormat.getCurrencyInstance();
//		System.out.println(nf.format(1000000000));
//		
//		//����� ǥ��
//		NumberFormat nf2 = NumberFormat.getPercentInstance();
//		System.out.println(nf2.format(0.23));
		
		//������ ������ üũ
		boolean bool;
		int i;
		double d;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ҹ�Ÿ���� �Է��ϼ���: ");
		bool = sc.nextBoolean();
		
		System.out.println("������ Ÿ���� �Է��ϼ���: ");
		i = sc.nextInt();
		
		System.out.println("�Ǽ��� �Է��ϼ���: ");
		d = sc.nextDouble();
		
		System.out.println("���ڿ��� �Է��ϼ���: ");
		str = sc.next();
		
		while(sc.hasNext()) {
			if(sc.hasNextBoolean()) {//�����Ͱ� �Ҹ����ΰ�?
				bool = sc.nextBoolean();
			} else if(sc.hasNextInt()) {//�������ΰ�?
				i = sc.nextInt();
			} else if(sc.hasNextDouble()) {//�Ǽ����ΰ�?
				d = sc.nextDouble();
			} else {
				str = sc.next(); //�������ΰ�?
			}
		}
		
		System.out.println("Bool: "+bool);
		System.out.println("Int:" +i);
		System.out.println("Double: "+d);
		System.out.println("String: "+str);
	}
	
}
