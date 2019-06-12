package MethodSample;

public class Books {
	private static String title;
	private static String author;
	private static String publisher;
	private int price;

	public Books(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
//	private String output() {
//
//		return "제목: " + title + ", 작가: " + author + ", 출판사: " + publisher + ", 가격: " + price;
//		
//	}
	
	public String toString() {
		
		return "제목: " + title + ", 작가: " + author + ", 출판사: " + publisher + ", 가격: " + price;
	}


	public static void main(String[] args) {
		//첵제목, 저자, 출판사, 가격...
		
		//1.
		Books b1 = new Books("삼국지", "이문열", "제이펍", 15000);
		System.out.println(b1.toString());
		System.out.println(b1);
		
		//2.클래스, 변수명
		System.out.println("책 제목: "+Books.title +", 작가: " + Books.author +", 출판사: "+Books.publisher);
		//Books b2 = new Books("", author, author, price);
		
		
	}



	

}
