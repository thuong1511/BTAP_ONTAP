/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts242;

	// phuong thuc
	public TuyenSinh() {
		dsts242 = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts) {
		dsts242.add(ts);
	}

	// nhap danh sach
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

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts242.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts242.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts242) {
			if (ts.getSoBD() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
