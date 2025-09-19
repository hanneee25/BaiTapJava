package Bai10;
import java.util.Scanner;
public class BienLai extends KhachHang {
	private int chiSoMoi_104;
	private int chiSoCu_104;
	private double tien_104;
	public BienLai() {
	}
	public BienLai(int chiSoMoi_104, int chiSoCu_104, double tien_104) {
		this.chiSoMoi_104 = chiSoMoi_104;
		this.chiSoCu_104 = chiSoCu_104;
		this.tien_104 = tien_104;
	}
	public BienLai(String tenChuHo_104, int chiSoMoi_104, int chiSoCu_104, double tien_104) {
		super(tenChuHo_104, chiSoCu_104, tenChuHo_104);
		this.chiSoMoi_104 = chiSoMoi_104;
		this.chiSoCu_104 = chiSoCu_104;
		this.tien_104 = tien_104;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_104 = sc.nextInt();
		sc.nextLine();
		tien_104 = (chiSoMoi_104 - chiSoCu_104) * 750;
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_104);
		System.out.println("\tChi so cu: " + chiSoCu_104);
		System.out.println("\tTien: : " + tien_104);
	}
}