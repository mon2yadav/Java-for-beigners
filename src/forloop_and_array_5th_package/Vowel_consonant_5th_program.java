package forloop_and_array_5th_package;

import java.util.Scanner;

public class Vowel_consonant_5th_program {
	
	public void checkVowelConsonanat(int size) {
		char a[]=new char[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the alphabet");
		for(int i=0; i<size; i++) {
			a[i]=sc.next().charAt(0);
		}
		for(int j=0; j<=size-1; j++)
		{
			if(a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u') {
				System.out.println(a[j]+ " is a vowel");
			}
			else
			{
				System.out.println(a[j]+ " is a consonant");
			}
		}
	}
	
	public static void main(String[] args) {
		Vowel_consonant_5th_program ob=new Vowel_consonant_5th_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the alphbet size");
		int size = sc.nextInt();
		ob.checkVowelConsonanat(size);
	}

}
