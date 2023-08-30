package day2;
import java.util.Scanner;

public class MagicSum {
	public static int isMagicSum() {
		int sum=0;			
			do {
			int n =0;
			Scanner sc = new Scanner(System.in);
			n =sc.nextInt();
			if(n==-1){
				break;}
			if(n>0) {
				String numberStr= String.valueOf(n);
				boolean isContain = numberStr.contains("8");
				if(isContain==true) {
					sum +=n;
				}		
			}
			
		} while(true);
			return sum;
	}	
}
	
						