import java.util.Scanner;
import java.text.DecimalFormat;

public class Rectangle{

	private double length = 1;
	private double width = 1;

	public double getLength(){
		return this.length;
	}

	public double getWidth(){
		return this.width;
	}

	public void setLength(double a){
		this.length= a;
	}

	public void setWidthh(double b){
		this.width= b;
	}

//MAIN
	public static void main(String args[]){
			Scanner input = new Scanner (System.in);
			DecimalFormat df = new DecimalFormat("#.##");
			double len;
			double win;

			do{
				System.out.print ("Give length: ");
				len = input.nextDouble();
			} while (len<0.0 || len>=20);

			do{
				System.out.print ("Give width: ");
				win = input.nextDouble();
			} while (win<0.0 || win>=20);

			double Perimeter = 2*len+2*win;
			double Area = len*win;
			System.out.println ("The perimeter is: "+df.format(Perimeter)+" and the area is: "+Area);

	}

}