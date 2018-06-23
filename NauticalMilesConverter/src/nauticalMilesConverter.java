import java.text.DecimalFormat;
import java.util.Scanner;
public class nauticalMilesConverter{

	public static void main (String[] args){
		/* Ex1 P63
		byte syblings=0
		byte grade=''
		long population=0
		int usa=0
		byte passengers=0
		short hist=0
		double price=0
		 */
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double kilometers = 1.852;
		double miles = 1.150779;
		String nm=null;
		double nautical_miles = 0;
		do {
			try {
				System.out.println("Type nautical miles you want to convert");
				nm= input.nextLine();
				nm=nm.replaceAll(",", ".");
				nautical_miles = Double.parseDouble(nm);
				break;
			}catch (Exception e) {
				System.out.println("This is not a valid entry.");
			}
		}while (true);
		System.out.println ("Nautical miles to kilometers: "+df.format(kilometers*nautical_miles)+
				"\nNautical miles to miles: "+ df.format(miles*nautical_miles));



	}
}