package A5th_ForLoop_And_Array;

import java.util.Scanner;

public class A5_A9th_ReverseStringComparision {
	
	public void getdata(String input , String search) {
		int k=0;
		String[] str = input.split(" ");
		String out="";
		for(int i=str.length-1; i>=0; i++) {
			if(str[i].equals(search)) {
				k=1;
			char	c[]=search.toCharArray();
			for(int j=c.length-1; j>=0; j--) {
				out=out+c[j];
			}
			System.out.println(out);
			}
			}
		if(k==0)
		{
			System.out.println("wrong entity");
		}
		
	}
	public static void main(String[] args) {
	
		A5_A9th_ReverseStringComparision ob=new A5_A9th_ReverseStringComparision();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.nextLine();
		System.out.println("Enter the string for search");
		String search = sc.next();
		ob.getdata(input, search);
	}

}
