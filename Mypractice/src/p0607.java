import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class p0607 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		//2단~5단
//		for(int i=2; i<6; i++) {
//			System.out.print(i+"단\t");
//		}
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<6; j++) {
//				System.out.print(j+"x"+i+"="+j*i+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println();
//		System.out.println();
//		
//		//6단~9단
//		for(int i=6; i<10; i++) {
//			System.out.print(i+"단\t");
//		}
//		System.out.println();
//		for(int i=1; i<=9; i++) {
//			for(int j=6; j<10; j++) {
//				System.out.print(j+"x"+i+"="+j*i+"\t");
//			}
//			System.out.println();
//		}
		
//		for(int i=2; i<10; i+=4) {
//			for(int j=1; j<10; j++) {
//				for(int k=i; k<i+4; k++) {
//					System.out.printf("%d * %d = %d\t",k,j,(k*j));
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		
		
		
		
		//팩토리얼
//		Scanner sc = new Scanner(System.in);
//		long total = 1;
//
//		while(true) {
//			System.out.println("숫자를 입력하세요.(0누르면 탈출)");
//			int num = sc.nextInt();
//			if(num==0) {
//				break;
//			} else {
//				for(int i=1; i<=num; i++) {
//					total*=i;
//				}
//				System.out.println(num+"! = " +total);
//			}
//			total=1;
//		}
//		
//		int n, a=1,b=1,c,sum=2;
//		Scanner sc =new Scanner(System.in);
//		System.out.print("합계를 계산할 항수를 입력하세요:");
//		n=sc.nextInt();
//		System.out.print("1 + 1 + ");
//		
//		for(int i=3; i<=n; i++) {
//			c = a+b;
//			sum+=c;
//			if(i==n) {
//				System.out.println(c+" = "+sum);
//				break;
//			} 
//			System.out.print(c+" + ");
//			a=b;
//			b=c;
//		}
//		System.out.println(n + "항까지 피보나치수열의 합 = "+sum);
		
		
//		for(int i=0; i<10; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i=0; i<10; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		for(int i=0; i<10; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//	[문제] *를 5줄에 걸쳐서 3개씩 출력
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//	[문제]
//		*
//		**
//		***
//		****
//		***** 출력하기
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    * 출력하기
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		
//		1
//		12
//		123
//		1234
//		12345
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(j+1);
//			}
//			System.out.println();
//		}
		
//		12345
//		12345
//		12345
//		12345
//		12345
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(j+1);
//			}
//			System.out.println();
//		}
//				 1
//				1 2
//			   1 2 3
//			  1 2 3 4
//			 1 2 3 4 5
		
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print(j+1+" ");
//			}
//			System.out.println();
//		}
		
		
		//1 2 3 4 5
		// 1 2 3 4
		//  1 2 3
		//   1 2
		//    1
	
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=5; i>=1; i--) {
//			for(int j=0; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
//	[과제1] 다음과 같이 출력되는 로직을 작성하세요.
//	*******
//	 *****
//	  ***
//	   *
//		System.out.println("숫자를 입력하여 역피라미드를 출력합니다.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=(num-i)*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
//	[과제2] 1+2+3+4+5+6+7+8+9+10=55
//	위와같이 출력되도록 로직을 작성하세요.
//		System.out.println("숫자를 입력하여 그 숫자까지 더한 값을 출력합니다.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		for(int i=1; i<=num; i++) {
//			if(i==num) {
//				sum+=i;
//				System.out.print(i+"="+sum);
//			} else {
//				sum+=i;
//				System.out.print(i+"+");
//			}
//		}
		
		
//	[과제3] 아래와 같이 출력되도록 로직을 작성해 보세요.
		//[1, 1] //for if break
		//[1, 2]
		//[1, 3]
		//[1, 4]
		//[1, 5]
		//[1, 6]
		//[1, 7]
		//[1, 8]
		//[1, 9]
		//[2, 1]
		//[2, 2]
		
	
//		Loop1:for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				if(i==2&&j==2) {
//					System.out.println("["+i+","+j+"]");
//					break Loop1;
//				} else {
//					System.out.println("["+i+","+j+"]");
//				}
//			}
//		}
		

		
		
//	1~100사이의 합계를 구하시오.
//		int i=0, sum=0;
//		while(i<=100) {
//			sum+=i;
//			System.out.println(i);
//			i++;
//		}
//		System.out.println(sum);
		
//	1~10000까지의 합계를 구하시오. 단, 음수입력은 안됩니다.
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		
//		while(true) {
//			System.out.println("숫자를 입력하여 합계를 출력합니다.(10000이하의 수)");
//			int num = sc.nextInt();
//			if(num>0 && num<=10000) {
//				for(int i=0; i<=num; i++) {
//					sum+=i;
//				}
//				System.out.println("1부터 "+num+"까지의 합계: "+sum);
//				sum=0;
//			} else {
//				System.out.println("종료. 1에서 10000사이의 숫자를 입력하세요.");
//				break;
//			}
//		}
		
//	구구단처리
		
//		System.out.println("연산 처리할 구구단을 입력하세요.");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String gugu = br.readLine();
//		int dan = Integer.parseInt(gugu);
//		int i=1;
//		
//		while(i<=9) {
//			
//			System.out.println(dan + "*" + i + "=" + dan*i);
//			i++;
//		}
		
//	1~1000사이의 7의배수와 갯수를 구하기
		
//		int i=1, count=0;
//		while(i<1000) {
//			if(i%7==0) {
//				System.out.println(i+" ");
//				count++;
//			}
//			i++;
//		}
//		System.out.println("\n1~1000사이의 7의배수 개수: "+count);
		

		//Hello Java 10번출력햐기
//		int i=1;
//		String str = "Hello Java";
//		while(i<=10) {
//			System.out.println(i+":"+str);
//			i++;
//		}
		
		//I Like Java 5번출력하기
//		int i=1;
//		String str = "I Like Java";
//		while(i<=5) {
//			System.out.println(i+":"+str);
//			i++;
//		}
		
		//원하는 숫자를 입력하여 -3씩 감소하고 합계와 그 숫자를 출력하는 로직을 작성하세요.
//		//예> 100, 97, 94, 91, 88,...1
//		System.out.println("연산 처리할 숫자를 입력하세요.");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		int num = Integer.parseInt(s);
//		int total =0;
//		
//		for(int i=num; i>=1; i-=3) {
//			System.out.print(i + " ");
//			total += i;
//		}
//		System.out.println("\n합계: " + total);
		
//	[문제] 메세지를 입력하고, 출력합니다. 그리고 'q'문자가 입력되면 프로그램을 종료합니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while(true) {
//			System.out.println("메세지를 입력해보세요.");
//			String str = br.readLine();
//			if(str.equals("q")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			} else {
//				System.out.println(str);
//			}
//		}
//		String str=null;
//		do {
//			System.out.println("메세지를 입력해보세요.");
//			str = br.readLine();
//			System.out.println(str);
//		}while(!str.equals("q"));
//		System.out.println("프로그램을 종료합니다.");
		
		
//	[문제]다음과 같은 처리가 되도록 프로그램 하세요.
//-------------------------------
//1.예금 | 2.출금 | 3.잔고 | 4.종료 |
//-------------------------------
//		Scanner sc = new Scanner(System.in);
//		String opt=null;
//		int input=0, withdraw=0, money=0;
//		DecimalFormat dc = new DecimalFormat("###,###,###,###");
//		do {
//			System.out.println("---------------------------");
//			System.out.println("|1.예금| 2.출금| 3.잔고 |4.종료|");
//			System.out.println("---------------------------");
//			System.out.print("숫자 버튼을 눌러주세요>> ");
//			num = sc.nextInt();
//			
//			if(num==1) {
//				System.out.print("얼마를 입금하시겠습니까?>> ");
//				input = sc.nextInt();
//				money+=input;
//				System.out.println(input+"원을 입금하여 총 "+dc.format(money)+"원이 되었습니다.\n");
//			} else if(num==2) {
//				System.out.print("얼마를 출금하시겠습니까?>> ");
//				withdraw = sc.nextInt();
//				if(withdraw>money) {
//					System.out.println("잔고보다 큰 금액을 입력하셨습니다. (잔고:"+money+"원)\n");
//					
//				} else {
//					money-=withdraw;
//					System.out.println(withdraw+"원을 출금하여 총 "+dc.format(money)+"원이 되었습니다.\n");
//				}
//			} else if(num==3) {
//				System.out.println("현재 잔고는 총 "+dc.format(money)+"원입니다.\n");
//			} else {
//				System.out.println("올바른 숫자버튼을 입력해주세요.\n");
//			}	
//		} while(num!=4);
//		System.out.println("프로그램을 종료합니다.");
		
//		Scanner sc = new Scanner(System.in);
//		String opt=null;
//		int input=0, withdraw=0, money=0;
//		DecimalFormat dc = new DecimalFormat("###,###,###,###");
//		boolean run = true;
//		
//		while(run) {
//			System.out.println("---------------------------");
//			System.out.println("|1.예금| 2.출금| 3.잔고 |4.종료|");
//			System.out.println("---------------------------");
//			System.out.print("숫자 버튼을 눌러주세요>> ");
//			opt = sc.next();
//			
//			switch(opt) {
//			case"1":
//				System.out.print("얼마를 입금하시겠습니까?>> ");
//				input = sc.nextInt();
//				money+=input;
//				System.out.println(input+"원을 입금하여 총 "+dc.format(money)+"원이 되었습니다.\n");
//				break;
//			case"2":
//				System.out.print("얼마를 출금하시겠습니까?>> ");
//				withdraw = sc.nextInt();
//				if(withdraw>money) {
//					System.out.println("잔고보다 큰 금액을 입력하셨습니다. (잔고:"+money+"원)\n");
//					break;
//					
//				} else {
//					money-=withdraw;
//					System.out.println(withdraw+"원을 출금하여 총 "+dc.format(money)+"원이 되었습니다.\n");
//					break;
//				}
//			case"3":
//				System.out.println("현재 잔고는 총 "+dc.format(money)+"원입니다.\n");
//				break;
//			case"4":
//				run=false;
//				System.out.println("프로그램을 종료합니다.");
//				break;
//				
//				
//			}
//		}
		
		
		
		//1~100사이의 3의 배수의 합을 구하시오.
//		int i=1, sum=0;
//		
//		while(i<=100) {
//			if(i%3==0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
		
		// 1/1 + 1/3 + 1/5 + 1/7 +... +1/n = ?
//		double sum = 0.0;
//		System.out.print("숫자입력>>");
//		Scanner sc= new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		
//		int i = 1;
//		while(i<=n) {
//			sum+=1.0/i;
//			System.out.print("1/"+i+" ");
//			i+=2;
//		}
//		System.out.println("\n합계:"+ sum);

		
		
		
		
		//2개의 난수를 발생하여 합이 5가되면 프로그램을 중지하고, 아니면 계속 실행합니다.
//		int n1, n2, sum=0;
//
//		
//		while(true) {
//			n1 = (int)(Math.random()*50)+1;
//			n2 = (int)(Math.random()*50)+1;
//			sum=n1+n2;
//			if(sum!=50) {
//				System.out.println(n1 +"+"+ n2 + "=" +sum);
//			} else {
//				System.out.println(n1 +"+"+ n2 + "=" +sum);
//				System.out.println("종료");
//				break;
//			}
//		}
		

		//I Like Java를 5번 출력하세요.
//		int i=1;
//		do {
//			System.out.println(i+": I Like Java");
//			i++;
//		}while(i<=5);
		
		//1~10을 출력하세요.
//		int i=1, sum=0;
//		do {
//			if(i==10) {
//				System.out.print(i+" = ");
//				sum+=i;
//				break;
//			} else {
//				System.out.print(i+" + ");
//				sum+=i;
//				i++;
//			}
//		} while(i<=10);
//		System.out.println(sum);
		
		//1~100사이의 2의배수를 출력
//		int i=1;
//		do {
//			if(i%8==0) {
//				System.out.println(i);
//			}
//			i++;
//		}while(i<100);
		
		//1~100사이의 2의배수이면 스킵하라. continue;
//		System.out.println("출력");
//		int i=1;
//		do {
//			i++;
//			if(i%2==0) {
//				//System.out.println(i+"는 2의 배수");
//				continue;
//			}
//			System.out.println(i);
//		}while(i<100);
		
		
		//1~100사이의 4의배수의 갯수를 구하시오.
//		int i=0, count = 0;
//		do {
//			
//			count++;
//			i+=4;
//			System.out.println(i);
//		}while(i<100);
//		System.out.println(count);
		
		

		
		
		//두수를 입력받아서 큰값과 작은 값을 구별하여 출력하세요.
//		int n1, n2, BigValue, SmallValue;
//		Scanner sc = new Scanner(System.in);
//		String stop;
//		
//		try {
//
//			do {
////				if(stop.equals("q")) {
////					System.exit(0);
////				}
//				System.out.println("두 수를 입력하세요.(둘다 0을 넣으면 종료.)");
//				n1 = sc.nextInt();
//				n2 = sc.nextInt();
//				BigValue = (n1>n2)?n1:n2;
//				SmallValue = (n1<n2)?n1:n2;
//				System.out.println("큰값은 "+BigValue+"이고, 작은값은 "+SmallValue+"입니다.");
//			}while(true);
//		}catch(java.util.InputMismatchException e) {
//			System.out.println("입력이 잘못되었습니다.");
//		}
		
		//Factorial
//		int i=1, sum=1;
//		do {
//			sum*=i;
//			System.out.println("i= "+i+ ", i! = "+sum);
//			i++;
//			
//		}while(i<=5);
		
		
		
		//continue
		//1~100사이의 2의배수와 3의배수를 제외하고, 나머지 출력
		//개수 출력
		
//		for(i=1; i<100; i++) {
//			if(!((i%2==0)&&(i%3==0))) {
//				count++;
//				continue;
//			}
//			System.out.println(i);
//		}
//		System.out.println("2와3의배수가 아닌 갯수는 " + count+"개");
		
		
//		int i = 0, count=0;
//		do {
//			i++;
//			if((i%2==0)||(i%3==0)) {
//				count++;
//				continue;
//			}
//			System.out.println(i);
//		} while(i<100);
//		System.out.println("2와3의배수가 아닌 갯수는 " + count+"개");
		
		
		//break; 중단, 정지, 중지의 의미로 사용, 조건문이나 반복문의 무한루프를 탈출할 때 사용합니다.
		//10행 9열의 공간에 *를 채우세요.
		//중지할 때는 break;
		
//		int stop = 8;
//		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<9; j++) {
//				if(j == stop)
//					break;//continue;
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
// [과제4] 1~100사이의 합 중에서 합이 1000(안넘게)에 가까운 수를 구하여 출력하시오.
		//1부터 더해나간다.
//		int i = 1, sum=0;
//		do {
//			System.out.println(sum);
//			sum+=i;
//			i++;
//		}while(sum<1000);
//		System.out.println("답: "+ (i-1));
		
		
		
//		int i, sum=0;
//		for(i=1; i<100; i++) {
//			sum+=i;
//			if(sum>1000) {
//				break;
//			}
//			System.out.println(i + "번째 합: "+sum);
//		}
//		System.out.println("답은 " + (i-1));
		
//		int count = 0;
//		for(int i=2; i<=100; i++) {
//			for(int j=2; j<=i; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==1) {
//				System.out.println(i);
//			}
//			count=0;
//		}
		
		//문제 : 특정 숫자를 입력받으면, 그 수 까지의 소수를 모두 출력하기

//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하면 그 숫자까지 소수를 출력합니다.");
//		int num = sc.nextInt();
//		for(int i=1; i<=num; i++) {
//			int count=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i+"는 소수입니다.");
//			}
//		}
		
		
//		for(int i=1;i<=100; i++) {
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
		
		
		
		
//		for(int i=1; i<=10; i++) {
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
		
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
