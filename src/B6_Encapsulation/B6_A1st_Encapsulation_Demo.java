package B6_Encapsulation;

import java.util.Scanner;

public class B6_A1st_Encapsulation_Demo {

	public static void main(String[] args) {
		
		B6_A2nd_BeanClass_Demo ob=new B6_A2nd_BeanClass_Demo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name");
		String name = sc.next();
		ob.setEmpname(name);
		System.out.println("Please enter your designation");
		
		ob.setDesignation(sc.next());
		System.out.println("Please enter your sallery");
		ob.setSallery(sc.nextInt());
		System.out.println("Please enter your company name");
		ob.setOrganization(sc.next());
		System.out.println("Name is "+ob.getEmpname()+" Designamtion is "+ob.getDesignation()+
				" Sallery is "+ob.getSallery()+" Work in this Organization "+ob.getOrganization());
	}
	
	
}
