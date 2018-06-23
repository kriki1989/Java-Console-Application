package Exercise4;

import java.util.Scanner;
public class Exersice4 {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.print ("Give me the number of pronic numbers: ");
			int choice = input.nextInt();
					for (int i=1;i<=choice;i++) {
						System.out.print (i*(i+1)+" ");
					}
	}

}

