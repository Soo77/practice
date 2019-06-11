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

		//열거형(enum)
		//데이터베이스 데이터 관리할때 사용.=>if문으로 대신가능
		
		
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
//		System.out.println("오늘은 " + today);
//	
//		if(today == Week.SUNDAY) {
//			System.out.println("일요일이다~");
//		} else {
//			System.out.println("평일엔 공부합니다.");
//		}
		
		
//		//사용법.
//		//1. 신발 데이터
//		
//		
//		//Scanner + 출력(화폐단위, 백분률)
//		double num;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("실수를 입력하세요.");
//		num = sc.nextDouble();
//		
//		DecimalFormat df = new DecimalFormat("###,###");
//		System.out.println(df.format(num));//정수로 나온다.
//		
//		DecimalFormat df2 = new DecimalFormat("###,###.##");
//		System.out.println(df2.format(num));
//		
//		
//		
//		//화폐표시
//		NumberFormat nf = NumberFormat.getCurrencyInstance();
//		System.out.println(nf.format(1000000000));
//		
//		//백분율 표시
//		NumberFormat nf2 = NumberFormat.getPercentInstance();
//		System.out.println(nf2.format(0.23));
		
		//데이터 종류별 체크
		boolean bool;
		int i;
		double d;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("불린타입을 입력하세요: ");
		bool = sc.nextBoolean();
		
		System.out.println("정수형 타입을 입력하세요: ");
		i = sc.nextInt();
		
		System.out.println("실수를 입력하세요: ");
		d = sc.nextDouble();
		
		System.out.println("문자열을 입력하세요: ");
		str = sc.next();
		
		while(sc.hasNext()) {
			if(sc.hasNextBoolean()) {//데이터가 불린형인가?
				bool = sc.nextBoolean();
			} else if(sc.hasNextInt()) {//정수형인가?
				i = sc.nextInt();
			} else if(sc.hasNextDouble()) {//실수형인가?
				d = sc.nextDouble();
			} else {
				str = sc.next(); //문자형인가?
			}
		}
		
		System.out.println("Bool: "+bool);
		System.out.println("Int:" +i);
		System.out.println("Double: "+d);
		System.out.println("String: "+str);
	}
	
}
