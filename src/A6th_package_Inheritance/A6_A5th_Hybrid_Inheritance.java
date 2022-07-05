package A6th_package_Inheritance;

class AA{                                                       //This class is using with two classes this is known as hierarical inheritance
	
	public void getdata() { 
		System.out.println("This method called by getdata");
	}
}
class BB extends AA{                                              
	
	public void showdata() {
		System.out.println("This method called by showdata");
	}
}
class CC extends AA{
	
	public void displaydata() {
		System.out.println("This method called by display data");
	}
}

public class A6_A5th_Hybrid_Inheritance  extends CC{                        //In this method the combination of two methods(like:- hierarical and hybrid)
	
	public void printdata() {
		System.out.println("This method called by print data ");
	}
	
	
	public static void main(String[] args) {
		A6_A5th_Hybrid_Inheritance ob=new A6_A5th_Hybrid_Inheritance();
		ob.displaydata();
		ob.getdata();
		ob.printdata();
		                 BB ob1=new BB();
		ob1.showdata();
		ob1.getdata();
	}

}
