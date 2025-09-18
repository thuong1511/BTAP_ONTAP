/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7;

import java.util.Scanner;

/**
 *
 * @author THUONG
 */
public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop242;
	private String khoHoc242;
	private String kyHoc242;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen242, String lop242, String khoaHoc, String kyHoc242) {
		this.hoTen242 = hoTen242;
		this.lop242 = lop242;
		this.khoHoc242 = khoaHoc;
		this.kyHoc242 = kyHoc242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop242 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc242 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc242 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop242);
		System.out.println("\tKhoa hoc: " + khoHoc242);
		System.out.println("\tKy hoc: " + kyHoc242);
	}

	// ham lay ra thong tin ve lop242
	public String getLop() {
		return lop242;
	}
}
