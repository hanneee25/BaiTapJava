package Bai8;

import java.util.Scanner;

import Bai8.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql_104 = new QuanLy();

		ql_104.nhapDanhSach(sc);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql_104.timKiem(8000000);

		sc.close();
	}

}