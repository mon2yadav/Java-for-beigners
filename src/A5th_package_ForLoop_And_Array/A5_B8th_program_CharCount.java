package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A5_B8th_program_CharCount {
	
	public int charcount(String input , int c) {
		int count=0;
		char[] out = input.toCharArray();
		for(int i=0; i<=out.length-1; i++) {
			if(out[i]==c) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		A5_B8th_program_CharCount ob=new A5_B8th_program_CharCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.next();
		System.out.println("Enter the character for count");
		char c = sc.next().charAt(0);
		int charcount = ob.charcount(input, c);
		System.out.println(charcount);
	}

}
