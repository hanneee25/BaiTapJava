package Bai10;

import java.util.Scanner;

import Bai10.QuanLy;

public class Using {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql_104 = new QuanLy();
		ql_104.nhapDanhSach(sc);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql_104.hienThiDanhSach();

		sc.close();
	}
}