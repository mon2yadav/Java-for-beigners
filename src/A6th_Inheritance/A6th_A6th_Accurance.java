package A6th_Inheritance;

import java.util.Scanner;

public class A6th_A6th_Accurance {
	
	public void accurance(String input) {
		char[] dd = input.toCharArray();
		for(int i=0; i<=dd.length-1;i++) {
			int count=0;
			for(int j=0; j<=dd.length-1; j++) {
				if(dd[i]==dd[j]) {
					count++;
				}
			}
			System.out.println(dd[i]+" is comes "+count+" times");
		}
	}
	
	public static void main(String[] args) {
		A6th_A6th_Accurance ob=new A6th_A6th_Accurance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string ");
		String input = sc.next();
		ob.accurance(input);
	}

}
