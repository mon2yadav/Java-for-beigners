package B1_Exception_handling;

public class B1_B2nd_Throws_Exception_Demo {
	
	public void getdata() throws InterruptedException , ArithmeticException, NumberFormatException {
		
		int a=20;
		System.out.println(a);
		Thread.sleep(2000);             // using this the code is interupted for the 2 seconds this type of exception is handled by hte throws exceptions.
		System.out.println("hello demo ");
	}
	
	public static void main(String[] args) throws NumberFormatException, ArithmeticException, InterruptedException {
		B1_B2nd_Throws_Exception_Demo ob=new B1_B2nd_Throws_Exception_Demo();
		ob.getdata();
	}

}
 