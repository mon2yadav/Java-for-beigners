 package B1_Exception_handling;

public class B1_A5th_Finally_demo {
	
	public void showdata() {
		try {
			int a=10/0;
			
		} catch (Exception e) {
			System.out.println("Issue in show data "+e);
		}
		finally {                               // Finally block always excute wheather exception is present or not.
			System.out.println("Hellow finally block ");
		}
	}
	
	
	public static void main(String[] args) {
		B1_A5th_Finally_demo ob=new B1_A5th_Finally_demo();
		ob.showdata();
	}

}
