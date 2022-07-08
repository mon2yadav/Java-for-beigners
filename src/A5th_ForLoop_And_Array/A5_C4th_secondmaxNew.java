package A5th_ForLoop_And_Array;

import java.util.Scanner;

public class A5_C4th_secondmaxNew {     // This program works properly done ok report
	
	public int getdata(int arr[]) {
		
		
		  int max=0;
		  int secondmax=0; 
		  for(int i=0; i<=arr.length-1; i++) {
		  if(max<arr[i]) {
			  secondmax=max;
			  max=arr[i]; } 
		  else if(secondmax<arr[i]) { 
			  secondmax=arr[i];
		  
		  } } 
		  return secondmax;
		 
		 
	}
	
	public static void main(String[] args) {
		A5_C4th_secondmaxNew ob=new A5_C4th_secondmaxNew();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of array ");
		int size = sc.nextInt();
		System.out.println("Enter the numbers");
		int a[]=new int[size];
		for(int j=0; j<=a.length-1; j++) {
			a[j]=sc.nextInt();
		}
		int data = ob.getdata(a);
		System.out.println("Your second max number is "+data);
	}

}
