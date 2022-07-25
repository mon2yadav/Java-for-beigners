package B2_Static_keyword;

class student_client{
	
	String name;
	int rollnumber;
	static String collagename;
	String course;
	
	public student_client(String name, int rollnumber, String course) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.course=course;
	}
	public static void valuechange() {
		collagename="kite";
	}
	public void display() {
		System.out.println(name+" " + rollnumber + " " + course + " " + collagename);
	}
}

public class B2_A3rd_Static_Method_New {
	
	public static void main(String[] args) {
		student_client.valuechange();
		student_client ob=new student_client("montu    " , 123 , " btech");
		student_client ob1=new student_client("vinod   " , 234 , " MBA");
		student_client ob2=new student_client("rajneesh" , 422 , " BBA");
		student_client ob3=new student_client("ramehs  " , 424 , " CA");
		ob.display();
		ob1.display();
		ob2.display();
		ob3.display();
		
	}

}
