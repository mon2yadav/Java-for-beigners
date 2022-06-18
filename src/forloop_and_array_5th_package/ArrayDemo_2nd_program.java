package forloop_and_array_5th_package;

import java.util.Scanner;

public class ArrayDemo_2nd_program {
	
	
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
		ArrayDemo_2nd_program ob=new ArrayDemo_2nd_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size");
		int size = sc.nextInt();
		
		ob.arraydemo(size);
	}

}
