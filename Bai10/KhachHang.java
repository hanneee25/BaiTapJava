package Bai10;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo_104;
	protected int soNha_104;
	protected String maCongTo_104;
	public KhachHang() {

	}
	public KhachHang(String tenChuHo_104, int soNha_104, String maCongTo_104) {
		this.tenChuHo_104 = tenChuHo_104;
		this.soNha_104 = soNha_104;
		this.maCongTo_104 = maCongTo_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_104 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_104 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_104);
		System.out.println("\tSo nha: " + soNha_104);
		System.out.println("\tMa cong to: " + maCongTo_104);
	}
}