package Bai4;
import java.util.Scanner;
public class ThiSinh {
	// thuoc tinh
	private int soBD_104;
	private String hoTen_104;
	private String diaChi_104;
	private String dienUuTien_104;
	public ThiSinh() {
	}
	public ThiSinh(int soBD_104, String hoTen_104, String diaChi_104, String dienUuTien_104) {
		this.soBD_104 = soBD_104;
		this.hoTen_104 = hoTen_104;
		this.diaChi_104 = diaChi_104;
		this.dienUuTien_104 = dienUuTien_104;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_104 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_104 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD_104);
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tDia chi: " + diaChi_104);
		System.out.println("\tDien uu tien: " + dienUuTien_104);
	}
	public int getSoBD_104() {
		return soBD_104;
	}
}