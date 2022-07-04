package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A5_C5th_program_secondmaxNew2 {
	
	public void getdata(int arr[]) {
		int temp=0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0; k<=arr.length-1; k++)
				 {
			System.out.println(arr[k]);
			
			
		}
		System.out.println("Your seconds highest value is  " +arr[arr.length-2]);
	}
	
	public static void main(String[] args) {
		A5_C5th_program_secondmaxNew2 ob=new A5_C5th_program_secondmaxNew2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of array ");
		int size = sc.nextInt();
		System.out.println("Enter the numbers ");
		int a[]=new int[size];
		for(int p=0; p<=a.length-1; p++) {
			a[p]=sc.nextInt();
		}
		ob.getdata(a);
	}

}
