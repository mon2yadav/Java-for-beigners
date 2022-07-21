package B1_Exception_handling;

import java.util.Scanner;

public class B1_A2nd_input_mismatch {
	
	public void showdata() {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the number");
			int input = sc.nextInt();            // when we enter the string data in place of int data then we got the input mismatch exception
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("issue in showdata "+e );
		}
	}
	
	public static void main(String[] args) {
		B1_A2nd_input_mismatch ob=new B1_A2nd_input_mismatch();
		ob.showdata();
	}

}
