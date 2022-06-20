package If_else_demo_2nd_package;

import java.util.Scanner;

public class A4th_program_Weakdays {
	
	public void weakdays() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name of day");
		String dayname = sc.next();
		if(dayname.equalsIgnoreCase("monday")) {
			System.out.println("First day of weak");
		}
		else if(dayname.equalsIgnoreCase("tuesday"))
		{
			System.out.println("Second day of weak");
		}
		else if(dayname.equalsIgnoreCase("wednesday")) {
			System.out.println("Third day of weak");
		}
		else if(dayname.equalsIgnoreCase("thursday")) {
			System.out.println("Forth day of weak");
		}
		else if(dayname.equalsIgnoreCase("friday")) {
			System.out.println("Fifth day of weak");
		}
		else if(dayname.equalsIgnoreCase("saturday")) {
			System.out.println("Sixth day of weak");
		}
		else if(dayname.equalsIgnoreCase("sunday")) {
			System.out.println("Holiday");
		}
		
	}
	

	
	
	
	public static void main(String[] args) {
		A4th_program_Weakdays ob=new A4th_program_Weakdays();
		ob.weakdays();

}
}
