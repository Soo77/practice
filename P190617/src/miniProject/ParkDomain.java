package miniProject;

import java.util.Calendar;
import java.util.Date;

public class ParkDomain {
	
		private String carNum;//������ȣ
		private Date inTime;//���½ð�
		private Date outTime;//�����ð�
		
		public ParkDomain() {
			this.carNum = "";
			this.inTime = Calendar.getInstance().getTime();
//			this.outTime = Calendar.getInstance().getTime();
			this.outTime = inTime;
		}
		
		public String getCarNum() {
			return carNum;//this. �Ƚᵵ��.
		}
		
		public void setCarNum(String carNum) {
			this.carNum = carNum;// �̸��� �������� ������ ���������� �켱�õǱ⋚���� this�� �����
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
