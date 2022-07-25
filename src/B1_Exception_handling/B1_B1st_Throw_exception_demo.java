package B1_Exception_handling;

public class B1_B1st_Throw_exception_demo {
	
	public void showdata(int age) {
		
		if(age<18) {
			throw new ArithmeticException("Age is less than 18 ");   //This is user defined exception when input is not met the condition
		}
		else {
			System.out.println("you are eligible for vote");
		}
	}
	
	public static void main(String[] args) {
		B1_B1st_Throw_exception_demo ob=new B1_B1st_Throw_exception_demo();
		ob.showdata(12);
	}

}
