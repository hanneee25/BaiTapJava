package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<CBGV> ds_104;
	public QuanLy() {
		ds_104 = new ArrayList<CBGV>(10);
	}
	public void themCBGV(CBGV canBo_104) {
		ds_104.add(canBo_104);
	}
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo_104;

		System.out.print("Nhap vao so luong can bo: ");
		int n_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Can bo thu " + (i_104 + 1) + " la:");
			canBo_104 = new CBGV();
			canBo_104.nhapThongTin(sc);
			themCBGV(canBo_104);
		}
	}
	public void hienThiDanhSach() {
		for (CBGV cb_104 : ds_104) {
			cb_104.hienThiThongTin();
		}
	}
	public void timKiem(double luong_104) {
		for (CBGV cb_104 : ds_104) {
			if (cb_104.getLuongThucLinh_104() >= luong_104) {
				cb_104.hienThiThongTin();
			}
		}
	}
}