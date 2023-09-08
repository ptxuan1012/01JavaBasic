package day5;

public class SinhVienKhoaNgoaiNgu extends SinhVien{
	public String tenMonNN;
	public void inThongtin() {
		//System.out.println(maSV +"/"+hoTen+"/"+"/"+ngaysinh+"/"+ gioiTinh);
		System.out.format("%10s %10s %10s %10s %10s \n", "maSV", "hoTen", "ngaySinh", "gioiTinh", "MonNN");
		System.out.format("%10d %10s %10s %10s %10s \n", maSV, hoTen, ngaysinh, gioiTinh, tenMonNN);
	}

}
