package A2nd_If_Else_Demo;

import java.util.Scanner;

public class A2_A2nd_If_elseRuntime {
	
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
		A2_A2nd_If_elseRuntime ob=new A2_A2nd_If_elseRuntime();
		ob.ageidentifuer();
	}

}
