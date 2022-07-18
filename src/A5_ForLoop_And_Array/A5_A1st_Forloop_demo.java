package A5_ForLoop_And_Array;

import java.util.Scanner;

public class A5_A1st_Forloop_demo {
	
	public void forloopdemo(int num) {
		for(int i=1; i<=20000; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
	}
	public static void main(String[] args) {
		A5_A1st_Forloop_demo ob=new A5_A1st_Forloop_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number for table");
		int num = sc.nextInt();
		ob.forloopdemo(num);
	}

}
