package B7_String_Demo;

public class B7_A5th_StringBuffer_New {
	
	public static void getdata() {
		
		StringBuffer sb=new StringBuffer("montu");
		StringBuffer out = sb.reverse();
		System.out.println(out);
		System.out.println(sb.insert(5, "yadav"));
		
		
		StringBuilder sb1=new StringBuilder("naveen");
		StringBuilder out1 = sb1.reverse();
		System.out.println(out1);
		System.out.println(sb1.insert(6, " gurjer"));
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
