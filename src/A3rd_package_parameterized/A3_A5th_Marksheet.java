package A3rd_package_parameterized;

import java.util.Scanner;

public class A3_A5th_Marksheet { 
	
	
	
	public void getdetail(String name, String fathername, String course, int rollnum , int hindimarks ,
			int englishmarks, int mathmarks, int sciencemarks, int sstmarks) {
		
		System.out.println("******MARKSHEET******");
		System.out.println();
		System.out.println("student name is            " + name);
		System.out.println("father name is             " + fathername);
		System.out.println("course is                  " + course);
		System.out.println("Roll number is             " + rollnum);
		System.out.println();
		System.out.println();
		System.out.println("hindi marks is             " + hindimarks);
		System.out.println("english marks is           " + englishmarks);
		System.out.println("maths marks is             " + mathmarks);
		System.out.println("science marks is           " + sciencemarks);
		System.out.println("sst marks is               " + sstmarks);
		String resultstatus = getresult( hindimarks, englishmarks, mathmarks, sciencemarks, sstmarks);
		int total1=hindimarks+englishmarks+mathmarks+sciencemarks+sstmarks;
		int percent1=(total1*100)/500;
		System.out.println("Your total marks is        " + total1);
		System.out.println("Your percentage is         " + percent1+"%");
		
		if(resultstatus.equals("pass"))
		{
			int total=hindimarks+englishmarks+mathmarks+sciencemarks+sstmarks;
			int percent=(total*100)/500;
			System.out.println();
			if(percent>=33 && percent<45) {
				System.out.println("You are passed with third division ");
			}
			else if(percent>=45 && percent<60) {
				System.out.println("You are passed with second division");
			}
			else if(percent>=60 && percent<80) {
				System.out.println("You are passed with First division");
			}
			else {
				System.out.println("You are passed with Top First division");
			}
		}
	}
	public String getresult(int hindimarks, int englishmarks, int mathmarks, int sciencemarks, int sstmarks) {
		String result="pass";
	
		if(hindimarks<33 || englishmarks<33 || mathmarks<33 || sciencemarks<33 || sstmarks<33) {
			System.out.println("Fail");
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		A3_A5th_Marksheet ob=new A3_A5th_Marksheet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the student name");
		String name = sc.next();
		System.out.println("enter the father name");
		String fathername = sc.next();
		System.out.println("enter the course name");
		String course = sc.next();
		System.out.println("enter the roll number");
		int rollnumber = sc.nextInt();
		System.out.println("enter the hindi marks");
		int hindimarks = sc.nextInt();
		System.out.println("enter the english marks");
		int englishmarks = sc.nextInt();
		System.out.println("enter the mathsmarks marks");
		int mathmarks = sc.nextInt();
		System.out.println("enter the science marks");
		int sciencemarks = sc.nextInt();
		System.out.println("enter the sst marks");
		int sstmarks = sc.nextInt();
		ob.getdetail(name, fathername, course, rollnumber, hindimarks, englishmarks, mathmarks, sciencemarks, sstmarks);
		
		
		
	}

}
