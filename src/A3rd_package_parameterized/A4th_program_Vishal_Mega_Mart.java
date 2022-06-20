package A3rd_package_parameterized;

import java.util.Scanner;

public class A4th_program_Vishal_Mega_Mart {
	
	public void getdetail(String name , String productname, long mobile, float price) {
		  
		
		System.out.println("*****VISHAL  MEGA  MART*****");
		System.out.println();
		System.out.println("customer name is           "  +  name);
		System.out.println("product name is            "  +  productname);
		System.out.println("mobile number is           "  +  mobile);
		System.out.println("price  is                  "  +  price);
		float outgst = GSTcalculate(price);
		System.out.println("Your GST is                "  +  outgst);
		float totalamount = outgst+price;
		System.out.println("Your payable amount is     "  +  totalamount);
	}
	public float GSTcalculate(float price) {
		float GST=0;
		if(price<=500)
		{
			GST=(price*5)/100;
		}
		else if(price>500 && price<=1000)
		{
			GST=(price*10)/100;
		}
		else {
			GST=(price*18)/100;
		}
		return GST;
	}
	public static void main(String[] args) {
		
		A4th_program_Vishal_Mega_Mart ob=new A4th_program_Vishal_Mega_Mart();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Enter the product name");
		String pname = sc.next();
		System.out.println("enter your mobile number");
		long mobile = sc.nextLong();
		System.out.println("Enter the product price");
		float price = sc.nextFloat();
		ob.getdetail(name, pname, mobile, price);
	}

}
