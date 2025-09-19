package Bai4;

import java.util.Scanner;
import Bai4.TuyenSinh;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_104 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_104.nhapDanhSach(sc);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_104.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh_104 = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh_104.timKiemThiSinh(soBaoDanh_104);

		sc.close();
	}
}