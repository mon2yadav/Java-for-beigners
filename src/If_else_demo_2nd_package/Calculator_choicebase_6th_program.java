package If_else_demo_2nd_package;

import java.util.Scanner;

public class Calculator_choicebase_6th_program {
	static Scanner sc=new Scanner(System.in);
	int input1,input2,output;
	public void add()
	{
		System.out.println("Please enter Two input for add");
		input1=sc.nextInt();
		input2=sc.nextInt();
		output=input1+input2;
		System.out.println(output);
	}
	public void sub()
	{
		System.out.println("Please enter Two input for subtract");
		input1=sc.nextInt();
		input2=sc.nextInt();
		output=input1-input2;
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Calculator_choicebase_6th_program ob=new Calculator_choicebase_6th_program();
		System.out.println("Please select 1 for add and 2 for subtract");
		int choice = sc.nextInt();
		if(choice==1) {
			ob.add();
		}
		else if(choice==2) {
			ob.sub();
		}
		else
		{
			System.out.println("wronge choice");
		}
		
	}

}
