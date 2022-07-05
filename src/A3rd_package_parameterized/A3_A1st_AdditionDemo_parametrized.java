package A3rd_package_parameterized;

/*   In this program all data take from different client 
   e.g at the result check time differnt client have 
   different rollnumber
   That time we need this program;*/

public class A3_A1st_AdditionDemo_parametrized {
	public void getdata(int a, int b)  //parametrized  and non return type
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		A3_A1st_AdditionDemo_parametrized ob=new A3_A1st_AdditionDemo_parametrized();
		ob.getdata(12, 12);
	}
}
