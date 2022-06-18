package forloop_and_array_5th_package;

import java.util.Scanner;

public class Forloop_demo_1st_program {
	
	public void forloopdemo(int num) {
		for(int i=1; i<=20000; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
	}
	public static void main(String[] args) {
		Forloop_demo_1st_program ob=new Forloop_demo_1st_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number for table");
		int num = sc.nextInt();
		ob.forloopdemo(num);
	}

}
