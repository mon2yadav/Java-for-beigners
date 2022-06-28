package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A5_B9th_program_StringCount {
	
	public int Stringcount(String input, String str) {
		int count=0; 
		
		String[] out = input.split(" ");
		for(int i=0; i<=out.length-1; i++) {
			if(out[i].equals(str)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		A5_B9th_program_StringCount ob=new A5_B9th_program_StringCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Sentence");
		String input = sc.nextLine();
		System.out.println("Enter the String for find");
		String str = sc.next();
		int out1 = ob.Stringcount(input, str);
		System.out.println(out1);
	}

}
