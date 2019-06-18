import java.util.ArrayList;

public class ex03 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
//		list.get(0).
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0,-1);
		list.add(2,4);
		
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for(Integer i : list) {
			System.out.println(i);
		}
		
		ArrayList<ArrayList<Integer>> doubleArrayList = new ArrayList<>();
		doubleArrayList.add(list);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(301);
		list2.remove(3);
		doubleArrayList.add(list2);
		
		for(int i=0; i<doubleArrayList.size(); i++) {
			for(int j=0; j<doubleArrayList.get(i).size(); j++) {
				System.out.print(doubleArrayList.get(i).get(j)+"\t");
			}
			System.out.println();
		}
		
	}

}
