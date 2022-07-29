package B8_Collection_Demo;

import java.util.ArrayList;

public class B8_A1st_ArrayList_Demo {
	
	public static void showdata() {
		ArrayList list=new ArrayList();
		list.add("Montu");
		list.add(123);
		list.add(2.33);
		list.add('M');
		
		for(Object dd:list) {
			System.out.println(dd);
		}
	}
	public static void main(String[] args) {
		showdata();
	}

}
