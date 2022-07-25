package B1_Exception_handling;

public class B1_A8th_NumberFormat_Exception {
	
	public void showdata() {
		String k="montu";
		int out = Integer.parseInt(k);
		System.out.println(out);        //In this situation we trying to convert string data into integer so we get the number format exception.
		
	}
	
	public static void main(String[] args) {
		B1_A8th_NumberFormat_Exception  ob=new B1_A8th_NumberFormat_Exception();
		ob.showdata();
	}

}
