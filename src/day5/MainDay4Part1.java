package day5;

import java.util.Scanner;

public class MainDay4Part1 {
	public static void main(String[] args) {
		doExe8();
		//doExe7();
		// doExe5and6();
		// doExe4();
		// inChuoi();
		/*
		 * String str1 ="Hello, World."; String str2 ="Hello, Java.";
		 * System.out.println(str1); System.out.println(str2);
		 */
	}

	public static void inChuoi() {
		String str1 = "Hello, World.";
		String str2 = "Hello, Java.";
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void doExe4() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Day4Part1.tich4(n);
	}

	public static void doExe5and6() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int arrSize = arr.length;
		System.out.println("Length Array: " + arrSize);
		for (int i = 0; i < arrSize; i++) {
			System.out.println("Element " + i + ": " + arr[i]);
		}
	}

	public static void doExe7() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < 8; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void doExe8() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int [][] numbers1;
		for (int i = 0; i < numbers.length; i++) {
			if (i < 3) {
				for (int j = 0; j < 3; j++) {
					//numbers1[i][j]=numbers[i];
					//System.out.println(numbers1[i][j]);
				}
			}
		}
	}
}
