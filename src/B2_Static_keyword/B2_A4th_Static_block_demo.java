package B2_Static_keyword;

public class B2_A4th_Static_block_demo {
	
	
	public B2_A4th_Static_block_demo() {
		System.out.println("Hellow constructor ");
	}
	static {                                       //Static block always execute first before the constructor also.
		System.out.println("Hellow static block ");
	}
   public static void main(String[] args) {
	   B2_A4th_Static_block_demo ob=new B2_A4th_Static_block_demo();
	System.out.println("Hellow main block ");
}
}
