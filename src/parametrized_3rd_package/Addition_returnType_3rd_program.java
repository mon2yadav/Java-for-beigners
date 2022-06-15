package parametrized_3rd_package;

import java.util.Scanner;

public class Addition_returnType_3rd_program {
	
	public int addition(int a, int b) {                 //parameterized and return type
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		Addition_returnType_3rd_program ob=new Addition_returnType_3rd_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two input for add");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int out = ob.addition(a, b);
		System.out.println(out);
	}

}
