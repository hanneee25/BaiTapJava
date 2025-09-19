package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	private ArrayList<BienLai> ds_104;
	public QuanLy() {
		ds_104 = new ArrayList<BienLai>(10);
	}
	public void themBienLai(BienLai bienLai_104) {
		ds_104.add(bienLai_104);
	}
	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai_104;
		System.out.print("Nhap vao so luong bien lai: ");
		int n_104 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Bien lai thu " + (i_104 + 1) + " la:");
			bienLai_104 = new BienLai();
			bienLai_104.nhapThongTin(sc);

			themBienLai(bienLai_104);
		}
	}
	public void hienThiDanhSach() {
		for (int i_104 = 0; i_104 < ds_104.size(); i_104++) {
			System.out.println("Bien lai thu " + (i_104 + 1) + " la:");
			ds_104.get(i_104).hienThiThongTin();
			System.out.println();
		}
	}
}