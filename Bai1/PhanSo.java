package Bai1;
import java.util.Scanner;
public class PhanSo {
	// thuoc tinh
	private int tuSo;
	private int mauSo;
	public PhanSo() {
		tuSo = 0;
		mauSo = 1;
	}
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	public void nhapPS(Scanner sc) {
		int a104;
		int b104;
		do {
			System.out.print("\tNhap vao tu so: ");
			a104 = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b104 = sc.nextInt();

			// kiem tra
			if (b104 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo = a104;
				mauSo = b104;
			}
		} while (b104 == 0);
	}
	public void hienThiPS() {
		if (tuSo * mauSo < 0) {
			System.out.println("\t-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		} else {
			System.out.println("\t" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		}
	}
	public PhanSo congPS(PhanSo ps2) {
		int a104 = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
		int b104 = mauSo * ps2.mauSo;
		return new PhanSo(a104, b104);
	}
	public PhanSo truPS(PhanSo ps2) {
		int a104 = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
		int b104 = mauSo * ps2.mauSo;
		return new PhanSo(a104, b104);
	}
	public PhanSo nhanPS(PhanSo ps2) {
		int a104 = tuSo * ps2.tuSo;
		int b104 = mauSo * ps2.mauSo;
		return new PhanSo(a104, b104);
	}
	public PhanSo chiaPS(PhanSo ps2) {
		int a104 = tuSo * ps2.mauSo;
		int b104 = mauSo * ps2.tuSo;
		return new PhanSo(a104, b104);
	}
	private int timUSCLN(int a104, int b104) {
		int r104 = a104 % b104;
		while (r104 != 0) {
			a104 = b104;
			b104 = r104;
			r104 = a104 % b104;
		}
		return b104;
	}
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo, mauSo) == 1) {
			return true;
		}
		return false;
	}

	public void toiGianPS() {
		int x104 = timUSCLN(tuSo, mauSo);

		tuSo /= x104;
		mauSo /= x104;
	}
}