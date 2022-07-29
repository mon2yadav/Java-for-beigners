package B8_Collection_Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class B8_A4th_ArrayList_comparision {
	
	public static void getdata(ArrayList<String> li, ArrayList<String> li1) {

		for (String dd : li) {

			for (String dd1 : li1) {

				if (dd.equals(dd1)) {
					System.out.println(dd + " is matched ");
				}
				li1.remove(dd1);
				break;
			}
		} 

	}

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<String>();
		ArrayList<String> li1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 5 name");

		for (int i = 0; i <= 4; i++) {
			li.add(sc.next());
		}
		System.out.println("Please enter 5 another name");
		for (int j = 0; j <= 4; j++) {
			li1.add(sc.next());
		}
		getdata(li, li1);

	}
	

}
