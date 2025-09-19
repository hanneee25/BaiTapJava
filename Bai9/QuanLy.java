package Bai9;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
	private ArrayList<TheMuon> ds_104;
	public QuanLy() {
		ds_104 = new ArrayList<TheMuon>(10);
	}
	public void themTheMuon(TheMuon theMuon_104) {
		ds_104.add(theMuon_104);
	}
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon_104;

		System.out.print("Nhap vao so luong the muon: ");
		int n_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("The muon thu " + (i_104 + 1) + " la:");
			theMuon_104 = new TheMuon();
			theMuon_104.nhapThongTin(sc);
			themTheMuon(theMuon_104);
		}
	}
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the_104 : ds_104) {
			if (the_104.getHanTra_104().getDate() == 31 || the_104.getHanTra_104().getDate() == 30) {
				the_104.hienThiThongTin();
			}
		}
	}
}