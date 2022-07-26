package B4_Interface;

interface naveen {
	public void getdata();
}

interface montu {
	public void showdata();
}

interface neha {
	public void printdata();
}

interface pinki {
	public void displaydata();
}

public class B4_A2nd_Interface_multipleInheritance implements naveen, montu, neha, pinki {

	@Override
	public void displaydata() {
		System.out.println("display data");

	}

	@Override
	public void printdata() {
		System.out.println("Print data");

	}

	@Override
	public void showdata() {
		System.out.println("Show data");

	}

	@Override
	public void getdata() {
		System.out.println("Hello get data");

	}

	public static void main(String[] args) {

		B4_A2nd_Interface_multipleInheritance ob = new B4_A2nd_Interface_multipleInheritance();
		ob.displaydata();
		ob.printdata();
		ob.getdata();
		ob.showdata();
	}

}
