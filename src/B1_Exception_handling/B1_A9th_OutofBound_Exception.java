package B1_Exception_handling;

public class B1_A9th_OutofBound_Exception {
	
	public void showdata() {
		try {
			int a[]=new int[5];
			a[6]=65;                   //In this situation array index size is 5 but we enter the data at the 6th position so we get the out of bound exception.
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Issue in show data "+e);
		}
		
	}
	
	public static void main(String[] args) {
		B1_A9th_OutofBound_Exception ob=new B1_A9th_OutofBound_Exception();
		ob.showdata();
	}

}
