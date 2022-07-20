package A8_ConstructorDemo;


class javademooo{                            //Parent class
	
	public void showdata() {
		int a=20;
		System.out.println("Parent class");
	}
}

public class A8_A3rd_Super_Demo extends javademooo {                                 //Child class
	
	public void showdata() {
		 int a=30;
		 super.showdata();
		 System.out.println("Child class ");
	}
	
	public static void main(String[] args) {
		A8_A3rd_Super_Demo ob=new A8_A3rd_Super_Demo();
		ob.showdata();
	}

}
