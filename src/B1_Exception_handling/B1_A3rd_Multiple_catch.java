package B1_Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B1_A3rd_Multiple_catch {
	
	public void showdata() {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the value");
			int dd = sc.nextInt();
			int b=12/dd;
			System.out.println(b);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Input mismatch exception  "+e);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic exception "+e);
		}
	}
	
	public void getdata() {
		System.out.println("get data ");
	}
	public void printdata() {
		System.out.println("Printdata");
	}
	
	public static void main(String[] args) {
		B1_A3rd_Multiple_catch ob=new B1_A3rd_Multiple_catch();
		ob.showdata();
		ob.getdata();
		ob.printdata();
	}

}
