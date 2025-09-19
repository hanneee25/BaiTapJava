package Bai6;
import java.util.Scanner;
public class KhachTro extends Nguoi {
	private int soNgayTro_104;
	private String loaiPhong_104;
	private double giaPhong_104;
	public KhachTro() {
	}
	public KhachTro(String hoTen_104, int CMND_104, int soNgayTro_104, String loaiPhong_104, double giaPhong_104) {
		super(hoTen_104, ngaySinh_104, CMND_104);
		this.soNgayTro_104 = soNgayTro_104;
		this.loaiPhong_104 = loaiPhong_104;
		this.giaPhong_104 = giaPhong_104;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so ngay tro: ");
		soNgayTro_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong_104 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong_104 = sc.nextDouble();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo ngay tro: " + soNgayTro_104);
		System.out.println("\tLoai phong: " + loaiPhong_104);
		System.out.println("\tGia phong: " + giaPhong_104);
	}
	public int getSoNgayTro_104() {
		return soNgayTro_104;
	}
	public double getGiaPhong_104() {
		return giaPhong_104;
	}
}