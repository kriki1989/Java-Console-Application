import java.util.Scanner;

public class TaxIdentification {
	
	public static void checkTIN(String AFM) {
		String [] afm=AFM.split("");
		int [] afmTable = new int [9]; 
		for (int i=0;i<=8;i++) {
			afmTable [i] = Integer.parseInt(afm[i]);
		}
		
		int i = 0;
		int j = 8;
		int sum = 0;
		
		for (i=0;i<=7;i++) {
			sum += Math.pow(2, j)*afmTable[i];
			j--;			
		}
		
		double upoloipo = sum%11;
		if ((upoloipo==10 && afmTable[8]==0) || afmTable[8]==upoloipo) {
			System.out.println("Valid TIN");
		}else {
			System.out.println("Not valid TIN");
		}
	}

	public static void main(String[] args) {
		String AFM="140575004";
		checkTIN(AFM);

	}

}
