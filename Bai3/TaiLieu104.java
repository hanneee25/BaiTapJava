package Bai3;
import java.util.Scanner;
public class TaiLieu104 {
    private String maTaiLieu104;
    private String tenNXB104;
    private int soBanPhatHanh104;
    public TaiLieu104() {
    }
    public TaiLieu104(String maTaiLieu104, String tenNXB104, int soBanPhatHanh104) {
        this.maTaiLieu104 = maTaiLieu104;
        this.tenNXB104 = tenNXB104;
        this.soBanPhatHanh104 = soBanPhatHanh104;
    }
    public void nhapThongTin104(Scanner sc104) {
        System.out.print("\tNhap ma tai lieu: ");
        maTaiLieu104 = sc104.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        tenNXB104 = sc104.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        soBanPhatHanh104 = sc104.nextInt();
        sc104.nextLine(); // bỏ dòng thừa
    }
    public void hienThiThongTin104() {
        System.out.println("\tMa tai lieu: " + maTaiLieu104);
        System.out.println("\tTen nha xuat ban: " + tenNXB104);
        System.out.println("\tSo ban phat hanh: " + soBanPhatHanh104);
    }
    public String getMaTaiLieu104() {
        return maTaiLieu104;
    }
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub		
	}
	public void hienThiThongTin() {
		// TODO Auto-generated method stub		
	}
}

