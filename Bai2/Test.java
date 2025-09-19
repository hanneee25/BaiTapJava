package Bai2;


import java.util.Scanner;
import Bai2.QLCB;

public class Test {

    public static void main(String[] args) {
        Scanner sc104 = new Scanner(System.in);

        QLCB qlcb104 = new QLCB();

        qlcb104.nhapDanhSach104(sc104);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name104 = sc104.nextLine();

        qlcb104.timKiemCanBo104(name104);

        // huy sc
        sc104.close();
    }
}