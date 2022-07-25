package B1_Exception_handling;

public class B1_A6th_Nullpointer_Exception {
	
	public void printdata() {
		try {
			String s=null;                       //in this situation string s size is null and trying to find the size of s then we get the null pointer excep
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Issue in print data "+e);
		}
	}
	
	public static void main(String[] args) {
		B1_A6th_Nullpointer_Exception ob=new B1_A6th_Nullpointer_Exception();
		ob.printdata();
	}

}
