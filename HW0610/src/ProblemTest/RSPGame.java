package ProblemTest;

import java.util.Random;
import java.util.Scanner;

public class RSPGame {
	
	public RSPGame() {
		
	}//����Ʈ������
	
	public RSPGame(int x) {
		
	}//���ڰ� �Ѱ��ִ� ������
	
	
	
	public void inputData() {
		int retry=1;
		while(retry==1) {
			System.out.println("1:���� 2:���� 3:�� �� ����?");
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			
			Random rand = new Random();
			int comp = rand.nextInt(3)+1;
			if(comp==1) {
				System.out.println("��ǻ��: ����");
			} else if(comp==2) {
				System.out.println("��ǻ��: ����");
			} else if(comp==3) {
				System.out.println("��ǻ��: ��");
			}
			
			if(user==comp) {
				System.out.println("�����ϴ�.");
			} else if((user==1 && comp==2)||(user==2 && comp==3)||
					(user==3 && comp==1)) {
				System.out.println("�����ϴ�.");
			} else if((user==1 && comp==3)||(user==2 && comp==1)||
					(user==3 && comp==2)){
				System.out.println("�̰���ϴ�!");
			} else {
				System.out.println("1,2,3 �� �ϳ��� ������.");
			}
			System.out.println();
			System.out.println("�ٽ��Ͻðڽ��ϱ�? Yes:1 No:0");
			retry = sc.nextInt();
			if(retry==0) {
				System.out.println("���α׷� ����.");
			}
		}
				
	}
	
	
	
	
	

	public static void main(String[] args) {
		RSPGame game = new RSPGame();
		game.inputData();
		
	}

}
