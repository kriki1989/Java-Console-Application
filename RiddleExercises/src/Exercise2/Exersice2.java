package Exercise2;

import java.util.Scanner;
public class Exersice2 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		//input.nextInt();
		System.out.print ("Enter number of 50 euro banknotes: ");
		int bank50 = input.nextInt();
		System.out.print ("Enter number of 20 euro banknotes: ");
		int bank20 = input.nextInt();
		System.out.print ("Enter number of 10 euro banknotes: ");
		int bank10 = input.nextInt();
		System.out.print ("Enter number of 5 euro banknotes: ");
		int bank5 = input.nextInt();
		System.out.print ("Enter number of 2 euro banknotes: ");
		int bank2 = input.nextInt();
		System.out.print ("Enter number of 1 euro banknotes: ");
		int bank1 = input.nextInt();
		int sum = bank50*50+bank20*20+bank10*10+bank5*5+bank2*2+bank1*1;
		System.out.println ("You have "+sum+" euros.");
		
		
	}

}
