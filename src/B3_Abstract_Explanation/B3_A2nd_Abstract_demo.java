package B3_Abstract_Explanation;

abstract class ROI{
	
	abstract public int ROI();
	public float raporate() {
		return 0.5f;
	}
}
class axisbank extends ROI{

	
	public int ROI() {
		
		return 10;
	}
	
}
class sbibank extends ROI{

	@Override
	public int ROI() {
		
		return 12;
	}
	
}

public class B3_A2nd_Abstract_demo {
	
	public static void main(String[] args) {
		axisbank ob=new axisbank();
		System.out.println(ob.ROI());
		System.out.println(ob.raporate());
		System.out.println("Space ");
		sbibank ob1=new sbibank();
		System.out.println(ob1.ROI());
		System.out.println(ob1.raporate());
	}
}
