package A3rd_package_parameterized;

import java.util.Scanner;

public class A3rd_program_Addition_returnType {
	
	public int addition(int a, int b) {                 //parameterized and return type
		int c=a+b;
		return c;
		
	} 
	
	public static void main(String[] args) {
		A3rd_program_Addition_returnType ob=new A3rd_program_Addition_returnType();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two input for add");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int out = ob.addition(a, b);
		System.out.println(out);
	}

}
