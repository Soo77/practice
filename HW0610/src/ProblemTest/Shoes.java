package ProblemTest;


//enum Type{//�빮�ڷ� �����մϴ�.
//		WALKING("��ŷȭ"), 
//		RUNNING("����ȭ"),
//		TRAKING("Ʈ��ŷȭ"),
//		HIKING("���ȭ");
//		
//		final private String name; //name ������ ����Ȱ� ���� ���� �Ұ� ���̳ζ�����
//		private Type(String name) {//�����ڸ� �̿��Ͽ� �����͸�����.
//			this.name = name;
//		}
//		public String getName() {
//			return name;
//		}
//	}


class Type {
	static final String WALKING = "��ŷȭ";
	static final String RUNNING = "����ȭ";
	static final String TRACKING = "Ʈ��ŷȭ";
	static final String HIKING = "���ȭ";
}


public class Shoes {
//	�ʵ念��=>Ŭ���� �����̰�, �ڵ��ʱ�ȭ�ȴ�. =null �����൵��.

	public String name;
	public int size;
	public String color;
	public Type type;//������ Ÿ��

	
	public static void main(String[] args) {
		
		
		Type.HIKING = "��������";
		System.out.println(Type.HIKING);
		
		
		
		
		
		
		// TODO Auto-generated method stub

//		Shoes shoes = new Shoes();
//		
//		shoes.size = 250;
//		shoes.color = "red";
//		shoes.type = Type.TRAKING;
//		shoes.name = "����Ű";
//		
//		System.out.println("�Ź� �̸�: "+shoes.name);
//		
//		for(Type type: Type.values()) {
//			System.out.println(type);
//		}
//		
//		System.out.println(shoes.type.ordinal());
//		shoes.type= Type.HIKING;
//		
//		System.out.println(shoes.type.ordinal());
//		System.out.println(shoes.type.name());
//		
//		Type t1 = Type.WALKING;
//		Type t2 = Type.valueOf("WALKING");
//		System.out.println(t2);
//		
//		System.out.println();
//		for(Type type: Type.values()) {
//			System.out.println(type.getName());
//		}
		
		
		
	}

}
