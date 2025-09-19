package Bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon_104;
	private Date ngayMuon_104;
	private Date hanTra_104;
	private String soHieu_104;
	public TheMuon() {
	}
	public TheMuon(int soMuon_104, Date ngayMuon_104, String soHieu_104) {
		this.soMuon_104 = soMuon_104;
		this.ngayMuon_104 = ngayMuon_104;
		this.soHieu_104 = soHieu_104;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon_104 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon_104 = sc.nextLine();
		ngayMuon_104 = strToDate_104(strNgayMuon_104);

		String strNgayTra_104 = "31-12-2020";
		hanTra_104 = strToDate_104(strNgayTra_104);

		System.out.println("\tNhap so hieu: ");
		soHieu_104 = sc.nextLine();
	}
	private Date strToDate_104(String strNgayMuon_104) {
		Date date_104 = null;

		SimpleDateFormat sdf_104 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_104 = sdf_104.parse(strNgayMuon_104);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date_104;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon_104);
		System.out.println("\tNgay muon: " + ngayMuon_104);
		System.out.println("\tHan tra: " + hanTra_104);
		System.out.println("\tSo hieu: " + soHieu_104);
	}
	public Date getHanTra_104() {
		return hanTra_104;
	}
}