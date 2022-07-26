package B4_Interface;

interface ABC{
	
	public void showdata();
	public void printdata();
}

public class B4_A1st_Interface_demo implements ABC {

	@Override
	public void showdata() {
		System.out.println("Hellow showdata");
		
	}

	@Override
	public void printdata() {
		System.out.println("Hellow printdata ");
		
	}
	public static void main(String[] args) {
		B4_A1st_Interface_demo ob=new B4_A1st_Interface_demo();
		ob.showdata();
		ob.printdata();
		
	}
	


}
