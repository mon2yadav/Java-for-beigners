package A2nd_package_If_Else_Demo;

import java.util.Scanner;



/*      choice basis calculator your can 
      perform your action as per your desire*/

public class A2_A7th_program_calculator_symbol {
	
	public void getdata() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the input");
	int input1 = sc.nextInt();
	System.out.println("Please enter the choice + for add - for subtract");
	String choice = sc.next();
	System.out.println("Please enter the 2nd input");
	int input2 = sc.nextInt();
	int output=0;
	if(choice.equals("+")) {
		output=input1+input2;
	}
	else if(choice.equals("-")) {
		output=input1-input2;
	}
	else {
		System.out.println("wrong choice");
	}
	System.out.println(output);
	}
     public static void main(String[] args) {
    	 A2_A7th_program_calculator_symbol ob=new A2_A7th_program_calculator_symbol();
    	 ob.getdata();
	}
}
