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
//		return "����: " + title + ", �۰�: " + author + ", ���ǻ�: " + publisher + ", ����: " + price;
//		
//	}
	
	public String toString() {
		
		return "����: " + title + ", �۰�: " + author + ", ���ǻ�: " + publisher + ", ����: " + price;
	}


	public static void main(String[] args) {
		//ý����, ����, ���ǻ�, ����...
		
		//1.
		Books b1 = new Books("�ﱹ��", "�̹���", "������", 15000);
		System.out.println(b1.toString());
		System.out.println(b1);
		
		//2.Ŭ����, ������
		System.out.println("å ����: "+Books.title +", �۰�: " + Books.author +", ���ǻ�: "+Books.publisher);
		//Books b2 = new Books("", author, author, price);
		
		
	}



	

}
