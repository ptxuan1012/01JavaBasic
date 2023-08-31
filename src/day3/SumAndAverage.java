package day3;

public class SumAndAverage {
	public static void sumAndAverage() {
		int sum =0;
		for(int i =1;i<=100;i++) {
			sum +=i;			
		}
		System.out.println("the sum is: "+ sum);
		float average =(float)(sum/100);
		System.out.println("The average is: "+ average);
		}
	public static void sumAndAverage2() {
		int sum =0;
		int count=0;
		for(int i =111;i<=8899;i++) {
			sum +=i;
			count ++;
		}
		System.out.println("the sum is: "+ sum);
		float average =(float)(sum/count);
		System.out.println("The count is: "+ count + " with average is: "+ average);
		}
	public static void sumAndAverage3() {
		int oddSum =0;
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2 !=0) {
				oddSum +=i;
				count++;
			}
			
		}
		float average =(float)oddSum/(float)count;
		System.out.println("The odd sum is: "+ oddSum);
		System.out.println("The count is: "+ count);
		System.out.println("The average is: "+ Math.round(average*100.0/100.0));
	}
	public static void sumAndAverage4() {
		int sum =0;
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%7 ==0) {
				sum +=i;
				count++;
			}
			
		}
		float average =(float)(sum/count);
		System.out.println("The odd sum is: "+ sum);
		System.out.println("The count is: "+ count);
		System.out.println("The average is: "+average);
}
	public static void sumAndAverage5() {
		int sum =0;
		for(int i=1;i<=100;i++) {
			sum +=i*i;		
			
		}
		System.out.println("The odd sum is: "+ sum);
		
}
}
