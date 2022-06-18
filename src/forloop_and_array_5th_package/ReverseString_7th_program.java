package forloop_and_array_5th_package;

import java.util.Scanner;

public class ReverseString_7th_program {
	
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
		ReverseString_7th_program ob=new ReverseString_7th_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.next();
		String out = ob.getreverse(input);
		System.out.println(out);
	}

}
