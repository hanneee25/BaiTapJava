package Bai6;

import java.util.Scanner;

import Bai6.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhachSan ql_104 = new KhachSan();

		ql_104.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd_104 = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql_104.tinhTien(cmnd_104));

		sc.close();
	}
}