package Bai7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_104;
	protected static Date ngaySinh_104;
	protected String queQuan_104;
	public Nguoi() {

	}
	public Nguoi(String hoTen_104, Date ngaySinh_104, String queQuan_104) {
		this.hoTen_104 = hoTen_104;
		this.ngaySinh_104 = ngaySinh_104;
		this.queQuan_104 = queQuan_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate_104 = sc.nextLine();
		ngaySinh_104 = strToDate_104(strDate_104);

		System.out.print("\tNhap que quan: ");
		queQuan_104 = sc.nextLine();
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
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tQue quan: " + queQuan_104);
	}
	public String getQueQuan_104() {
		return queQuan_104;
	}
	public static Date getNgaySinh_104() {
		return ngaySinh_104;
	}
}