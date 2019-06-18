import java.util.Scanner;

public class threesixnine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("369게임 - 박수 친 횟수 구하기");
		System.out.println("숫자를 입력하여 그 숫자까지 친 박수 횟수를 출력하세요.");
		int num = sc.nextInt();
		String str = "";
		char c = ' ';
		int count = 0;
	
		for(int i=1; i<=num; i++) {
			str = Integer.toString(i);
			System.out.print(str+":");
			for(int j=0; j<str.length(); j++) {
				c = str.charAt(j);
				if(c == '3' || c == '6' || c == '9') {
					System.out.print("짝");
					count++;
				} 
			}
			System.out.println();
		}
		System.out.println("총 박수 횟수: "+count);
	}

}
