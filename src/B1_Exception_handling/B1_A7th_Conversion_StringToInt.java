package B1_Exception_handling;

public class B1_A7th_Conversion_StringToInt {
	
	public void convertdata() {
		
		String k="123";
		int out = Integer.parseInt(k);    // This method is used to convert string data into integer data.
		System.out.println(out+1);
		System.out.println(k+1);           // This out is the example of con-cantination
		
	}
	
	public static void main(String[] args) {
		B1_A7th_Conversion_StringToInt ob=new B1_A7th_Conversion_StringToInt();
		ob.convertdata();
	}

}
