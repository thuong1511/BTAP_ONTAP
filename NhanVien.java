/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec242;
	public NhanVien() {

	}
	public NhanVien(String hoten, String ngaySinh, String gioiTinh, String diaChi, String congViec242) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.congViec242 = congViec242;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec242 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec242);
	}
}

