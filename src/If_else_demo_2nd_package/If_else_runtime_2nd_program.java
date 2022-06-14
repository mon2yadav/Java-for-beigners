package If_else_demo_2nd_package;

import java.util.Scanner;

public class If_else_runtime_2nd_program {
	
	public void ageidentifuer() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter your Age");
	   int age  =sc.nextInt();
	   if(age<18)
	   {
		   System.out.println("You are not Eligible for vote");
	   }
	   else if(age>=18 && age<60)
	   {
		   System.out.println("Eligible for Vote");
	   }
	   else
	   {
		   System.out.println("Eligible for Vote with senior citizen");
	   }
	}
	
	public static void main(String[] args) {
		If_else_runtime_2nd_program ob=new If_else_runtime_2nd_program();
		ob.ageidentifuer();
	}

}
