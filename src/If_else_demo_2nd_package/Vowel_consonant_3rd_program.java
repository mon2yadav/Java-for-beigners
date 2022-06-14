package If_else_demo_2nd_package;

import java.util.Scanner;

public class Vowel_consonant_3rd_program {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the alphabet ");
		char input = sc.next().charAt(0);
		if(input=='a' || input=='e'||input=='i'||input=='o'||input=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("consonant");
		}
		
	}

}
