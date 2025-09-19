package Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu104 {
    // Thuộc tính
    private String ngayPhatHanh104;

    // Phương thức
    // Hàm khởi tạo không đối số
    public Bao() {
        super();
    }

    // Hàm khởi tạo có đối số
    public Bao(String maTaiLieu104, String tenNXB104, int soBanPhatHanh104, String ngayPhatHanh104) {
        super(maTaiLieu104, tenNXB104, soBanPhatHanh104);
        this.ngayPhatHanh104 = ngayPhatHanh104;
    }

    // Hàm nhập
    public void nhapThongTin104(Scanner sc104) {
        super.nhapThongTin104(sc104);
        System.out.print("\tNhap ngay phat hanh: ");
        ngayPhatHanh104 = sc104.nextLine();
    }

    // Hàm hiển thị
    public void hienThiThongTin104() {
        super.hienThiThongTin104();
        System.out.println("\tNgay phat hanh: " + ngayPhatHanh104);
    }
}