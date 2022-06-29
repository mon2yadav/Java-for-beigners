package A5th_package_ForLoop_And_Array;

import java.util.Scanner;

public class A5_C1st_program_PrimeNumberArray {

	public void getdata() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the Array size");
			int size = sc.nextInt();
			System.out.println("Enter the number");
			int a[] = new int[size];
			for (int i = 0; i <= size - 1; i++) {
				a[i] = sc.nextInt();
			}
			for (int j = 0; j <= size-1; j++) {
				boolean flag = false;
				if (a[j] == 0 || a[j] == 1) {
					System.out.println(a[j] + " is Not prime Number");

				} else {
					for (int k = 2; k < a[j]; k++) {
						if (a[j] % k == 0) {
							System.out.println(a[j] + " is Not Prime Number");
							flag = true;
							break;
						}

					}
					if (flag == false) {
						System.out.println(a[j] + " is the Prime Number");
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Issue in get prime number through array method "+e);
		}

		
	}
	
	

	public static void main(String[] args) {

		A5_C1st_program_PrimeNumberArray ob = new A5_C1st_program_PrimeNumberArray();
		ob.getdata();
	}

}
