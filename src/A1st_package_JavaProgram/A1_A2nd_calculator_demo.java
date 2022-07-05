package A1st_package_JavaProgram;

import java.util.Scanner;

public class A1_A2nd_calculator_demo {
	int a,b,c;  //This is global variable b/c it is outside the class and used in different method as per requirement
	Scanner sc=new Scanner(System.in);
	int e=sc.nextInt();
	 int f=sc.nextInt();
	
	public void addition() {
		System.out.println("Please enter the two number for Add");
		a=e;
		b=f;
		c=a+b;
		System.out.println("Your result is "+c);
	}
	public void subtraction() {
		System.out.println("Please enter the two number for subtrac");
		a=e;
		b=f;
		c=a-b;
		System.out.println("Your result is "+c);
	}
	public void multiplication() {
		System.out.println("Please enter the two numbre for multiply");
		a=e;
		b=f;
		c=a*b;
		System.out.println("Your result is "+c);
	}
	public void division() {
		System.out.println("Please enter the two number for divide");
		a=e;
		b=f;
		c=a/b;
		System.out.println("Your result is "+c);
	}
	
	
	public static void main(String[] args) {
		
		A1_A2nd_calculator_demo ob=new A1_A2nd_calculator_demo();
		ob.addition();
		ob.subtraction();
		ob.multiplication();
		ob.division();
		
	}

}
