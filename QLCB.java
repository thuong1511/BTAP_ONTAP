/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb242;
    public QLCB() {
	dscb242 = new ArrayList<CanBo>(10);
    }
    public void themCanBo(CanBo cb) {
	dscb242.add(cb);
    }
    public void nhapDanhSach(Scanner sc) {
	CanBo cb;
	System.out.print("Nhap vao so luong can bo: ");
	int n = sc.nextInt();
	sc.nextLine();

	System.out.println("Nhap thong tin chi tiet:");
	for (int i = 0; i < n; i++) {
		System.out.println("Lan nhap thu " + (i + 1) + ":");
		System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
		int chon = sc.nextInt();
		sc.nextLine();
		cb = new CanBo();

		switch (chon) {
                    case 1:
       			cb = new KySu();
			break;
                    case 2:
			cb = new NhanVien();
       			break;
			case 3:
			cb = new CongNhan();
			break;

                    default:
			cb = new KySu();
			break;
            }
            cb.nhapThongTin(sc);
            themCanBo(cb);
	}
    }

    public void timKiemCanBo(String hoTen) {
	for (CanBo cb : dscb242) {
            if (hoTen.equals(cb.getHoTen())) {
		cb.hienThiThongTin();
            }
	}
    }
}

