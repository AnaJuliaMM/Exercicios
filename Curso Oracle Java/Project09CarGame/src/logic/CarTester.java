package logic;

public class CarTester {

	public static void main(String[] args) {
		Car myCar = new Car("red", 5, 5, 5, 5 );
		myCar.accelerate();
		myCar.accelerate(-8);
		System.out.println(myCar.getSpeed());
	}

}
