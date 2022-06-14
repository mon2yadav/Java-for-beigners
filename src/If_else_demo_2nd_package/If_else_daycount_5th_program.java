package If_else_demo_2nd_package;

import java.util.Scanner;

public class If_else_daycount_5th_program {
	
	
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
				System.err.println("This february have 28 day");
			}
		}
		else if(input.equalsIgnoreCase("april")||input.equalsIgnoreCase("june")||input.equalsIgnoreCase("september")||
				input.equalsIgnoreCase("november")) {
			System.out.println("30 days in this month");
		}
	}
	
	
	public static void main(String[] args) {
		If_else_daycount_5th_program ob=new If_else_daycount_5th_program();
		ob.daycount();
	}

}
