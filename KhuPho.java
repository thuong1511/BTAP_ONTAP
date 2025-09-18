/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;

/**
 *
 * @author THUONG
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd242;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd242 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan) {
		dshd242.add(hoDan);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = dshd242.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd242.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
    LocalDate today = LocalDate.now(); // ngày hiện tại

    for (HoDan hoDan : dshd242) {
        Nguoi[] dstv = hoDan.getList();
        for (int i = 0; i < hoDan.getSoNguoi(); i++) {
            // chuyển Date -> LocalDate
            LocalDate ngaySinh = dstv[i].getNgaySinh().toInstant()
                                    .atZone(ZoneId.systemDefault())
                                    .toLocalDate();

            int tuoi = Period.between(ngaySinh, today).getYears();

            if (tuoi == 80) {
                System.out.println("Người 80 tuổi trong hộ dân:");
                dstv[i].hienThiThongTin(); // hiển thị đúng người
            }
        }
    }
}

}
