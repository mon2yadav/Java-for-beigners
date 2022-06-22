package A3rd_package_parameterized;

import java.util.Scanner;

/*    This program is return type because in this 
    		programe we are not using the void
    		so this program is known as return type 
    				e.g paytm gives us return message for each and every transaction;*/

public class A3_A3rd_program_Addition_returnType {
	
	public int addition(int a, int b) {                 //parameterized and return type
		int c=a+b;
		return c;
		
	} 
	
	public static void main(String[] args) {
		A3_A3rd_program_Addition_returnType ob=new A3_A3rd_program_Addition_returnType();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two input for add");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int out = ob.addition(a, b);
		System.out.println(out);
	}

}
