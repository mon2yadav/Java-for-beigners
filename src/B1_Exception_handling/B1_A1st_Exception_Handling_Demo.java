package B1_Exception_handling;

public class B1_A1st_Exception_Handling_Demo {
	
	public void showdaa() {
		 int a=10/0;           // when any number divide by 0 result will be infinit(In this situation arithmetic exception will be come)/ by zero
		 
		 System.out.println(a);
	}
	public void getdata() {
		System.out.println("get data ");
	}
	public void printdata() {
		System.out.println("print data ");
	}
	
	public static void main(String[] args) {
		B1_A1st_Exception_Handling_Demo ob=new B1_A1st_Exception_Handling_Demo();
		
		ob.getdata();
		ob.showdaa();
		ob.printdata();
	}

}
