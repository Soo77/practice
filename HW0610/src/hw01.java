import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과제1]컴퓨터에서 난수를 발생하여 사용자가 맞추는 가위바위보 게임을 작성하세요.
		// <hint> 0:가위, 1:바위, 2:보
		// 1.조건문으로 작성
		// 2.switch ~ case로 작성
		Scanner sc = new Scanner(System.in);

		while (true) {
			int computer = (int) (Math.random() * 3);
			System.out.print("사용자 입력(0:가위, 1:바위, 2:보) >>");
			int input = sc.nextInt();

			System.out.println("\n\n가위바위보!");
			switch (computer) {
			case 0:
				if (input == computer) {
					System.out.println("컴퓨터: 가위, 사용자: 가위");
					System.out.println("비겼습니다.");
				} else if (input == 1) {
					System.out.println("컴퓨터: 가위, 사용자: 바위");
					System.out.println("사용자가 이겼습니다.");
				} else if (input == 2) {
					System.out.println("컴퓨터: 가위, 사용자: 보");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				break;
			case 1:
				if (input == computer) {
					System.out.println("컴퓨터: 바위, 사용자: 바위");
					System.out.println("비겼습니다.");
				} else if (input == 0) {
					System.out.println("컴퓨터: 바위, 사용자: 가위");
					System.out.println("컴퓨터가 이겼습니다.");
				} else if (input == 2) {
					System.out.println("컴퓨터: 바위, 사용자: 보");
					System.out.println("사용자가 이겼습니다.");
				}
				break;
			case 2:
				if (input == computer) {
					System.out.println("컴퓨터: 보, 사용자: 보");
					System.out.println("비겼습니다.");
				} else if (input == 0) {
					System.out.println("컴퓨터: 보, 사용자: 가위");
					System.out.println("사용자가 이겼습니다.");
				} else if (input == 1) {
					System.out.println("컴퓨터: 보, 사용자: 바위");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				break;
			default:
				System.out.println("올바른 숫자를 입력하세요.");
			}
			System.out.println();
		}
	}

}
