package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class B2nd_program_CountAllString {
	
	/*
	 * input: my name is montu city is delhi
	 * 
	 * output: {
	 * 		"my":1,
	 * 		"name":1,
	 * 		"is":2,
	 * 		"city":1,
	 * 		"delhi":1
	 * 		}
	 * 
	*/
	
	public void  countallstring(String input) {
		int count=0;
		String[] str = input.split(" ");
		for(int i=0; i<=str.length-1; i++) {
			if(str[i].equals(str) ) {
				count++;
				
			}
		}
		System.out.println("Your sentence has " + count+ " words.");
		
	}
	
	public static void main(String[] args) {
		B2nd_program_CountAllString ob=new B2nd_program_CountAllString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.next();
		  ob.countallstring(input);
		
	}

}
