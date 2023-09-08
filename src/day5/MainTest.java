package day5;

import java.util.Scanner;


import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		//inSVKhoaNN();
		disPlay1();

	}
	
	public void inSVKhoaToan() {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVienKhoaToan> sinhVienKTs = new ArrayList<SinhVienKhoaToan>();

		System.out.println("so luong SV");
		int soSV = sc.nextInt();
		int i = 0;
		while (i < soSV) {
			SinhVienKhoaToan svkhoatoan = new SinhVienKhoaToan();
			System.out.println("sv 1:");
			System.out.println("nhap maSv");
			svkhoatoan.maSV = sc.nextInt();
			sc.nextLine();
			System.out.println("nhap hoten");
			svkhoatoan.hoTen = sc.nextLine();

			System.out.println("nhap ngay sinh");
			svkhoatoan.ngaysinh = sc.nextLine();
			System.out.println("nhap gioi tinh");
			svkhoatoan.gioiTinh = sc.nextLine();
			sinhVienKTs.add(svkhoatoan);
			i++;

		}
		for (SinhVienKhoaToan sv : sinhVienKTs) {
			// System.out.println(sv.maSV + " " + sv.hoTen + " " + sv.ngaysinh + " " +
			// sv.gioiTinh);
			sv.inThongtin();
		}

	}

	public static void inSVKhoaNN() {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVienKhoaNgoaiNgu> sinhVienKNN = new ArrayList<SinhVienKhoaNgoaiNgu>();

		System.out.println("so luong SV");
		int soSV = sc.nextInt();
		int i = 0;
		while (i < soSV) {
			SinhVienKhoaNgoaiNgu svkhoaNN = new SinhVienKhoaNgoaiNgu();
			System.out.println("sv 1:");
			System.out.println("nhap maSv");
			svkhoaNN.maSV = sc.nextInt();
			sc.nextLine();
			System.out.println("nhap hoten");
			svkhoaNN.hoTen = sc.nextLine();
			System.out.println("nhap ngay sinh");
			svkhoaNN.ngaysinh = sc.nextLine();
			System.out.println("nhap gioi tinh");
			svkhoaNN.gioiTinh = sc.nextLine();
			System.out.println("nhap MonNN");
			svkhoaNN.tenMonNN = sc.nextLine();
			sinhVienKNN.add(svkhoaNN);
			i++;

		}
		for (SinhVienKhoaNgoaiNgu sv : sinhVienKNN) {
			// System.out.println(sv.maSV + " " + sv.hoTen + " " + sv.ngaysinh + " " +
			// sv.gioiTinh);
			sv.inThongtin();
		}

	}

	public static void disPlay1() {
    RandomString rand = new RandomString();
    rand.disPlay();    
	}

}
