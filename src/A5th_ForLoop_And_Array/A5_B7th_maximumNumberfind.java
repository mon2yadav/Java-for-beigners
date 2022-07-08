package A5th_ForLoop_And_Array;

import java.util.Scanner;



public class A5_B7th_maximumNumberfind {
	
	
	 public int maximumnumber(int a[]) {
		 int max=0;
		 for(int j=0; j<=a.length-1; j++) {
			 if(a[j]>max) {
				 max=a[j];
			 }
		 }
		 return max;
	 }
	
	public static void main(String[] args) {
		A5_B7th_maximumNumberfind ob=new A5_B7th_maximumNumberfind();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter the numeric numbers");
		int a[]=new int[size];
		for(int i=0; i<=size-1; i++) {
			a[i]=sc.nextInt();
		}
		int out = ob.maximumnumber(a);
		System.out.println("maximum number is  "+out);
	}

}
