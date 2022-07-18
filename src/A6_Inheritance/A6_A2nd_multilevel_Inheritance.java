package A6_Inheritance;

// multilevel inheritance

class XYZ{
	
	public void printdata(int a, int b) {
		System.out.println(a+b + " This method from XYZ");
	}
	
}
class PQR extends XYZ{
	
	public void showdata(int a, int b) {
		System.out.println(a-b + " This method from PQR");
	}
}

class LMN extends PQR{
	
	
	public void deletdata(int a, int b) {
		System.out.println(a*b  + " This method is called from LMN");
	}
}

class TUV extends LMN{
	
	public void creatdata(int a, int b) {
		System.out.println(a/b  + " This method is called from TUV");
	}
}

public class A6_A2nd_multilevel_Inheritance extends TUV {
	
	public void getdata() {
		System.out.println("This method is called from getdata ");
	}
	
	
	public static void main(String[] args) {
		A6_A2nd_multilevel_Inheritance ob=new A6_A2nd_multilevel_Inheritance();
		ob.getdata();
		ob.deletdata(12,12);
		ob.creatdata(144,12);
		ob.showdata(24,12);
		ob.printdata(6,6);
	}

}
