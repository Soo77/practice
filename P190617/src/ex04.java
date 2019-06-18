import java.util.HashMap;
import java.util.Map;

public class ex04 {
	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<>();
		
		myMap.put("a", 1);
		myMap.put("b", 2);
		myMap.put("c", 3);
		myMap.put("d", 4);
		myMap.put("f", 6);//정렬해줌
		myMap.put("e", 5);
		myMap.put("a", 7);//키값 중복이면 나중에 들어온값으로 씌움.
		
//		for(int i=0; i<myMap.size(); i++) {
//			System.out.println("key: " s+ );
//		}
		for(String s : myMap.keySet()) {
			System.out.println("key: " + s + ", value: "+ myMap.get(s));
		}
	}
}
