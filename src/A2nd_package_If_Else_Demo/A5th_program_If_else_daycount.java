package A2nd_package_If_Else_Demo;

import java.util.Scanner;

public class A5th_program_If_else_daycount {
	
	
	public void daycount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name of the month");
		String input = sc.next();
		if(input.equalsIgnoreCase("january")||input.equalsIgnoreCase("march")||input.equalsIgnoreCase("may")
				||input.equalsIgnoreCase("july")||input.equalsIgnoreCase("august")||input.equalsIgnoreCase("october")
				||input.equalsIgnoreCase("december")) {
			System.out.println("31st days in this month");
		}
		else if(input.equalsIgnoreCase("february")) {
			System.out.println("Please enter the year");
			int year = sc.nextInt();
			if(year%4==0) {
				System.out.println("This is the leap year");
				System.out.println("This february have 29 days");
			}
			else
			{
				System.out.println("This is not leap year");
				System.err.println("This february have 28 days");
			}
		}
		else if(input.equalsIgnoreCase("april")||input.equalsIgnoreCase("june")||input.equalsIgnoreCase("september")||
				input.equalsIgnoreCase("november")) {
			System.out.println("30 days in this month");
		}
		else {
			System.out.println("Wronge entity");
		}
	}
	
	
	public static void main(String[] args) {
		A5th_program_If_else_daycount ob=new A5th_program_If_else_daycount();
		ob.daycount();
	}

}
