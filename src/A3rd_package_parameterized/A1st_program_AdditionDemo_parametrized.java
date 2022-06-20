package A3rd_package_parameterized;



public class A1st_program_AdditionDemo_parametrized {
	public void getdata(int a, int b)  //parametrized  and non return type
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		A1st_program_AdditionDemo_parametrized ob=new A1st_program_AdditionDemo_parametrized();
		ob.getdata(12, 12);
	}
}
