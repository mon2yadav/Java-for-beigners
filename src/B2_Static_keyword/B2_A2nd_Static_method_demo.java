package B2_Static_keyword;

class AAAA{
	                                    // Static method access only static variable
	                                                      // No need to create the class object of the static method only method name  
	 static int a=20;                                                      // is enough to call the class
	public static  void getdata() {
		
		System.out.println("Hellow static data method  "+a);
	}
}

public class B2_A2nd_Static_method_demo {
	static int a=10;
	public  static void showdata() {
		
		System.out.println("Hellow static method  "+a);
	}
	
	public static void main(String[] args) {
		AAAA.getdata();
		showdata();
	}

}
