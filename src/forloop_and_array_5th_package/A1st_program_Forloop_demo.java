package forloop_and_array_5th_package;

import java.util.Scanner;

public class A1st_program_Forloop_demo {
	
	public void forloopdemo(int num) {
		for(int i=1; i<=20000; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
	}
	public static void main(String[] args) {
		A1st_program_Forloop_demo ob=new A1st_program_Forloop_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number for table");
		int num = sc.nextInt();
		ob.forloopdemo(num);
	}

}
