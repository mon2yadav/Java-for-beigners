package A1st_package_JavaProgram;


/* In this program all
 *  data is take from user at run time*/

import java.util.Scanner;

public class A1_A3rd_program_calculator_demo {
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
		A1_A3rd_program_calculator_demo ob=new A1_A3rd_program_calculator_demo();
		ob.addition();
		ob.subtraction();
		ob.multiplication();
		ob.divide();
	}

}
