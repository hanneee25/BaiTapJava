package Bai3;

import java.util.Scanner;

public class Sach104 extends TaiLieu104 {
    // Thuộc tính
    private String tacGia104;
    private int soTrang104;

    public Sach104() {

    }
    public Sach104(String maTaiLieu104, String tenNXB104, int soBanPhatHanh104, String tacGia104, int soTrang104) {
        super(maTaiLieu104, tenNXB104, soBanPhatHanh104);
        this.tacGia104 = tacGia104;
        this.soTrang104 = soTrang104;
    }

    public void nhapThongTin104(Scanner sc104) {
        super.nhapThongTin104(sc104);
        System.out.print("\tNhap tac gia: ");
        tacGia104 = sc104.nextLine();
        System.out.print("\tNhap so trang: ");
        soTrang104 = sc104.nextInt();
        sc104.nextLine(); // bỏ dòng thừa
    }
    public void hienThiThongTin104() {
        super.hienThiThongTin104();
        System.out.println("\tTac gia: " + tacGia104);
        System.out.println("\tSo trang: " + soTrang104);
    }
}
