package Bai2;
import java.util.Scanner;
public class CanBo {
    private String hoTen104;
    private String ngaySinh104;
    private String gioiTinh104;
    private String diaChi104;
    public CanBo() {
    }
    public CanBo(String hoTen104, String ngaySinh104, String gioiTinh104, String diaChi104) {
        this.hoTen104 = hoTen104;
        this.ngaySinh104 = ngaySinh104;
        this.gioiTinh104 = gioiTinh104;
        this.diaChi104 = diaChi104;
    }
    public void nhapThongTin104(Scanner sc104) {
        System.out.print("\tNhap ho ten: ");
        hoTen104 = sc104.nextLine();
        System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh104 = sc104.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        gioiTinh104 = sc104.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi104 = sc104.nextLine();
    }
    public void hienThiThongTin104() {
        System.out.println("\tHo ten: " + hoTen104);
        System.out.println("\tNgay sinh: " + ngaySinh104);
        System.out.println("\tGioi tinh: " + gioiTinh104);
        System.out.println("\tDia chi: " + diaChi104);
    }
    public String getHoTen104() {
        return this.hoTen104;
    }
}