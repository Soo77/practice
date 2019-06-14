package HWanswer;
//과제3] 아래와 같은 데이터가 존재하는 경우에 모두 덧셈 연산을 하여 메소드 오버로딩 만들어 보세요.
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
