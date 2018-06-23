public class Circle{


	//Set two private instance variables
	private double radius;
	private String color;

	//Default constructor with no arguments
	public Circle (){
		this.radius = 1.0;
		this.color="red";
	}

	//Constructor which takes a double argument for radius
	public Circle (double r){
		this.radius = r;
		this.color="red";
	}

	public Circle (double r, String c){
		this.radius = r;
		this.color = c;
	}

	//Public method get Radius
	public double getRadius(){
		return this.radius;
	}

	//Public method get Area
	public double getArea(){
			double area = Math.PI*Math.pow(this.radius,2);
			return area;
	}

	//Create a method toString()
	public String toString(){
		return ("Radius: "+this.radius+"\nColor: "+this.color+"\nArea: "+getArea());
	}

}