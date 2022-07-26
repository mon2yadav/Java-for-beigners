package B3_Abstract_Explanation;

abstract class car {

	abstract public int Seat();

	abstract public String colur();

	public int wheel() {
		return 4;
	}
}

class maruti extends car {

	@Override
	public int Seat() {

		return 5;
	}

	@Override
	public String colur() {

		return "Red";
	}

}

class hyundai extends car {

	@Override
	public int Seat() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String colur() {
		// TODO Auto-generated method stub
		return "Black";
	}

}

public class B3_A1st_Abstraction_Demo {
	public static void main(String[] args) {
		maruti ob = new maruti();
		System.out.println(ob.colur());
		System.out.println(ob.Seat());
		System.out.println(ob.wheel());
		hyundai ob1 = new hyundai();
		System.out.println(ob1.colur());
		System.out.println(ob1.wheel());
		System.out.println(ob1.Seat());
	}

}
