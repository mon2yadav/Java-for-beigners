package forloop_and_array_5th_package;

import java.util.Scanner;

public class A10th_program_find_String {
	
	public int findstring(String input, String data) {
		int count=0;
		String []str=input.split(" ");
		for(int i=str.length-1; i>=0; i++) {
			
			if(str[i]==data) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		A10th_program_find_String ob=new A10th_program_find_String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.nextLine();
		System.out.println("Enter the String for search");
		String data = sc.next();
		int out = ob.findstring(input, data);
		System.out.println(out);
		
		
	}

}
