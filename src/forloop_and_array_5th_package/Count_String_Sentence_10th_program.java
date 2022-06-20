package forloop_and_array_5th_package;

import java.util.Scanner;

public class Count_String_Sentence_10th_program {
	
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
		Count_String_Sentence_10th_program ob=new Count_String_Sentence_10th_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.nextLine();
		System.out.println("Enter the String for search");
		String data = sc.next();
		int out = ob.findstring(input, data);
		System.out.println(out);
		
		
	}

}
