import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class p0607 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		//2��~5��
//		for(int i=2; i<6; i++) {
//			System.out.print(i+"��\t");
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
//		//6��~9��
//		for(int i=6; i<10; i++) {
//			System.out.print(i+"��\t");
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
		
		
		
		
		
		//���丮��
//		Scanner sc = new Scanner(System.in);
//		long total = 1;
//
//		while(true) {
//			System.out.println("���ڸ� �Է��ϼ���.(0������ Ż��)");
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
//		System.out.print("�հ踦 ����� �׼��� �Է��ϼ���:");
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
//		System.out.println(n + "�ױ��� �Ǻ���ġ������ �� = "+sum);
		
		
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
		
//	[����] *�� 5�ٿ� ���ļ� 3���� ���
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//	[����]
//		*
//		**
//		***
//		****
//		***** ����ϱ�
		
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
//		    * ����ϱ�
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
		
		
//	[����1] ������ ���� ��µǴ� ������ �ۼ��ϼ���.
//	*******
//	 *****
//	  ***
//	   *
//		System.out.println("���ڸ� �Է��Ͽ� ���Ƕ�̵带 ����մϴ�.");
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
	
//	[����2] 1+2+3+4+5+6+7+8+9+10=55
//	���Ͱ��� ��µǵ��� ������ �ۼ��ϼ���.
//		System.out.println("���ڸ� �Է��Ͽ� �� ���ڱ��� ���� ���� ����մϴ�.");
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
		
		
//	[����3] �Ʒ��� ���� ��µǵ��� ������ �ۼ��� ������.
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
		

		
		
//	1~100������ �հ踦 ���Ͻÿ�.
//		int i=0, sum=0;
//		while(i<=100) {
//			sum+=i;
//			System.out.println(i);
//			i++;
//		}
//		System.out.println(sum);
		
//	1~10000������ �հ踦 ���Ͻÿ�. ��, �����Է��� �ȵ˴ϴ�.
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		
//		while(true) {
//			System.out.println("���ڸ� �Է��Ͽ� �հ踦 ����մϴ�.(10000������ ��)");
//			int num = sc.nextInt();
//			if(num>0 && num<=10000) {
//				for(int i=0; i<=num; i++) {
//					sum+=i;
//				}
//				System.out.println("1���� "+num+"������ �հ�: "+sum);
//				sum=0;
//			} else {
//				System.out.println("����. 1���� 10000������ ���ڸ� �Է��ϼ���.");
//				break;
//			}
//		}
		
//	������ó��
		
//		System.out.println("���� ó���� �������� �Է��ϼ���.");
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
		
//	1~1000������ 7�ǹ���� ������ ���ϱ�
		
//		int i=1, count=0;
//		while(i<1000) {
//			if(i%7==0) {
//				System.out.println(i+" ");
//				count++;
//			}
//			i++;
//		}
//		System.out.println("\n1~1000������ 7�ǹ�� ����: "+count);
		

		//Hello Java 10��������
//		int i=1;
//		String str = "Hello Java";
//		while(i<=10) {
//			System.out.println(i+":"+str);
//			i++;
//		}
		
		//I Like Java 5������ϱ�
//		int i=1;
//		String str = "I Like Java";
//		while(i<=5) {
//			System.out.println(i+":"+str);
//			i++;
//		}
		
		//���ϴ� ���ڸ� �Է��Ͽ� -3�� �����ϰ� �հ�� �� ���ڸ� ����ϴ� ������ �ۼ��ϼ���.
//		//��> 100, 97, 94, 91, 88,...1
//		System.out.println("���� ó���� ���ڸ� �Է��ϼ���.");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		int num = Integer.parseInt(s);
//		int total =0;
//		
//		for(int i=num; i>=1; i-=3) {
//			System.out.print(i + " ");
//			total += i;
//		}
//		System.out.println("\n�հ�: " + total);
		
