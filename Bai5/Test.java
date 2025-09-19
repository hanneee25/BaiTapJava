package Bai5;

import java.util.Scanner;
import Bai5.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp_104 = new KhuPho();

		qlkp_104.nhapDanhSach(sc);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_104.timKiemThongTin();
	}

}