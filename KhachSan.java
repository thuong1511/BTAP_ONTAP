/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6;

/**
 *
 * @author THUONG
 */
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds242;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds242 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt) {
		ds242.add(kt);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;

		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach : ds242) {
			khach.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND) {
		double tien = 0;

		for (KhachTro khach : ds242) {
			if (khach.getCMND242() == CMND) {
				tien = khach.getSoNgayTro() * khach.getGiaPhong();
			}
		}

		return tien;
	}
}
