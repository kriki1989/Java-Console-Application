
public class CalculateModule {
// calculate sum = 1/5-1/4+1/3-1/2+1/1 where n = 5
	public static double calcMod(int n) {
		double sum = 0;
		
		for (double i=1;i<=n;i++) {			
			if (i%2 == 0)
				sum = sum - (1/i);
			else
				sum = sum + (1/i);
		}
		return sum;
	}
	
	public static void main (String[] args) {
		double sum = calcMod(5);
		System.out.format ("Sum = %.2f", sum);
	}
}
