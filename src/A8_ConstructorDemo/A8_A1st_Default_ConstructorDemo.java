package A8_ConstructorDemo;

public class A8_A1st_Default_ConstructorDemo {
	
	public A8_A1st_Default_ConstructorDemo() {                   // Default constructor
		
		int a=10;
		System.out.println(a);
		
	}
	public void getdata() {
		int b=20;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		A8_A1st_Default_ConstructorDemo ob=new A8_A1st_Default_ConstructorDemo();
		ob.getdata();
		
	}

}
