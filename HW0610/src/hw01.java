import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����1]��ǻ�Ϳ��� ������ �߻��Ͽ� ����ڰ� ���ߴ� ���������� ������ �ۼ��ϼ���.
		// <hint> 0:����, 1:����, 2:��
		// 1.���ǹ����� �ۼ�
		// 2.switch ~ case�� �ۼ�
		Scanner sc = new Scanner(System.in);

		while (true) {
			int computer = (int) (Math.random() * 3);
			System.out.print("����� �Է�(0:����, 1:����, 2:��) >>");
			int input = sc.nextInt();

			System.out.println("\n\n����������!");
			switch (computer) {
			case 0:
				if (input == computer) {
					System.out.println("��ǻ��: ����, �����: ����");
					System.out.println("�����ϴ�.");
				} else if (input == 1) {
					System.out.println("��ǻ��: ����, �����: ����");
					System.out.println("����ڰ� �̰���ϴ�.");
				} else if (input == 2) {
					System.out.println("��ǻ��: ����, �����: ��");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				break;
			case 1:
				if (input == computer) {
					System.out.println("��ǻ��: ����, �����: ����");
					System.out.println("�����ϴ�.");
				} else if (input == 0) {
					System.out.println("��ǻ��: ����, �����: ����");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				} else if (input == 2) {
					System.out.println("��ǻ��: ����, �����: ��");
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				break;
			case 2:
				if (input == computer) {
					System.out.println("��ǻ��: ��, �����: ��");
					System.out.println("�����ϴ�.");
				} else if (input == 0) {
					System.out.println("��ǻ��: ��, �����: ����");
					System.out.println("����ڰ� �̰���ϴ�.");
				} else if (input == 1) {
					System.out.println("��ǻ��: ��, �����: ����");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				break;
			default:
				System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			}
			System.out.println();
		}
	}

}
