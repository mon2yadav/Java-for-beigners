package java_progam_1st_package;

import java.util.Scanner;

public class Calculator_demo_3rd_program {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	public void addition() {
		System.out.println("Please enter the Two number for add");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Your result is "+c);
		
	}
	public void subtraction() {
		System.out.println("Please enter the Two number for subtract");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("Your result is "+c);
	}
	public void multiplication() {
		System.out.println("Please enter two number for multiply");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("Your result is "+c);
	}
	public void divide()
	{
		System.out.println("Please enter two number for divide");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Your result is "+c);
	}
	public static void main(String[] args) {
		Calculator_demo_3rd_program ob=new Calculator_demo_3rd_program();
		ob.addition();
		ob.subtraction();
		ob.multiplication();
		ob.divide();
	}

}
