package A7_Polymorphism;

class RBI{
	
	public int ROI() {
		return 0;
	}
}
class Axisbank extends RBI{
	
	public int ROI() {
		return 10;
	}
}
class icicibank extends RBI{
	public int ROI() {
		return 12;
	}
}

public class A7_A3rd_Overriding {
	
	public static void main(String[] args) {
		Axisbank ob=new Axisbank();
		System.out.println(ob.ROI());
		icicibank ob1=new icicibank();
		System.out.println(ob1.ROI());
	}

}
