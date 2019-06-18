import java.util.Scanner;

public class p190617 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//1
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//2
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=num; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//3
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=num; j>i+1; j--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//4
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=num; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//5
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=num-1; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<2*i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//6
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=2*(num-i)-1; j>0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=num; i>=1; i--) {
//			String singleLine = "";
//			for(int j=1; j<=num-i; j++) {
//				singleLine += " ";
//			}
//			for(int j=1; j<=i*2-1; j++) {
//				singleLine += "*";
//			}
//			System.out.println(singleLine);
//		}
		
		//7
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num*2-1; i++) {
//			if(i<num) {
//				for(int j=0; j<=i; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int j=(num*2-1)-i; j>0; j--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=num*2-1; i++) {
//			if(i <= num) {
//				for(int j=1; j<=i; j++) {
//					System.out.print("*");
//				}
//			} else {
//				int lowerNum = i - num;
//				for(int j=1; j<=num-lowerNum; j++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		//8
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num*2-1; i++) {
//			if(i<num) {
//				for(int j=num-1; j>i; j--) {
//					System.out.print(" ");
//				}
//				for(int j=0; j<=i; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int j=0; j<=(i-num); j++) {
//					System.out.print(" ");
//				}
//				for(int j=(num*2-1)-i; j>0; j--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<=2*num-1; i++) {
//			if(i<=num) {
//				for(int j=1; j<=num-i; j++) {
//					System.out.print(" ");
//				}
//				for(int j=1; j<=i; j++) {
//					System.out.print("*");
//				}
//			} else {
//				int lowerNum = i - num;
//				for(int j=1; j<=lowerNum; j++) {
//					System.out.print(" ");
//				}
//				for(int j=lowerNum; j<num; j++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		//9
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j=num-1; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<2*i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<num-1; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=(num-i)*2-3; j>0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//10
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=1; i<=num*2-1; i++) {
//			if(i==1 || i==num*2-1) {
//				for(int j=1; j<=num*2-1; j++) {
//					System.out.print("*");
//				}
//			} else if(i <= num) {
//				int upperI = i - 1;
//				for(int j=1; j<=num-upperI; j++) {
//					System.out.print("*");
//				}
//				for(int j=1; j<=2*upperI-1; j++) {
//					System.out.print(" ");
//				}
//				for(int j=1; j<=num-upperI; j++) {
//					System.out.print("*");
//				}
//			} else {
//				int lowerI = i - num +1;
//				for(int j=1; j<=lowerI; j++) {
//					System.out.print("*");
//				}
//				for(int j=1; j<=2*(num-lowerI)-1; j++) {
//					System.out.print(" ");
//				}
//				
//				for(int j=1; j<=lowerI; j++) {
//					System.out.print("*");
//				}
//			}
//			
//			
//			System.out.println();
//		}
		
		//11
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<num-1; i++) {//윗부분
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			for(int j=(num-i)*2-3; j>0; j--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<num*2-1; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for(int i=0; i<num-1; i++) {
//			for(int j=num-1; j>i; j--) {
//				System.out.print("*");
//			}
//			for(int j=0; j<i*2+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j=num-1; j>i; j--) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//12
//		System.out.print("숫자입력(기본:5)>> ");
//		int num = sc.nextInt();
//		for(int i=0; i<=num; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			for(int j=num; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int j=num; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=0; i<=num; i++) {
//			for(int j=num; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=num; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
