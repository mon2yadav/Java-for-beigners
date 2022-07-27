package B7_String_Demo;

public class B7_A3rd_StringBufferDemo {
	
	public static void getdata() {
		String s ="HelloDemo";
		String out = s.replace("ll","o");
		System.out.println(out);
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Montu");   //String buffer make the mutable string the value will be change in normal print "sb".
		StringBuffer out1 = sb.insert(5, " yadav");
		System.out.println(out1);
		System.out.println(sb);
		
		
	}
	
	public static void main(String[] args) {
		
		getdata();
	}

}
