/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9;

/**
 *
 * @author THUONG
 */
import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen242;
	protected String maSV242;
	protected String ngaySinh242;
	protected String lop242;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen242, String maSV242, String ngaySinh242, String lop242) {
		this.hoTen242 = hoTen242;
		this.maSV242 = maSV242;
		this.ngaySinh242 = ngaySinh242;
		this.lop242 = lop242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV242 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh242 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop242 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen242);
		System.out.println("\tNgay sinh: " + ngaySinh242);
		System.out.println("\tMa sinh vien: " + maSV242);
		System.out.println("\tLop: " + lop242);
	}
}

