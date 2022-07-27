package B5_While_Loop;

import java.util.Scanner;

public class B5_A1st_While_LoopDemo {
	
	public static void getdata(int num) {
		
		int temp=num;
		int sum=0;
		while(num>0) {
			
			int a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
			
			
		}
		if(temp==sum) {
			System.out.println("This number is armstrong");
		}
		else {
			System.out.println("This number is not arm strong ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number ");
		int input = sc.nextInt();
		
		getdata(input);
	}

}
