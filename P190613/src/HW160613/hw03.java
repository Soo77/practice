package HW160613;

//과제3] 아래와 같은 데이터가 존재하는 경우에 모두 덧셈 연산을 하여 메소드 오버로딩 만들어 보세요.
//no.addition( 1 ); 
//no.addition( 2, 3 );
//no.addition( 4, 5, 6 );
//no.addition( 5, 6, 7, 8 );

public class hw03 {
	
	int addition(int n1) {
		return n1;
	}
	
	int addition(int n1, int n2) {
		return n1 + n2;
	}
	
	int addition(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	int addition(int n1, int n2, int n3, int n4) {
		return n1 + n2 + n3 + n4;
	}
	
	public static void main(String[] args) {
		
		hw03 no = new hw03();
		
		System.out.println(no.addition(1)); 
		System.out.println(no.addition(2, 3));
		System.out.println(no.addition(4, 5, 6));
		System.out.println(no.addition(5, 6, 7, 8));
		
	}

}
