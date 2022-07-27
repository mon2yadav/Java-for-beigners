package B7_String_Demo;

public class B7_A2nd_String_MethodDemo {
	
	public static void method() {
		String s=" montu ";
		String s1="mon";
		String s2="MONTU";
		boolean out = s.equals(s1);   
		boolean out1 = s.equalsIgnoreCase(s1);
		                                              //boolean always contains true or false output
		System.out.println(out);
		System.out.println(out1);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));                    //equalsignorCase method is case senstive it does'nt matter letter small of capital
		
		System.out.println(s.contains(s1));                     //ex:- like mon is the part of the montu that means it contains reult is true but data should be same
		System.out.println(s.length());                         // This method gives us length of the string
		System.out.println(s.substring(3));                  // This method gives us the after third position of the string part
		
		System.out.println(s.substring(2, 5));
		System.out.println(s.replace('u', 'o'));              // This method is used to replace the character
		System.out.println(s.toUpperCase());               // This method is used to convert lower case to upper case
		System.out.println(s2.toLowerCase());             // this method is used to convert the upper case to lower case
		
		System.out.println(s.trim());                   //This method is used to remove the space in the semi colum
		
		
	}
	public static void main(String[] args) {
		method();
	}

}