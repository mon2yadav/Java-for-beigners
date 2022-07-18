package A7_Polymorphism;

import java.util.Scanner;

class BJP{
	
	public float GST(float input) {
		float output = (input*18)/100;
		return output;
	}
}

class Congress extends BJP {
	 public float GST(float input) {
		 float output = (input*5)/100;
		 return output;
	 }
}

public class A7_A2nd_Overriding {
	
	public static void main(String[] args) {
		Congress ob=new Congress();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the amount to calculate current GST ");
		int amt = sc.nextInt();
		float output = ob.GST(amt);
		System.out.println(output);
	}

}
