package B2_Static_keyword;

public class B2_A1st_Static_Variable_Demo {
	
	 static int a=0;                       // when variable is non static the result is 1,1,1 and with static 1,2,3 because of static variable allocates
	                                      //  memory only once.
	public B2_A1st_Static_Variable_Demo() {
		a++;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		B2_A1st_Static_Variable_Demo ob=new B2_A1st_Static_Variable_Demo();
		B2_A1st_Static_Variable_Demo ob1=new B2_A1st_Static_Variable_Demo();
		B2_A1st_Static_Variable_Demo ob2=new B2_A1st_Static_Variable_Demo();
	}

}
