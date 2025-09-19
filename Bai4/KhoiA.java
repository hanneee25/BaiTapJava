package Bai4;
import java.util.Scanner;
public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1_104;
	private String mon2_104;
	private String mon3_104;
	public KhoiA() {

	}
	public KhoiA(String mon1_104, String mon2_104, String mon3_104) {
		this.mon1_104 = mon1_104;
		this.mon2_104 = mon2_104;
		this.mon3_104 = mon3_104;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1_104 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_104 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_104 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_104 + " - " + mon2_104 + " - " + mon3_104);
	}
}