package Exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		int[] Num = {0,0,0,0,0,0,0,0,0};

		for (int i=8;i>=0;i--) {
				if (i==0 || Num[i-1]==0){
					Num [i] = 9-i;
				}
				for (int j=i;j<9;j++){
				Num[j] = Num [i]; 
				}
				for (int k=0;k<9;k++) {
					System.out.print(Num[k]);
				}
			System.out.println("");
			
		}	

	}
}
