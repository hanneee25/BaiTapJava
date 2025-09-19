package Bai5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> dshd_104;
	public KhuPho() {
		dshd_104 = new ArrayList<HoDan>(10);
	}
	public void themHoDan(HoDan hoDan_104) {
		dshd_104.add(hoDan_104);
	}
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}
	public void hienThiDanhSach() {
		int n = dshd_104.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd_104.get(i).hienThiThongTin();
		}
	}
	public void timKiemThongTin() {
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv_104 = null;

		for (HoDan hoDan_104 : dshd_104) {
			dstv_104 = hoDan_104.getList_104();
			for (int i = 0; i < hoDan_104.getSoNguoi_104(); i++) {
				if (namHienTai - (dstv_104[i].getNgaySinh_104().getYear() + 1900) == 80) {
					hoDan_104.hienThiThongTin();
				}
			}
		}
	}
}