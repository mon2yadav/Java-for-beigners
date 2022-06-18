package forloop_and_array_5th_package;

import java.util.Scanner;

public class Vishal_Mega_mart_multiple_product_4th_program {

public void getdetail(String name , int size) {
		  
		
//		System.out.println("*****VISHAL*****MEGA*****MART*****");
//		System.out.println();
//		System.out.println("customer name is           "  +  name);
		
		System.out.println("Enter the product quantity "+size);
}


	public static void main(String[] args) {
		
		Vishal_Mega_mart_multiple_product_4th_program ob=new Vishal_Mega_mart_multiple_product_4th_program();
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
