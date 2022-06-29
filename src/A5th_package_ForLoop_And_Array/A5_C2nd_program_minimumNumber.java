package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A5_C2nd_program_minimumNumber {
	
	
	public int getminimumnumber(int a[]) {
		int min=a[0];
		for(int j=0; j<=a.length-1; j++) {
			if(a[j]<min) {
				min=a[j];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		A5_C2nd_program_minimumNumber ob=new A5_C2nd_program_minimumNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the Numbers");
		int a[]=new int[size];
		for(int i=0; i<=size-1; i++) {
			a[i]=sc.nextInt();
		}
		int out = ob.getminimumnumber(a);
		System.out.println(out);
		
	}

}
