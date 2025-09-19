package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds_104;
	public KhachSan() {
		ds_104 = new ArrayList<KhachTro>(10);
	}
	public void themKhachTro(KhachTro kt_104) {
		ds_104.add(kt_104);
	}
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach_104;

		System.out.print("Nhap vao so luong khach: ");
		int n_104 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao thong tin khach tro:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Khach tro thu " + (i_104 + 1) + " la:");
			khach_104 = new KhachTro();
			khach_104.nhapThongTin(sc);
			themKhachTro(khach_104);
		}
	}
	public void hienThiDanhSach() {
		for (KhachTro khach_104 : ds_104) {
			khach_104.hienThiThongTin();
		}
	}
	public double tinhTien(int CMND_104) {
		double tien_104 = 0;

		for (KhachTro khach_104 : ds_104) {
			if (khach_104.getCMND_104() == CMND_104) {
				tien_104 = khach_104.getSoNgayTro_104() * khach_104.getGiaPhong_104();
			}
		}

		return tien_104;
	}
}