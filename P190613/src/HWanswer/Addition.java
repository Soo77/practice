package HWanswer;
//����3] �Ʒ��� ���� �����Ͱ� �����ϴ� ��쿡 ��� ���� ������ �Ͽ� �޼ҵ� �����ε� ����� ������.
//no.addition( 1 ); 
//no.addition( 2, 3 );
//no.addition( 4, 5, 6 );
//no.addition( 5, 6, 7, 8 );

public class Addition {

	public static void main(String[] args) {
		Addition no = new Addition();
		no.addition( 1 ); 
		no.addition( 2, 3 );
		no.addition( 4, 5, 6 );
		no.addition( 5, 6, 7, 8 );
 
	}

	private void addition(int i, int j, int k, int l) {
		System.out.println(i+j+k+l);
	}

	private void addition(int i, int j, int k) {
		System.out.println(i+j+k);
	}

	private void addition(int i, int j) {
		System.out.println(i+j);
	}

	private void addition(int i) {
		System.out.println(i+100);
	}

}
