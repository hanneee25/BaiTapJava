package Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac104;
    public CongNhan() {
        super();
    }
    public CongNhan(String hoTen104, String ngaySinh104, String gioiTinh104, String diaChi104, String bac104) {
        super(hoTen104, ngaySinh104, gioiTinh104, diaChi104);
        this.bac104 = bac104;
    }

    @Override
    public void nhapThongTin104(Scanner sc104) {
        super.nhapThongTin104(sc104);
        System.out.print("\tNhap bac: ");
        bac104 = sc104.nextLine();
    }

    @Override
    public void hienThiThongTin104() {
        super.hienThiThongTin104();
        System.out.println("\tBac: " + bac104);
    }
}
