package Bai2;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb104;

    public QLCB() {
        dscb104 = new ArrayList<>();
    }

    public void themCanBo104(CanBo cb104) {
        dscb104.add(cb104);
    }

    public void nhapDanhSach104(Scanner sc104) {
        System.out.print("Nhap vao so luong can bo: ");
        int n = sc104.nextInt();
        sc104.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nLan nhap thu " + (i + 1) + ":");
            System.out.print("Chon loai can bo (1-KySu, 2-NhanVien, 3-CongNhan): ");
            int chon = sc104.nextInt();
            sc104.nextLine();

            CanBo cb104 = null;
            switch (chon) {
                case 1:
                    cb104 = new KySu();
                    break;
                case 2:
                    cb104 = new NhanVien();
                    break;
                case 3:
                    cb104 = new CongNhan();
                    break;
                default:
                    System.out.println("Lua chon khong hop le, mac dinh la KySu.");
                    cb104 = new KySu();
                    break;
            }

            cb104.nhapThongTin104(sc104);
            themCanBo104(cb104);
        }
    }

    public void timKiemCanBo104(String hoTen104) {
        boolean found = false;
        for (CanBo cb104 : dscb104) {
            if (cb104.getHoTen104().equalsIgnoreCase(hoTen104)) {
                cb104.hienThiThongTin104();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay can bo co ten: " + hoTen104);
        }
    }
}