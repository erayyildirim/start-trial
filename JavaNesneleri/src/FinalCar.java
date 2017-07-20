public class FinalCar {
	final String make;
	String model;
	String year;
	int speed;
	int distance;
	String owner;

	public FinalCar(String model, String year, int speed, int distance) {
		this.make = "Mercedes";
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
	}

	public FinalCar(String model, String year) {
		this.make = "Mercedes";
		this.model = model;
		this.year = year;
		speed = 0;
		distance = 0;

	}

	public void speedUp(final int newSpeed) {
		speed = newSpeed;
	}

	public void setOwner(final String newOwner) {
		owner = newOwner;
	}

	public static void main(String[] args) {
		// FinalCar is a final reference
		// final FinalCar finalCar;

		final FinalCar finalCar = new FinalCar("Clk200", "2011", 0, 0);
		finalCar.speed = 120;

		System.out.println("Marka: " + finalCar.make + " Model: "
				+ finalCar.model + " Year: " + finalCar.year + " Hız=  "
				+ finalCar.speed);

	}

}
