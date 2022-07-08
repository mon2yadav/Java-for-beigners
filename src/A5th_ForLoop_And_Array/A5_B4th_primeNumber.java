package A5th_ForLoop_And_Array;

import java.util.Scanner;

public class A5_B4th_primeNumber {
	
	public void getdata(int num) {
		int flag=0;
		if(num==0 || num==1) {
			System.out.println(num+" is not prime number");
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					System.out.println(num+" is not prime Number");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println(num+" is a prime Number");
			}
		}
	}
	
	
	public static void main(String[] args) {
		A5_B4th_primeNumber ob=new A5_B4th_primeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int input = sc.nextInt();
		ob.getdata(input);
	}

}
