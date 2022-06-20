package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A7th_program_ReverseString {
	
	public String getreverse(String input) {
		String out="";
		char c[]=input.toCharArray();
		int len = c.length-1;
		for(int i=len; i>=0; i--) {
			out=out+c[i];
//			out=out+" "+c[i];
//			System.out.print(c[i]);
//			System.out.print(" "+c[i]);
		}
		return out;
	}
	
	public static void main(String[] args) {
		A7th_program_ReverseString ob=new A7th_program_ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.next();
		String out = ob.getreverse(input);
		System.out.println(out);
	}

}
