package parametrized_3rd_package;



public class Addition_demo_parameterized_1st_program {
	public void getdata(int a, int b)  //parametrized
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Addition_demo_parameterized_1st_program ob=new Addition_demo_parameterized_1st_program();
		ob.getdata(12, 12);
	}
}
