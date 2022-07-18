package A5_ForLoop_And_Array;

import java.util.Scanner;

public class A5_B5th_AramStrong {
	
	public void armstrong(int num) {
		  
		int b=0;
		int c=0;
		int temp = num;
		for(;num>0;) {
			b=num%10;
			num=num/10;
			c=c+(b*b*b);
			
		}
		if(temp==c) {
			System.out.println(temp+" is a ArmStrong Number");
		}
		else {
			System.out.println(temp+" is not a ArmStrong Number");
		}
	}
	
	
	public static void main(String[] args) {
		A5_B5th_AramStrong ob=new A5_B5th_AramStrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int input = sc.nextInt();
		ob.armstrong(input);
		
	}

}
