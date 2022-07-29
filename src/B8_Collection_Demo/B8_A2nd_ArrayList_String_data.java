package B8_Collection_Demo;

import java.util.ArrayList;

public class B8_A2nd_ArrayList_String_data {
	
	public static void getdata() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("montu");
		list.add("Naveen");
		list.add("Pinki");
		list.add("Neha");
		list.add("Rinku");
		list.add("Poonam");
		list.add("Pushpa");
		list.add("Anish");
		for(String dd:list) {
			System.out.println(dd);
		}
			
	}
	public static void main(String[] args) {
		getdata();
	}

}
