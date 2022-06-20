package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A2nd_program_ArrayDemo {
	
	
	public void arraydemo(int size) {
		int a[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		for(int j=size-1; j>=0; j--) {
			System.out.println(a[j]);
		}
	}
	
	public static void main(String[] args) {
		A2nd_program_ArrayDemo ob=new A2nd_program_ArrayDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size");
		int size = sc.nextInt();
		
		ob.arraydemo(size);
	}

}
