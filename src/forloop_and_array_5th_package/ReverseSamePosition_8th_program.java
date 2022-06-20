package forloop_and_array_5th_package;

import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseSamePosition_8th_program {

	
	public void getdata(String input) {
		
		String c[]=input.split(" ");
		String out="";
		for(int i=0; i<=c.length-1; i++) {
//		  char a=c[i].charAt(2);
		char[]	b=c[i].toCharArray();
		for(int j=b.length-1; j>=0; j--) {
			out=out+b[j];
		}
		out=out+" ";
		  
		  
		}
		System.out.println(out);
	}
	
	
	public static void main(String[] args) {
		ReverseSamePosition_8th_program ob=new ReverseSamePosition_8th_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence ");
		String input = sc.nextLine();
		ob.getdata(input);
	}
}
