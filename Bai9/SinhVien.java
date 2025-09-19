package Bai9;
import java.util.Scanner;
public class SinhVien {
	protected String hoTen_104;
	protected String maSV_104;
	protected String ngaySinh_104;
	protected String lop_104;
	public SinhVien() {
	}
	public SinhVien(String hoTen_104, String maSV_104, String ngaySinh_104, String lop_104) {
		this.hoTen_104 = hoTen_104;
		this.maSV_104 = maSV_104;
		this.ngaySinh_104 = ngaySinh_104;
		this.lop_104 = lop_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV_104 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_104 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop_104 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tMa sinh vien: " + maSV_104);
		System.out.println("\tLop: " + lop_104);
	}
}