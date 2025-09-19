package Bai2;


import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao104;

    public KySu() {
        super();
    }

    public KySu(String hoTen104, String ngaySinh104, String gioiTinh104, String diaChi104, String nganhDaoTao104) {
        super(hoTen104, ngaySinh104, gioiTinh104, diaChi104);
        this.nganhDaoTao104 = nganhDaoTao104;
    }

    @Override
    public void nhapThongTin104(Scanner sc104) {
        super.nhapThongTin104(sc104);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao104 = sc104.nextLine();
    }

    @Override
    public void hienThiThongTin104() {
        super.hienThiThongTin104();
        System.out.println("\tNganh dao tao: " + nganhDaoTao104);
    }
}