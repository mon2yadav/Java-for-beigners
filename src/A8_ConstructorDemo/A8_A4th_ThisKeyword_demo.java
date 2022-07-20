package A8_ConstructorDemo;

public class A8_A4th_ThisKeyword_demo {
	int a;
	public void A8_A4th_ThisKeyword_demo(int a) {
		this.a=a;
		                                        //This keyword always refers to the global variable.
	}
	public void shwodata() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		A8_A4th_ThisKeyword_demo ob=new A8_A4th_ThisKeyword_demo();
		A8_A4th_ThisKeyword_demo ob1=new A8_A4th_ThisKeyword_demo();
		ob.A8_A4th_ThisKeyword_demo(0);
		ob.shwodata();
	}

}
