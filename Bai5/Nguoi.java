package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen_104;
	private Date ngaySinh_104;
	private String ngheNghiep_104;
	public Nguoi() {
	}
	public Nguoi(String hoTen_104, Date ngaySinh_104, String ngheNghiep_104) {
		this.hoTen_104 = hoTen_104;
		this.ngaySinh_104 = ngaySinh_104;
		this.ngheNghiep_104 = ngheNghiep_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_104 = sc.nextLine();
		ngaySinh_104 = strToDate_104(strDate_104);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep_104 = sc.nextLine();
	}
	private Date strToDate_104(String strDate_104) {
		Date date_104 = null;

		SimpleDateFormat sdf_104 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_104 = sdf_104.parse(strDate_104);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date_104;
	}
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + dateToString_104(ngaySinh_104));
		System.out.println("\tNghe nghiep: " + ngheNghiep_104);
	}
	private String dateToString_104(Date date_104) {
		SimpleDateFormat sdf_104 = new SimpleDateFormat("dd-MM-yyyy");

		String strDate_104 = sdf_104.format(date_104);

		return strDate_104;
	}
	public Date getNgaySinh_104() {
		return ngaySinh_104;
	}
}