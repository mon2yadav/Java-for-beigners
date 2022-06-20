package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A4th_program_VishalMegaMard_multiple_product {

public void getdetail(String name , int size) {
		  
		
//		System.out.println("*****VISHAL*****MEGA*****MART*****");
//		System.out.println();
//		System.out.println("customer name is           "  +  name);
		
		System.out.println("Enter the product quantity "+size);
}


	public static void main(String[] args) {
		
		A4th_program_VishalMegaMard_multiple_product ob=new A4th_program_VishalMegaMard_multiple_product();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Enter the product quantity");
		int size = sc.nextInt();
		String a[]=new String[size];
		
		System.out.println("Please enter the product quantity ");
		for(int i=0; i<size; i++) {
			a[i]=sc.next();
		}
		for(int j=0; j<size; j++) {
			System.out.println(a[j]);
		}
		ob.getdetail(name,  size);
		
	
	}


}
