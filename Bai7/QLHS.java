package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs_104;
	public QLHS() {
		dshs_104 = new ArrayList<HocSinh>(10);
	}
	public void themHS(HocSinh hs_104) {
		dshs_104.add(hs_104);
	}
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs_104;
		System.out.print("Nhap vao so luong hoc sinh: ");
		int n_104 = sc.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("\tHoc sinh thu " + (i_104 + 1) + " la:");

			hs_104 = new HocSinh();
			hs_104.nhapThongTin(sc);

			themHS(hs_104);
		}
	}
	public void hienThiDanhSach() {
		int n_104 = dshs_104.size();
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("\tHoc sinh thu " + (i_104 + 1) + " la:");
			dshs_104.get(i_104).hienThiThongTin();
		}
	}
	public void timKiemThongTin(int nam_104, String que_104) {
		for (HocSinh hs_104 : dshs_104) {
			if ((hs_104.getNgaySinh_104().getYear() + 1900 == nam_104) && (que_104.equals(hs_104.getQueQuan_104()))) {
				hs_104.hienThiThongTin();
			}
		}
	}
	public void timKiemThongTin(String lop_104) {
		for (HocSinh hs_104 : dshs_104) {
			if (lop_104.equals(hs_104.getLop_104())) {
				hs_104.hienThiThongTin();
			}
		}
	}
}