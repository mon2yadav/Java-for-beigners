package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

/*In this program the string is reversed 
as per the user enter the number

* example:- my name is montu
*  let suppose user enter the numeric number 4
*  in this situation the sentence have 4 alphabet 
*  will be reverse in the whole sentence
*  

*/

public class A5_B3rd_program_WrodCount {
	
	public void getdetail(String input, int number) {
		int k=0;
		String[] str = input.split(" ");
		for(int i=0; i<=str.length-1; i++)
		{
			String out="";
			int len = str[i].length();
			if(len==number) {
				char c[]=str[i].toCharArray();
				for(int j=c.length-1; j>=0; j--) {
					k=1;
					out=out+c[j];
				}
				System.out.println(out);
			}
		}
		if(k==0) {
			System.out.println("Wrong entity");
		}
	}
	
	public static void main(String[] args) {
		A5_B3rd_program_WrodCount ob=new A5_B3rd_program_WrodCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.nextLine();
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		ob.getdetail(input, num);
         		
	}

}
