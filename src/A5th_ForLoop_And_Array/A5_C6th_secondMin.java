package A5th_ForLoop_And_Array;

import java.util.Scanner;

public class A5_C6th_secondMin {
	
	public void getdata(int arr[]) {
		
		int temp=0;
		for(int j=0; j<=arr.length-1; j++) {
			for(int k=j+1; k<=arr.length-1; k++) {
				if(arr[j]>arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int p=0; p<=arr.length-1; p++)
				 {
			System.out.println(arr[p]);
			
		}
		System.out.println("Your minimum number is "+arr[0]);
		System.out.println("Your second minimum number is "+arr[1]);
		
	}
	
	public static void main(String[] args) {
		A5_C6th_secondMin ob=new A5_C6th_secondMin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size");
		int size = sc.nextInt();
		System.out.println("Enter the numbers ");
		int a[]=new int[size];
		for(int i=0; i<=a.length-1; i++) {
			a[i]=sc.nextInt();
		}
		ob.getdata(a);
		
	}

}
