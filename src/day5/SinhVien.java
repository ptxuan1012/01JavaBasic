package day5;

public class SinhVien {
	public int maSV;
	public String hoTen;
	public String ngaysinh;
	public String gioiTinh;
	public void inThongtin() {
		//System.out.println(maSV +"/"+hoTen+"/"+"/"+ngaysinh+"/"+ gioiTinh);
		System.out.format("%10s %10s %10s %10s\n", "maSV", "hoTen", "ngaySinh", "gioiTinh");
		System.out.format("%10d %10s %10s %10s\n", maSV, hoTen, ngaysinh, gioiTinh);
	}

}
