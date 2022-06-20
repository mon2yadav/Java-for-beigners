package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A6th_program_odd_even {
	public void arraydemo(int size) {
		int a[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		for(int j=size-1; j>=0; j--) {
			if(a[j]%2==0) {
				System.out.println(a[j] + " is even");
			}
			else {
				System.out.println(a[j]+ " is odd");
			}
		}
	}
	
	public static void main(String[] args) {
		A6th_program_odd_even ob=new A6th_program_odd_even();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size");
		int size = sc.nextInt();
		
		ob.arraydemo(size);
	}
}
