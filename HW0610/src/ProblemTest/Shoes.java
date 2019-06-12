package ProblemTest;


//enum Type{//대문자로 구성합니다.
//		WALKING("워킹화"), 
//		RUNNING("러닝화"),
//		TRAKING("트레킹화"),
//		HIKING("등산화");
//		
//		final private String name; //name 변수에 저장된값 절대 수정 불가 파이널때문에
//		private Type(String name) {//생성자를 이용하여 데이터를저장.
//			this.name = name;
//		}
//		public String getName() {
//			return name;
//		}
//	}


class Type {
	static final String WALKING = "워킹화";
	static final String RUNNING = "러닝화";
	static final String TRACKING = "트레킹화";
	static final String HIKING = "등산화";
}


public class Shoes {
//	필드영역=>클래스 변수이고, 자동초기화된다. =null 안해줘도됨.

	public String name;
	public int size;
	public String color;
	public Type type;//열거형 타입

	
	public static void main(String[] args) {
		
		
		Type.HIKING = "오리지널";
		System.out.println(Type.HIKING);
		
		
		
		
		
		
		// TODO Auto-generated method stub

//		Shoes shoes = new Shoes();
//		
//		shoes.size = 250;
//		shoes.color = "red";
//		shoes.type = Type.TRAKING;
//		shoes.name = "나이키";
//		
//		System.out.println("신발 이름: "+shoes.name);
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
