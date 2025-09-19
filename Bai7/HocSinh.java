package Bai7;
import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop_104;
	private String khoHoc_104;
	private String kyHoc_104;
	public HocSinh() {
	}
	public HocSinh(String hoTen_104, String lop_104, String khoaHoc_104, String kyHoc_104) {
		super(hoTen_104, getNgaySinh_104(), kyHoc_104);
		this.lop_104 = lop_104;
		this.khoHoc_104 = khoaHoc_104;
		this.kyHoc_104 = kyHoc_104;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop_104 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc_104 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc_104 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop_104);
		System.out.println("\tKhoa hoc: " + khoHoc_104);
		System.out.println("\tKy hoc: " + kyHoc_104);
	}
	public String getLop_104() {
		return lop_104;
	}
}