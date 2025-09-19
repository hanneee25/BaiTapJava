package Bai8;

import java.util.Scanner;

public class Nguoi {
	protected String hoTen_104;
	protected String ngaySinh_104;
	protected String queQuan_104;
	public Nguoi() {

	}
	public Nguoi(String hoTen_104, String ngaySinh_104, String queQuan_104) {
		this.hoTen_104 = hoTen_104;
		this.ngaySinh_104 = ngaySinh_104;
		this.queQuan_104 = queQuan_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_104 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan_104 = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tQue quan: " + queQuan_104);
	}
}