package day4;
import java.util.Scanner;

public class GradesAverage {
public static void gradesAverage() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so luong SV: ");
	int n =sc.nextInt();
	int [] grade = new int[n];
	int sum=0;
	for(int i =0;i< grade.length;i++) {
		System.out.println("Nhap diem SV "+ i+ ": ");
		grade[i]=sc.nextInt();
		if(grade[i]>=0&&grade[i] <=100) {
			sum +=grade[i];}	
		else {
		 System.out.println("Invalid grade, try again...");
		 grade[i]=sc.nextInt();
		 sum +=grade[i];
		}		
}
	float average =(float)sum/(grade.length);
	System.out.println("Gia tri trung binh: "+ average);
	
	}
public static void printArray(int[] arr){
	if(arr.length>0) {
		System.out.print("{");
		for(int i =0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			}else {
			System.out.print(arr[i]+", ");
		 }
		}
		System.out.print("}");
	}else {
		System.out.println("Mang rong");		
	}
}
public static void printArrayFloat(float[] arr){
	if(arr.length>0) {
		System.out.print("{");
		for(int i =0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			}else {
			System.out.print(arr[i]+", ");
		 }
		}
		System.out.print("}");
	}else {
		System.out.println("Mang rong");		
	}
}
	public static void printArrayDouble(double[] arr){
		if(arr.length>0) {
			System.out.print("{");
			for(int i =0;i<arr.length;i++) {
				if(i==arr.length-1) {
					System.out.print(arr[i]);
				}else {
				System.out.print(arr[i]+", ");
			 }
			}
			System.out.print("}");
		}else {
			System.out.println("Mang rong");		
		}
}
	public static void arrayToString(int[] arr){
		if(arr.length>0) {
			System.out.print("{");
			for(int i =0;i<arr.length;i++) {
				if(i==arr.length-1) {
					System.out.print(String.valueOf(arr[i]));
				}else {
				System.out.print(String.valueOf(arr[i])+", ");
			 }
			}
			System.out.print("}");
		}else {
			System.out.println("Mang rong");		
		}
	}
}