package miniProject;

import java.util.Random;

public class ParkEx {//���������� �����ϴ� Ŭ����
	
	public static void main(String[] args) { 
		ParkDomain park = new ParkDomain();
		System.out.println(park.getOutTime());
		
		Random rand = new Random();
		int myNum = rand.nextInt(45) + 1;
		System.out.println(myNum);
	}
	
}
