package If_else_demo_2nd_package;

import java.util.Scanner;

public class Addition_returnType_server_8th_program {
	
	public void getdata(int a, int b)  //parametrized
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Addition_returnType_server_8th_program ob=new Addition_returnType_server_8th_program();
		ob.getdata(12, 12);
	}

}