//	[����] �޼����� �Է��ϰ�, ����մϴ�. �׸��� 'q'���ڰ� �ԷµǸ� ���α׷��� �����մϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while(true) {
//			System.out.println("�޼����� �Է��غ�����.");
//			String str = br.readLine();
//			if(str.equals("q")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			} else {
//				System.out.println(str);
//			}
//		}
//		String str=null;
//		do {
//			System.out.println("�޼����� �Է��غ�����.");
//			str = br.readLine();
//			System.out.println(str);
//		}while(!str.equals("q"));
//		System.out.println("���α׷��� �����մϴ�.");
		
		
//	[����]������ ���� ó���� �ǵ��� ���α׷� �ϼ���.
//-------------------------------
//1.���� | 2.��� | 3.�ܰ� | 4.���� |
//-------------------------------
//		Scanner sc = new Scanner(System.in);
//		String opt=null;
//		int input=0, withdraw=0, money=0;
//		DecimalFormat dc = new DecimalFormat("###,###,###,###");
//		do {
//			System.out.println("---------------------------");
//			System.out.println("|1.����| 2.���| 3.�ܰ� |4.����|");
//			System.out.println("---------------------------");
//			System.out.print("���� ��ư�� �����ּ���>> ");
//			num = sc.nextInt();
//			
//			if(num==1) {
//				System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�?>> ");
//				input = sc.nextInt();
//				money+=input;
//				System.out.println(input+"���� �Ա��Ͽ� �� "+dc.format(money)+"���� �Ǿ����ϴ�.\n");
//			} else if(num==2) {
//				System.out.print("�󸶸� ����Ͻðڽ��ϱ�?>> ");
//				withdraw = sc.nextInt();
//				if(withdraw>money) {
//					System.out.println("�ܰ��� ū �ݾ��� �Է��ϼ̽��ϴ�. (�ܰ�:"+money+"��)\n");
//					
//				} else {
//					money-=withdraw;
//					System.out.println(withdraw+"���� ����Ͽ� �� "+dc.format(money)+"���� �Ǿ����ϴ�.\n");
//				}
//			} else if(num==3) {
//				System.out.println("���� �ܰ�� �� "+dc.format(money)+"���Դϴ�.\n");
//			} else {
//				System.out.println("�ùٸ� ���ڹ�ư�� �Է����ּ���.\n");
//			}	
//		} while(num!=4);
//		System.out.println("���α׷��� �����մϴ�.");
		
//		Scanner sc = new Scanner(System.in);
//		String opt=null;
//		int input=0, withdraw=0, money=0;
//		DecimalFormat dc = new DecimalFormat("###,###,###,###");
//		boolean run = true;
//		
//		while(run) {
//			System.out.println("---------------------------");
//			System.out.println("|1.����| 2.���| 3.�ܰ� |4.����|");
//			System.out.println("---------------------------");
//			System.out.print("���� ��ư�� �����ּ���>> ");
//			opt = sc.next();
//			
//			switch(opt) {
//			case"1":
//				System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�?>> ");
//				input = sc.nextInt();
//				money+=input;
//				System.out.println(input+"���� �Ա��Ͽ� �� "+dc.format(money)+"���� �Ǿ����ϴ�.\n");
//				break;
//			case"2":
//				System.out.print("�󸶸� ����Ͻðڽ��ϱ�?>> ");
//				withdraw = sc.nextInt();
//				if(withdraw>money) {
//					System.out.println("�ܰ��� ū �ݾ��� �Է��ϼ̽��ϴ�. (�ܰ�:"+money+"��)\n");
//					break;
//					
//				} else {
//					money-=withdraw;
//					System.out.println(withdraw+"���� ����Ͽ� �� "+dc.format(money)+"���� �Ǿ����ϴ�.\n");
//					break;
//				}
//			case"3":
//				System.out.println("���� �ܰ�� �� "+dc.format(money)+"���Դϴ�.\n");
//				break;
//			case"4":
//				run=false;
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//				
//				
//			}
//		}
		
		
		
		//1~100������ 3�� ����� ���� ���Ͻÿ�.
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
//		System.out.print("�����Է�>>");
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
//		System.out.println("\n�հ�:"+ sum);

		
		
		
		
		//2���� ������ �߻��Ͽ� ���� 5���Ǹ� ���α׷��� �����ϰ�, �ƴϸ� ��� �����մϴ�.
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
//				System.out.println("����");
//				break;
//			}
//		}
		

		//I Like Java�� 5�� ����ϼ���.
