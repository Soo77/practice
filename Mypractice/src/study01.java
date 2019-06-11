import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//기초1:1~100까지의 숫자 중 2의 배수와 3의 배수를 모두 출력하는 프로그램 작성.
//		for(int i=1; i<=100; i++) {
//			if(i%2==0 || i%3==0) {
//				System.out.println(i);
//			}
//		}
		
//기초2번: 숫자를 5번 입력받아 입력받은 숫자를 전부 출력하는 프로그램 for문을 통해 출력.
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
		
//기초3번: for문을 사용하여 아래와 같이 출력하는 프로그램을 작성하시오
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
		
//기초4번: for문을 사용하여 아래와 같이 출력하는 프로그램을 작성하시오
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
		
//기초5번: 가위바위보를 5번 반복하여 승패를 출력하는 프로그램을 작성(1.가위 2.바위 3.보)
//		(while, switch문)
		
//		int i=0;
//		while(i<5) {
//			int player1 = (int)(Math.random()*3)+1;
//			int player2 = (int)(Math.random()*3)+1;
//			
//			System.out.println("=== 게임"+(i+1)+"회 ===");
//			System.out.println(player1 + " " +player2);
//			switch(player1) {
//			case 1:
//				System.out.println("player1: 가위");
//				if(player2==1) {
//					System.out.println("player2: 가위");
//					System.out.println("결과: 무승부");
//				} else if(player2==2) {
//					System.out.println("player2: 바위");
//					System.out.println("결과: player1 패, player2 승");
//				} else {
//					System.out.println("player2: 보");
//					System.out.println("결과: player1 승, player2 패");
//				}
//				break;
//			case 2:
//				System.out.println("player1: 바위");
//				if(player2==1) {
//					System.out.println("player2: 가위");
//					System.out.println("결과: player1 승, player2 패");
//				} else if(player2==2) {
//					System.out.println("player2: 바위");
//					System.out.println("결과: 무승부");
//				} else {
//					System.out.println("player2: 보");
//					System.out.println("결과: player1 패, player2 승");
//				}
//				break;
//			case 3:
//				System.out.println("player1: 보");
//				if(player2==1) {
//					System.out.println("player2: 가위");
//					System.out.println("결과: player1 패, player2 승");
//				} else if(player2==2) {
//					System.out.println("player2: 바위");
//					System.out.println("결과: player1 승, player2 패");
//				} else {
//					System.out.println("player2: 보");
//					System.out.println("결과: 무승부");
//				}
//				break;
//			}
//			i++;
//		}
		
		
		
//심화1번: 숫자를 입력받아서 입력받은 숫자와 같거나 작은 숫자까지의 소수를 전부 출력하는 프로그램 작성
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력>> ");
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
		
//심화2번: 버스 기본요금을 1000원이라고 하고 인원수와 나이를 입력받아 지불해야할 금액을 출력하시오.
//		- 20세 미만은 25%할인
//		- 인원수가 2인 이상이면 n번째 사람의 나이까지 반복적으로 입력받을 것
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("인원 수 >>");
//		int people = sc.nextInt();
//		
//		
//		int adult=1000;
//		double teen=1000*0.75, total=0.0;
//		
//		System.out.print("각각 나이 >>");
//		for(int i=0; i<people; i++) {
//			int age = sc.nextInt();
//			if(age<20) {
//				total += teen;
//			} else {
//				total += adult;
//			}
//		}
//		System.out.println("총 금액: "+(int)total+"원");
		
//심화3번
		//12◆45
		//2◆4◆6
		//◆456◆
		//4◆6◆8
		//56◆89
		
//		int j;
//		for(int i=1; i<=5; i++) {
//			for(j=i; j<i+5; j++) {
//				if(j==3 || j==7 || (i%2==0 && j==5)) {
//					System.out.print("◆");
//				} else {
//					System.out.print(j);
//				}
//				
//			}
//			System.out.println();
//		}
		
//심화4번
//		1~100사이의 숫자를 랜덤으로 발생시켜 5번의 기회안에 1.high 2.low 3.숫자입력의 
//		세가지 커맨드를 활용하여 정답을 맞추는 프로그램 작성
//		Scanner sc = new Scanner(System.in);
//		int num = (int)(Math.random()*50)+1;
//		int i=0;
//		while(i<5) {
//			System.out.println("숫자를 맞혀보세요.");
//			int answer = sc.nextInt();
//			if(num == answer) {
//				System.out.println("정답입니다!");
//				break;
//			} else if (num > answer) {
//				System.out.println("입력하신 숫자보다 정답이 더 큽니다.");
//			} else if (num < answer) {
//				System.out.println("입력하신 숫자보다 정답이 더 작습니다.");
//			}
//			System.out.println();
//			if(i==4) {
//				System.out.println("맞추지못하였습니다.");
//			}
//			i++;
//		}
	}

}
