import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ex05 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		ArrayList numList2 = new ArrayList();
		
		numList2.add(numList);
		String str = "String 2";
		numList2.add(str);
		for(Object obj : numList2) {
			System.out.println(obj);
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("1st");
		strList.add("2nd");
		strList.add("3rd");
		strList.add("4th");
		strList.add("5th");
		
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		Collections.reverse(strList);
		for(String s : strList) {
			System.out.println(s);
		}
		
		
		
		
	}

}