//		int i=1;
//		do {
//			System.out.println(i+": I Like Java");
//			i++;
//		}while(i<=5);
		
		//1~10�� ����ϼ���.
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
		
		//1~100������ 2�ǹ���� ���
//		int i=1;
//		do {
//			if(i%8==0) {
//				System.out.println(i);
//			}
//			i++;
//		}while(i<100);
		
		//1~100������ 2�ǹ���̸� ��ŵ�϶�. continue;
//		System.out.println("���");
//		int i=1;
//		do {
//			i++;
//			if(i%2==0) {
//				//System.out.println(i+"�� 2�� ���");
//				continue;
//			}
//			System.out.println(i);
//		}while(i<100);
		
		
		//1~100������ 4�ǹ���� ������ ���Ͻÿ�.
//		int i=0, count = 0;
//		do {
//			
//			count++;
//			i+=4;
//			System.out.println(i);
//		}while(i<100);
//		System.out.println(count);
		
		

		
		
		//�μ��� �Է¹޾Ƽ� ū���� ���� ���� �����Ͽ� ����ϼ���.
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
//				System.out.println("�� ���� �Է��ϼ���.(�Ѵ� 0�� ������ ����.)");
//				n1 = sc.nextInt();
//				n2 = sc.nextInt();
//				BigValue = (n1>n2)?n1:n2;
//				SmallValue = (n1<n2)?n1:n2;
//				System.out.println("ū���� "+BigValue+"�̰�, �������� "+SmallValue+"�Դϴ�.");
//			}while(true);
//		}catch(java.util.InputMismatchException e) {
//			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
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
		//1~100������ 2�ǹ���� 3�ǹ���� �����ϰ�, ������ ���
		//���� ���
		
//		for(i=1; i<100; i++) {
//			if(!((i%2==0)&&(i%3==0))) {
//				count++;
//				continue;
//			}
//			System.out.println(i);
//		}
//		System.out.println("2��3�ǹ���� �ƴ� ������ " + count+"��");
		
		
//		int i = 0, count=0;
//		do {
//			i++;
//			if((i%2==0)||(i%3==0)) {
//				count++;
//				continue;
//			}
//			System.out.println(i);
//		} while(i<100);
//		System.out.println("2��3�ǹ���� �ƴ� ������ " + count+"��");
		
		
		//break; �ߴ�, ����, ������ �ǹ̷� ���, ���ǹ��̳� �ݺ����� ���ѷ����� Ż���� �� ����մϴ�.
		//10�� 9���� ������ *�� ä�켼��.
		//������ ���� break;
		
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
		
// [����4] 1~100������ �� �߿��� ���� 1000(�ȳѰ�)�� ����� ���� ���Ͽ� ����Ͻÿ�.
		//1���� ���س�����.
//		int i = 1, sum=0;
//		do {
//			System.out.println(sum);
//			sum+=i;
//			i++;
//		}while(sum<1000);
//		System.out.println("��: "+ (i-1));
		
		
		
//		int i, sum=0;
//		for(i=1; i<100; i++) {
//			sum+=i;
//			if(sum>1000) {
//				break;
//			}
//			System.out.println(i + "��° ��: "+sum);
//		}
//		System.out.println("���� " + (i-1));
		
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
		
		//���� : Ư�� ���ڸ� �Է¹�����, �� �� ������ �Ҽ��� ��� ����ϱ�

//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϸ� �� ���ڱ��� �Ҽ��� ����մϴ�.");
//		int num = sc.nextInt();
//		for(int i=1; i<=num; i++) {
//			int count=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i+"�� �Ҽ��Դϴ�.");
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
