package A5_ForLoop_And_Array;

import java.util.Scanner;

public class A5_B6th_primeNumber {
	
	public void getprimenumber() {
		int count=0;
			for(int i=2; i<=2000; i++) {
				int f=0;
				for(int j=2; j<i; j++)
						 {
					if(i%j==0) {
//						System.out.println(i+" is not prime");
						f=1;
						break;
					}
					
				}
				if(f==0) {
					System.out.println(i+" is prime");
					count++;
					
				}
			}
			System.out.println(count);
		}
	
	
	
	public static void main(String[] args) {
		
		A5_B6th_primeNumber ob=new A5_B6th_primeNumber();
		ob.getprimenumber();
		
	}

}
