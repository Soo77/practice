import java.util.Calendar;

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
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println("������ " + today);
	
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ����̴�~");
		} else {
			System.out.println("���Ͽ� �����մϴ�.");
		}
	}

}
