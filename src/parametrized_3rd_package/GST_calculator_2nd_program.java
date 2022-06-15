package parametrized_3rd_package;

import java.util.Scanner;

public class GST_calculator_2nd_program {
	
	public void GSTcalculate(float amount) {
		float GST;
		if(amount>=500 && amount<=1000)
		{
			GST=(amount*5)/100;
		}
		else if(amount >1000 && amount<=2000)
		{
		     GST=(amount*10)/100;
		}
		else
		{
			GST=(amount*18)/100;
		}
		
		System.out.println("Your GST "+GST);
		float total = GST+amount;
		System.out.println("Your payable amount "+total);
	}
	
	public static void main(String[] args) {
		GST_calculator_2nd_program ob=new GST_calculator_2nd_program();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the amount");
		float amount = sc.nextFloat();
		ob.GSTcalculate(amount);
	}

}
