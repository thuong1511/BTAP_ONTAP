
package pkg4;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1242;
    private String mon2242;
    private String mon3242;
    public KhoiA() {
    }
    public KhoiA(String mon1242, String mon2242, String mon3242) {
        this.mon1242 = mon1242;
        this.mon2242 = mon2242;
        this.mon3242 = mon3242;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap mon 1: ");
        mon1242 = sc.nextLine();
        System.out.print("\tNhap mon 2: ");
        mon2242 = sc.nextLine();
        System.out.print("\tNhap mon 3: ");
        mon3242 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + mon1242 + " - " + mon2242 + " - " + mon3242);
    }
}
