package Bai1;

import java.util.Scanner;
import Bai1.PhanSo;
public class Test {

	public static void main(String[] args) {
		Scanner sc104 = new Scanner(System.in);
		PhanSo ps104_1 = new PhanSo();
		PhanSo ps104_2 = new PhanSo();
		PhanSo psTong104 = new PhanSo();
		
		// nhap phan so
		System.out.println("Nhap vao phan so thu nhat:");
		ps104_1.nhapPS(sc104);
		System.out.println("Nhap vao phan so thu hai:");
		ps104_2.nhapPS(sc104);
		
		// tinh tong 2 phan so
		psTong104 = ps104_1.congPS(ps104_2);
		
		// hien thi phan so
		System.out.println("\nPhan so thu nhat la:");
		ps104_1.hienThiPS();
		System.out.println("\nPhan so thu hai la:");
		ps104_2.hienThiPS();
		System.out.println("\nPhan so tong la:");
		psTong104.hienThiPS();
		
		sc104.close();
	}
}