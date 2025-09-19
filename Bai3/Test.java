package Bai3;


import java.util.Scanner;
import Bai3.QuanLySach;

public class Test {
    public static void main(String[] args) {
        Scanner sc104 = new Scanner(System.in);

        QuanLySach qls104 = new QuanLySach();

        qls104.nhapDanhSachTL(sc104);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai104 = sc104.nextLine();
        qls104.timLoaiTL(loai104);

        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL104 = sc104.nextLine();
        qls104.timMaTL(maTL104);

        sc104.close();
    }
}