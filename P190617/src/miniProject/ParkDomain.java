package miniProject;

import java.util.Calendar;
import java.util.Date;

public class ParkDomain {
	
		private String carNum;//차량번호
		private Date inTime;//들어온시간
		private Date outTime;//나간시간
		
		public ParkDomain() {
			this.carNum = "";
			this.inTime = Calendar.getInstance().getTime();
//			this.outTime = Calendar.getInstance().getTime();
			this.outTime = inTime;
		}
		
		public String getCarNum() {
			return carNum;//this. 안써도됨.
		}
		
		public void setCarNum(String carNum) {
			this.carNum = carNum;// 이름이 같은것이 있으면 지역변수가 우선시되기떄문에 this를 써야함
		}
		
		public Date getInTime() {
			return inTime;
		}
		
		public void setInTime(Date inTime) {
			this.inTime = inTime;
		}
		
		public Date getOutTime() {
			return outTime;
		}
		
		public void setOutTime(Date outTime) {
			this.outTime = outTime;
		}
}
