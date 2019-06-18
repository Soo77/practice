package miniProject;

import java.util.Random;

public class ParkEx {//실질적으로 구동하는 클래스
	
	public static void main(String[] args) { 
		ParkDomain park = new ParkDomain();
		System.out.println(park.getOutTime());
		
		Random rand = new Random();
		int myNum = rand.nextInt(45) + 1;
		System.out.println(myNum);
	}
	
}
