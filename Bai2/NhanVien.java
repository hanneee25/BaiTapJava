package Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec104;

    public NhanVien() {
        super();
    }

    public NhanVien(String hoTen104, String ngaySinh104, String gioiTinh104, String diaChi104, String congViec104) {
        super(hoTen104, ngaySinh104, gioiTinh104, diaChi104);
        this.congViec104 = congViec104;
    }

    @Override
    public void nhapThongTin104(Scanner sc104) {
        super.nhapThongTin104(sc104);
        System.out.print("\tNhap cong viec: ");
        congViec104 = sc104.nextLine();
    }

    @Override
    public void hienThiThongTin104() {
        super.hienThiThongTin104();
        System.out.println("\tCong viec: " + congViec104);
    }
}