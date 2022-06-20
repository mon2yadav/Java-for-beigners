package A1st_package_JavaProgram;

public class A1st_program_Addition {
	int a,b,c;
	public void addition() {
		 a=500;
		 b=400;
	     c=a+b;
		System.out.println(c);
	}
	
	public void subtraction() {
		a=450;
		b=150;
		c=a-b;
		System.out.println(c);
	}
	public void multiplication() {
		a=23;
		b=34;
		c=a*b;
		System.out.println(c);
	}
	public void divide() {
		a=676;
		b=26;
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		A1st_program_Addition ob=new A1st_program_Addition();
		ob.addition();
		ob.subtraction();
		ob.multiplication();
		ob.divide();
		
		
		
		
		
	}
}
