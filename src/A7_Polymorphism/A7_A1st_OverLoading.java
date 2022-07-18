package A7_Polymorphism;

public class A7_A1st_OverLoading {
	
	public int Addition(int a, int b) {
		return a+b;
	}
	public int Addition(int a, int b, int c) {
		return a+b+c;
	}
	public int Addition(int a, int b, int c, int d) {
		return a+b+c+d;
	}

	public static void main(String[] args) {
		A7_A1st_OverLoading ob=new A7_A1st_OverLoading();
		int data = ob.Addition(11, 12,14,15);
		System.out.println(data);
	}
}


