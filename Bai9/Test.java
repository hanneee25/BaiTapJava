package Bai9;
import java.util.Scanner;

import Bai9.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql_104 = new QuanLy();

		ql_104.nhapDanhSach(sc);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql_104.hienThiDanhSachTraCuoiThang();

		sc.close();
	}

}