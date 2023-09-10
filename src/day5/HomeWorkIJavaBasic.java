package day5;

import java.util.Scanner;

public class HomeWorkIJavaBasic {

	public static void main(String[] args) {
		rePlaceI6();
		// convertStringI5();
		// averageI4();
		// StringtoInteger();
//disPlayAsterisk();
//inDataType();
	}

	public static void disPlayAsterisk() {
		for (int i = 0; i < 5; i++) {
			System.out.println("****");
		}
	}

	public static void inDataType() {
		int number = 10;
		float flo = 12.5f;
		String str = "Java programming";
		System.out.println("Number: " + number);
		System.out.println("Float: " + flo);
		System.out.println("String: " + str);
	}

	public static void StringtoInteger() {
		String numStr = "20";
		int numInt = Integer.parseInt(numStr);
		System.out.println("String to Integer: " + numInt);
	}

	public static void averageI4() {
		Scanner sc = new Scanner(System.in);
		String[] products = { "laptop", "PC", "projection" };
		int price, sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Price of " + products[i] + ":");
			price = sc.nextInt();

			sum += price;
		}
		float aver = (float) ((float) sum / 3);
		System.out.println("averageI4 is: " + aver);

	}

	public static void convertStringI5() {
		String str = "2000$";
		System.out.println("Strinng orin:" + str);
		String subSTr1 = str.substring(0, str.length() - 1);
		System.out.println("New String: " + subSTr1);
		String Str2 = "$";
		System.out.println("Convert String: " + Str2.concat(subSTr1));
		/*
		 * char [] ch= new char[10]; str1.getChars(0, str1.length()-1, ch, 0);
		 * System.out.println(ch); char ch2 = str1.charAt(str1.length()-1);
		 * System.out.println(ch2); System.out.println("chart string: "+
		 */
	}

	public static void rePlaceI6() {
		String s = "Welcome to Java Basic ";
		String strTrim = s.trim();
		System.out.println(strTrim);
		String strRePl = strTrim.replaceAll(" ", "_");
		System.out.println(strRePl);
	}
}
