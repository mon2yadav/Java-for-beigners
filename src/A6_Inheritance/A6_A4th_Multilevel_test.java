package A6_Inheritance;

import java.util.Scanner;

class AAA{
	
	public String reverseString(String input) {
		String out="";
		 char c[]=input.toCharArray();
		int len = c.length-1;
		for(int i=len; i>=0; i--) {
			out=out+c[i];
		}
		return out;
		
		
	}
}

class BBB extends AAA{
	
	public void reverseStringSamePosition(String input) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input1=sc.nextLine();
		String out="";
		String[] c = input1.split(" ");
		for(int i=0; i<=c.length-1; i++) {
			char[] b = c[i].toCharArray();
			for(int j=b.length-1; j>=0; j--)
			{
			  out=out+b[j];	
			}
			out=out+" ";
		}
		System.out.println(out);
		
	}
	
	
}

public class A6_A4th_Multilevel_test extends BBB {
	
	public void printdata() {
		System.out.println("This method id from print data");
	}
	
	
	
	
	public static void main(String[] args) {
		A6_A4th_Multilevel_test ob=new A6_A4th_Multilevel_test();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string");
		String input1 = sc.next();
		String data =ob.reverseString(input1);
		System.out.println(data);
		
		ob.reverseStringSamePosition(input1);
		ob.printdata();
		
	}

}
