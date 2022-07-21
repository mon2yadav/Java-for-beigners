package A9_Access_Modifiers;

class ajaydemo{
	private int a=10;
	private void showdata() {
		System.out.println("Hello data ");
	}
}

public class A9_A1st_Private_Access_Modifiers_Demo {
	
	public static void main(String[] args) {
		ajaydemo ob=new ajaydemo();
//		ob.showdata();                           // We can't access the show data method outside the class access only inside the class. due to private 
		                                                //modifiers.
	}

}
