package forloop_and_array_5th_package;

import java.util.Scanner;

public class A3d_program_Array_demo_char {
	
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
		A3d_program_Array_demo_char ob=new A3d_program_Array_demo_char();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the quantity of student");
		int size = sc.nextInt();
		ob.arraydemo(size);
	}

}
