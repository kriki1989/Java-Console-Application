import java.util.Scanner;
public class TaxIdentification {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Give me TIN: ");
		String [] tin=(input.next()).split("");
		int [] TIN= new int [9];

		for (int i=0;i<=8;i++) {
			TIN[i] = Integer.parseInt(tin[i]) ;
			System.out.print (tin [i]);
		}
		System.out.println ("\n");
		int sum=0;
		int j = 8;
		for (int i=0;i<=7;i++) {
				sum+=TIN[i]*Math.pow(2,j);
				j--;
		}
		System.out.println (sum);
		
		int remainder = sum%11;
		int check = remainder%10;
		
		if (check == TIN[8]) {
			System.out.println("Tax Identification Number valid.");
		}else {
			System.out.println("Tax Identification Number not valid.");
		}
		
		input.close();

	}

}
