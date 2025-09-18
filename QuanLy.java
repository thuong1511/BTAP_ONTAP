/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9;

/**
 *
 * @author THUONG
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<TheMuon> ds242;

	// phuong thuc
	// ham khoi tao khong doi so
	public QuanLy() {
		ds242 = new ArrayList<TheMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(TheMuon theMuon) {
		ds242.add(theMuon);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon;

		System.out.print("Nhap vao so luong the muon: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			theMuon = new TheMuon();
			theMuon.nhapThongTin(sc);
			themTheMuon(theMuon);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the : ds242) {
			if (the.getHanTra().getDate() == 31 || the.getHanTra().getDate() == 30) {
				the.hienThiThongTin();
			}
		}
	}
}
