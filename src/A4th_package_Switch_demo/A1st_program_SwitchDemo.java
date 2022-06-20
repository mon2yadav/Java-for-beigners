package A4th_package_Switch_demo;

import java.util.Scanner;

public class A1st_program_SwitchDemo {
	
	public void switchdemo(String input) {
		  
		
		switch(input) {
		case "sunday":{
			System.out.println("sunday is the holiday");
			break;
		}
		case "monday":{
			System.out.println("Monday is the 1st day of weak");
			break;
		}
		case "tuesday":{
			System.out.println("Tuesday is the 2nd day of weak");
			break;
		}
		case"wednesday":{
			System.out.println("Wednesday is the 3rd day of weak");
			break;
		}
		case "thursday":{
			System.out.println("Thursday is the 4th day of weak");
			break;
		}
		case "friday":{
			System.out.println("Friday is the 5th day of weak");
			break;
		}
		case "saturday":{
			System.out.println("Saturday is the 6th day of weak");
			break;
		}
		default:
		{
			System.out.println("wrong entity");
			
		}
		}
		
		
	}
	public static void main(String[] args) {
		A1st_program_SwitchDemo ob =new A1st_program_SwitchDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the day name");
		String dayname = sc.next();
		ob.switchdemo(dayname);
		
	}

}
