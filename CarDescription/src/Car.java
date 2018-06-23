
public class Car {
	//instances
	private String color;
	private int numberOfDoors;
	private double price;

	//constructors
	public Car () {
		this.color = "White";
		this.numberOfDoors = 5;
		this.price = 5000;
	}
	public Car (String color, int numberOfDoors, double price) {
		this.color = color;
		this.numberOfDoors = numberOfDoors;
		this.price = price;
	}

	//getters
	public String getColor() {
		return this.color;
	}
	public int getnumberOfDoors() {
		return this.numberOfDoors;
	}
	public double getPrice() {
		return this.price;
	}

	//setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setnumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	//toString
	public String toString() {
		return "Car [color=" + color + ", numberOfDoors=" + numberOfDoors + ", price=" + price + "]";
	}

	public static void main(String[] args) {

		Car car1 = new Car ();
		Car car2 = new Car ("Red", 3, 30000);
		System.out.println (car1);
		System.out.println (car2);

		car1.setPrice(10000);
		System.out.println (car1);

	}

}
