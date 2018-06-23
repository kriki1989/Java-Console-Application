package Exercise3;

import java.util.Scanner;
public class Exersice3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Give me a from the equation ax2+bx+c");
		int a=input.nextInt();
		System.out.println("Give me b from the equation ax2+bx+c");
		int b=input.nextInt();
		System.out.println("Give me c from the equation ax2+bx+c");
		int c=input.nextInt();
		if (Math.pow(b,2)-4*a*c<0) {
			System.out.println("No real-valued solutions exist");
		}else {
			double Diak = Math.pow(b,2)-4*a*c;
			double Riza = Math.sqrt(Diak);
			double Sol1 = (-b + 2*Riza) / (2*a);
			double Sol2 = (-b - 2*Riza) / (2*a);
			System.out.println("Fist solution x1= "+Sol1+"\nSecond solution x2= "+Sol2);
			
		}
		

	}

}
