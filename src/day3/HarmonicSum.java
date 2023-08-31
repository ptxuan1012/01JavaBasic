package day3;

public class HarmonicSum {
	public static void harmoicSum() {
		int sum=0;
		for(int i =1;i<=5000;i++) {
			sum +=i;
		}
		System.out.println("The sum is: "+sum);
	}
	public static void harmoicSum1() {
		int sum=0;
		for(int i =5000;i>=1;i--) {
			sum +=i;
		}
		System.out.println("The sum is: "+sum);
	}

}
