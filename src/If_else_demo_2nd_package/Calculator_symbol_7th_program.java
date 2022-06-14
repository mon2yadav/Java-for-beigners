package If_else_demo_2nd_package;

import java.util.Scanner;

public class Calculator_symbol_7th_program {
	
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
    	 Calculator_symbol_7th_program ob=new Calculator_symbol_7th_program();
    	 ob.getdata();
	}
}
