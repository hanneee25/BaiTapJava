package Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu104 {
    private int soPhatHanh104;
    private int thangPhatHanh104;

    public TapChi() { super(); }

    public TapChi(String maTaiLieu104, String tenNXB104, int soBanPhatHanh104,
                  int soPhatHanh104, int thangPhatHanh104) {
        super(maTaiLieu104, tenNXB104, soBanPhatHanh104);
        this.soPhatHanh104 = soPhatHanh104;
        this.thangPhatHanh104 = thangPhatHanh104;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap so phat hanh: ");
        soPhatHanh104 = sc.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        thangPhatHanh104 = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + soPhatHanh104);
        System.out.println("\tThang phat hanh: " + thangPhatHanh104);
    }
}