package Bai6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Nguoi {
	protected String hoTen_104;
	protected static Date ngaySinh_104;
	protected int CMND_104;
	public Nguoi() {
	}
	public Nguoi(String hoTen_104, Date ngaySinh_104, int CMND_104) {
		this.hoTen_104 = hoTen_104;
		this.ngaySinh_104 = ngaySinh_104;
		this.CMND_104 = CMND_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_104 = sc.nextLine();
		ngaySinh_104 = strToDate_104(strDate_104);
		System.out.print("\tNhap CMND: ");
		CMND_104 = sc.nextInt();
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

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tCMND: " + CMND_104);
	}

	// ham lay ra thong tin CMND
	public int getCMND_104() {
		return CMND_104;
	}
}