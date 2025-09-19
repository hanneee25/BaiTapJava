package Bai4;
import java.util.ArrayList;
import java.util.Scanner;
public class TuyenSinh {
	private ArrayList<ThiSinh> dsts_104;
	public TuyenSinh() {
		dsts_104 = new ArrayList<ThiSinh>(10);
	}
	public void themThiSinh(ThiSinh ts_104) {
		dsts_104.add(ts_104);
	}
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts;
		int chon;
		System.out.print("Nhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts.nhapThongTin(sc);
			themThiSinh(ts);
		}
	}
	public void hienThiDanhSach() {
		int n = dsts_104.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts_104.get(i).hienThiThongTin();
		}
	}
	public void timKiemThiSinh(int soBaoDanh_104) {
		for (ThiSinh ts_104 : dsts_104) {
			if (ts_104.getSoBD_104() == soBaoDanh_104) {
				ts_104.hienThiThongTin();
			}
		}
	}
}