package A2nd_package_If_Else_Demo;

import java.util.Scanner;

public class A3rd_program_vowel_consonant {
	
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