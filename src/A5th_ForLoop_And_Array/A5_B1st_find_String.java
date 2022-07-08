package A5th_ForLoop_And_Array;

import java.util.Scanner;




public class A5_B1st_find_String {
	
	public void findstring(String input, String data) {
		int count=0;
		
		String []str=input.split(" ");
		for(int i=0; i<=str.length-1; i++) {
			if(str[i].equals(data)) {
				count++;
			}
		
			
		}
		
		
		if(count==0) {
			System.out.println("Wrong entity");
		}
		
		System.out.print(count++);
		}
	
	public static void main(String[] args) {
		A5_B1st_find_String ob=new A5_B1st_find_String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.nextLine();
		System.out.println("Enter the String for search");
		String data = sc.next();
		 ob.findstring(input, data);
         		
		
		
	}

}
