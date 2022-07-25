package B1_Exception_handling;

import java.util.Scanner;

public class B1_A4th_Number_Count {
	
	public void getdata(long num, int num1) {
		
		try {
			int count=0;
			for(;num>0;) {
				
				long a = num%10;
				 num=num/10;
				if(a==num1) {
					count++;
				}
			}
			System.out.println(num1+" is comming "+count+" Times");
			
		} catch (Exception e) {
			System.out.println("Issue in number count");
		}
	}
	
	public static void main(String[] args) {
		B1_A4th_Number_Count ob=new B1_A4th_Number_Count();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		long dd = sc.nextLong();
		System.out.println("Select the number for find");
		int bb = sc.nextInt();
		ob.getdata(dd, bb);
	}

}
