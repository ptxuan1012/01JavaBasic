package day2;
import java.util.Scanner;

public class Main {
			
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		//doExe1();
		//doExe2();
		//doExe3();
		//doExe4();	

		
	}
	
	public static void doExe1() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tu ban phim");
		int x = sc.nextInt();
	    if (OddTest.isOdd(x)==true) {
		System.out.println("ODD");
	   }else
	      {System.out.println("EVEN");}

	}
	
	public static void doExe2() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Nhập số cần kiểm tra: ");
		int x = scan.nextInt();
		if(EightTest.hasEight(x)==true) {
			System.out.println("Number has eight");
		}else 
		{
			System.out.println("Number has not eight");
		}
	}
	public static void doExe3() {
		int s=MagicSum.isMagicSum();
		System.out.println("The magic sum is: "+s);
	}
}
		
		
	


	