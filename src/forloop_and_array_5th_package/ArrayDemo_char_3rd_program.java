package forloop_and_array_5th_package;

import java.util.Scanner;

public class ArrayDemo_char_3rd_program {
	
	public void arraydemo(int size) {
		String a[]=new String[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name");
		for(int i=0; i<size; i++) {
			a[i]=sc.next();
		}
		for(int j=0; j<=size-1; j++) {
			System.out.println(a[j]);
		}
		
	}
	
	
	public static void main(String[] args) {
		ArrayDemo_char_3rd_program ob=new ArrayDemo_char_3rd_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the quantity of student");
		int size = sc.nextInt();
		ob.arraydemo(size);
	}

}
