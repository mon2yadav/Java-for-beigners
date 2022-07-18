package A6_Inheritance;

import A1_JavaProgram.A1_A2nd_calculator_demo;

class Abcddemo                           // Parent class
{
	
	public void additon() {
		System.out.println("Addition");              // In the inheritance parent class inherit the method of child class
	}
	                                                  // In the single level inheritance only one class inherit with another class 
}

public class A6_A1st_SingleLevel_Inheritance extends A1_A2nd_calculator_demo                   //Child class
{
	
	
	public void subtraction() {
		System.out.println("subtraction");
	}
	
	public static void main(String[] args) {
		A6_A1st_SingleLevel_Inheritance ob=new A6_A1st_SingleLevel_Inheritance();
		ob.subtraction();
		ob.addition();
		ob.subtraction();
		ob.division();
		ob.multiplication();
		
	}

}
