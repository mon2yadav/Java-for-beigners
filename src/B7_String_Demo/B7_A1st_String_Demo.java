package B7_String_Demo;

public class B7_A1st_String_Demo {
	
	public static void getdata() {
		
		String s="Hello";                 //By Literal
		String s1="Hello";                //By Literal
		String s2=new String("Hello");     //By New Keyword
		String s3=new String("Hello");     //By New Keyword
		
		if(s==s1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if(s==s2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		if(s2==s3) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
