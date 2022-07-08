package A6th_Inheritance;

class STV{
	public void A() {
		System.out.println("A class method ");
	}
}

class KLM extends STV{
	
	public void B() {
		System.out.println("B class method");
	}
}

public class A6_A3rd_Hierarical_Inheritance extends STV {
	
	public void C() {
		System.out.println("C class method ");
	}
	
	
	public static void main(String[] args) {
		A6_A3rd_Hierarical_Inheritance ob=new A6_A3rd_Hierarical_Inheritance();
		ob.A();
		ob.C();
		KLM ob1=new KLM();
		ob1.A();
		ob1.B();
	}
	
	

}
