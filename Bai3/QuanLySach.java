package Bai3;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu104> dstl104;

    public QuanLySach() {
        dstl104 = new ArrayList<TaiLieu104>(10);
    }

    public void themTaiLieu104(TaiLieu104 tl104) {
        dstl104.add(tl104);
    }

    public void nhapDanhSachTL(Scanner sc104) {
        int chon104;
        String stop104;
        TaiLieu104 tl104;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
            chon104 = sc104.nextInt();
            sc104.nextLine();

            switch (chon104) {
                case 1:
                    tl104 = new Sach104();
                    break;
                case 2:
                    tl104 = new TapChi();
                    break;
                case 3:
                    tl104 = new Bao();
                    break;
                default:
                    tl104 = new Sach104();
                    break;
            }

            // gọi phương thức nhập trên đối tượng (hãy đảm bảo tên method trong lớp con là `nhapThongTin`)
            tl104.nhapThongTin(sc104);
            themTaiLieu104(tl104);

            System.out.print("\nBan co muon nhap nua hay khong (c/k): ");
            stop104 = sc104.nextLine();
        } while (stop104.equalsIgnoreCase("c"));
    }

    public void timMaTL(String maTL104) {
        boolean found = false;
        for (TaiLieu104 tl : dstl104) {
            // nếu trong TaiLieu bạn đổi getter thành getMaTaiLieu104() thì gọi cái đó
            // nếu getter vẫn là getMaTaiLieu() thì đổi về getMaTaiLieu()
            if (maTL104.equalsIgnoreCase(tl.getMaTaiLieu104())) {
                tl.hienThiThongTin();
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay ma tai lieu: " + maTL104);
    }

    public void timLoaiTL(String loai104) {
        for (TaiLieu104 tl : dstl104) {
            if (loai104.equalsIgnoreCase("Sach") && (tl instanceof Sach104)) {
                tl.hienThiThongTin();
            } else if (loai104.equalsIgnoreCase("TapChi") && (tl instanceof TapChi)) {
                tl.hienThiThongTin();
            } else if (loai104.equalsIgnoreCase("Bao") && (tl instanceof Bao)) {
                tl.hienThiThongTin();
            }
        }
    }
}
