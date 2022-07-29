package B8_Collection_Demo;

import java.util.ArrayList;

public class B8_A3rd_ArrayList_Integer {
	
	public static  void getshow() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(12321);
		list.add(3321);
		list.add(54323);
		list.add(97998897);
		list.add(100832);
		for(Integer dd:list) {
			System.out.println(dd);
		}
		
	}
	
	public static void main(String[] args) {
		getshow();
	}

}
