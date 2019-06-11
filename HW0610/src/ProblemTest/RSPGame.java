package ProblemTest;

import java.util.Random;
import java.util.Scanner;

public class RSPGame {
	
	public RSPGame() {
		
	}//디폴트생성자
	
	public RSPGame(int x) {
		
	}//인자가 한개있는 생성자
	
	
	
	public void inputData() {
		int retry=1;
		while(retry==1) {
			System.out.println("1:가위 2:바위 3:보 뭐 낼까?");
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			
			Random rand = new Random();
			int comp = rand.nextInt(3)+1;
			if(comp==1) {
				System.out.println("컴퓨터: 가위");
			} else if(comp==2) {
				System.out.println("컴퓨터: 바위");
			} else if(comp==3) {
				System.out.println("컴퓨터: 보");
			}
			
			if(user==comp) {
				System.out.println("비겼습니다.");
			} else if((user==1 && comp==2)||(user==2 && comp==3)||
					(user==3 && comp==1)) {
				System.out.println("졌습니다.");
			} else if((user==1 && comp==3)||(user==2 && comp==1)||
					(user==3 && comp==2)){
				System.out.println("이겼습니다!");
			} else {
				System.out.println("1,2,3 중 하나만 고르세요.");
			}
			System.out.println();
			System.out.println("다시하시겠습니까? Yes:1 No:0");
			retry = sc.nextInt();
			if(retry==0) {
				System.out.println("프로그램 종료.");
			}
		}
				
	}
	
	
	
	
	

	public static void main(String[] args) {
		RSPGame game = new RSPGame();
		game.inputData();
		
	}

}
