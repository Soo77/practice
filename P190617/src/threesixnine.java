import java.util.Scanner;

public class threesixnine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("369���� - �ڼ� ģ Ƚ�� ���ϱ�");
		System.out.println("���ڸ� �Է��Ͽ� �� ���ڱ��� ģ �ڼ� Ƚ���� ����ϼ���.");
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
					System.out.print("¦");
					count++;
				} 
			}
			System.out.println();
		}
		System.out.println("�� �ڼ� Ƚ��: "+count);
	}

}
