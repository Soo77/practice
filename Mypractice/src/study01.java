import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//����1:1~100������ ���� �� 2�� ����� 3�� ����� ��� ����ϴ� ���α׷� �ۼ�.
//		for(int i=1; i<=100; i++) {
//			if(i%2==0 || i%3==0) {
//				System.out.println(i);
//			}
//		}
		
//����2��: ���ڸ� 5�� �Է¹޾� �Է¹��� ���ڸ� ���� ����ϴ� ���α׷� for���� ���� ���.
//		Scanner sc = new Scanner(System.in);
//		int arr[]=new int[5];
//		
//		for(int i=0; i<5; i++) {
//			int num = sc.nextInt();
//			arr[i] = num;
//		}
//		for(int i=0; i<5; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
//����3��: for���� ����Ͽ� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//		12345
//		12345
//		12345
//		12345
//		12345
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//����4��: for���� ����Ͽ� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//		12345
//		23456
//		34567
//		45678
//		56789
	
//		for(int i=0; i<5; i++) {
//			for(int j=i+1; j<=i+5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//����5��: ������������ 5�� �ݺ��Ͽ� ���и� ����ϴ� ���α׷��� �ۼ�(1.���� 2.���� 3.��)
//		(while, switch��)
		
//		int i=0;
//		while(i<5) {
//			int player1 = (int)(Math.random()*3)+1;
//			int player2 = (int)(Math.random()*3)+1;
//			
//			System.out.println("=== ����"+(i+1)+"ȸ ===");
//			System.out.println(player1 + " " +player2);
//			switch(player1) {
//			case 1:
//				System.out.println("player1: ����");
//				if(player2==1) {
//					System.out.println("player2: ����");
//					System.out.println("���: ���º�");
//				} else if(player2==2) {
//					System.out.println("player2: ����");
//					System.out.println("���: player1 ��, player2 ��");
//				} else {
//					System.out.println("player2: ��");
//					System.out.println("���: player1 ��, player2 ��");
//				}
//				break;
//			case 2:
//				System.out.println("player1: ����");
//				if(player2==1) {
//					System.out.println("player2: ����");
//					System.out.println("���: player1 ��, player2 ��");
//				} else if(player2==2) {
//					System.out.println("player2: ����");
//					System.out.println("���: ���º�");
//				} else {
//					System.out.println("player2: ��");
//					System.out.println("���: player1 ��, player2 ��");
//				}
//				break;
//			case 3:
//				System.out.println("player1: ��");
//				if(player2==1) {
//					System.out.println("player2: ����");
//					System.out.println("���: player1 ��, player2 ��");
//				} else if(player2==2) {
//					System.out.println("player2: ����");
//					System.out.println("���: player1 ��, player2 ��");
//				} else {
//					System.out.println("player2: ��");
//					System.out.println("���: ���º�");
//				}
//				break;
//			}
//			i++;
//		}
		
		
		
//��ȭ1��: ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڿ� ���ų� ���� ���ڱ����� �Ҽ��� ���� ����ϴ� ���α׷� �ۼ�
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Է�>> ");
//		int num= sc.nextInt();
//		for(int i=1; i<=num; i++) {
//			int count=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
		
//��ȭ2��: ���� �⺻����� 1000���̶�� �ϰ� �ο����� ���̸� �Է¹޾� �����ؾ��� �ݾ��� ����Ͻÿ�.
//		- 20�� �̸��� 25%����
//		- �ο����� 2�� �̻��̸� n��° ����� ���̱��� �ݺ������� �Է¹��� ��
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�ο� �� >>");
//		int people = sc.nextInt();
//		
//		
//		int adult=1000;
//		double teen=1000*0.75, total=0.0;
//		
//		System.out.print("���� ���� >>");
//		for(int i=0; i<people; i++) {
//			int age = sc.nextInt();
//			if(age<20) {
//				total += teen;
//			} else {
//				total += adult;
//			}
//		}
//		System.out.println("�� �ݾ�: "+(int)total+"��");
		
//��ȭ3��
		//12��45
		//2��4��6
		//��456��
		//4��6��8
		//56��89
		
//		int j;
//		for(int i=1; i<=5; i++) {
//			for(j=i; j<i+5; j++) {
//				if(j==3 || j==7 || (i%2==0 && j==5)) {
//					System.out.print("��");
//				} else {
//					System.out.print(j);
//				}
//				
//			}
//			System.out.println();
//		}
		
//��ȭ4��
//		1~100������ ���ڸ� �������� �߻����� 5���� ��ȸ�ȿ� 1.high 2.low 3.�����Է��� 
//		������ Ŀ�ǵ带 Ȱ���Ͽ� ������ ���ߴ� ���α׷� �ۼ�
//		Scanner sc = new Scanner(System.in);
//		int num = (int)(Math.random()*50)+1;
//		int i=0;
//		while(i<5) {
//			System.out.println("���ڸ� ����������.");
//			int answer = sc.nextInt();
//			if(num == answer) {
//				System.out.println("�����Դϴ�!");
//				break;
//			} else if (num > answer) {
//				System.out.println("�Է��Ͻ� ���ں��� ������ �� Ů�ϴ�.");
//			} else if (num < answer) {
//				System.out.println("�Է��Ͻ� ���ں��� ������ �� �۽��ϴ�.");
//			}
//			System.out.println();
//			if(i==4) {
//				System.out.println("���������Ͽ����ϴ�.");
//			}
//			i++;
//		}
	}

}
