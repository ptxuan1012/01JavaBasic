package day5;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class HomeWorkConditionstatements {
	public static void main(String[] args) {
		chooseCorrect();
		// doExe12();
		// revenue();
		// studentsGrade();
		// vote();
		// conpare2String1();
	}

	public static void conpare2String1() {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> listStr = new ArrayList<String>();
		// Nhap chuoi
		for (int i = 0; i < 2; i++) {
			String Str = sc.nextLine();
			listStr.add(Str);
		}
		String str1 = listStr.get(0);
		String str2 = listStr.get(1);
		if (str1.equalsIgnoreCase(str2) == true) {
			System.out.println("TC passed");
		} else {
			System.out.println("TC fail");
		}

	}

	public static void vote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So lan nhap:");
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {

			int old = sc.nextInt();
			System.out.println("Enter your age: ");
			if (old >= 18 && old < 100) {
				System.out.println("You are eligible to vote");
			} else {
				System.out.println("You are not eligible to vote");
			}
			i++;
		}
	}

	public static void studentsGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Diem bai kiem tra:");
		float diemKt = sc.nextFloat();
		System.out.println("Diem giua ky:");
		float diemgk = sc.nextFloat();
		System.out.println("Diem cuoi ky:");
		float diemck = sc.nextFloat();
		float tb = (diemck + diemgk + diemKt) / 3;
		// float tbphamtram = tb / 100;
		if (tb >= 90) {
			System.out.println("Your grade is A");
		} else if (tb >= 70 && tb < 90) {
			System.out.println("Your grade is B");
		} else if (tb >= 50 && tb < 70) {
			System.out.println("Your grade is C");
		} else {
			System.out.println("Your grade is F");
		}
	}

	public static void revenue() {
		Scanner sc = new Scanner(System.in);

		float price = sc.nextFloat();
		System.out.println("Enter unit price: " + price);
		int count = sc.nextInt();
		System.out.println("Enter quantity: " + count);

		float sum = price * count;
		System.out.println("value sum: " + sum);
		float disCount, reven;
		if (count > 120) {
			disCount = 0.15f;
			System.out.println("After discount: " + sum * disCount + "$( " + disCount * 100 + "%)");
			reven = sum - sum * disCount;
			System.out.println("The revenue from sale:" + reven + "$");
		} else if (count >= 100 && count <= 120) {
			disCount = 0.10f;
			System.out.println("After discount: " + sum * disCount + "$( " + disCount * 100 + "%)");
			reven = sum - sum * disCount;
			System.out.println("The revenue from sale:" + reven + "$");
		} else {
			reven = sum;
			System.out.println("The revenue from sale:" + reven + "$");

		}
	}

	public static void doExe12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("So lan nhap");
		int a = sc.nextInt();
		int i = 0;
		while (i < a) {
			int n;
			try {
				n = sc.nextInt();
				System.out.println("the program will tell the number that is pressed");

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Not allowed");
			}
			i++;
		}

	}

	public static void chooseCorrect() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Cau hoi: ");
			String cauHoi = sc.nextLine();
			// choose option
			String[] chooses = new String[4];
			System.out.println("Nhap cac option:");
			for (int i = 0; i < 4; i++) {

				chooses[i] = sc.nextLine();

			}
			// display option
			for (String i : chooses) {
				System.out.println(i);
			}
			System.out.println("Nhap lua chon:");
			String luachon = sc.nextLine();

			if (luachon.equals("a")) {
				System.out.println("Bạn đã chọn đúng");
				break;
			} else {
				System.out.println("Ban chon sai");
			}
		}
	}
}
