package A8_ConstructorDemo;

import java.util.Scanner;

public class A8_A2nd_Parameterized_constructor {
	
	public A8_A2nd_Parameterized_constructor(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public void showdata(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the two number for add ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		A8_A2nd_Parameterized_constructor ob=new A8_A2nd_Parameterized_constructor(a,b);
		ob.showdata(12,13);
	}

}
