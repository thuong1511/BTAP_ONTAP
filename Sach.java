/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia242;
	private int soTrang242;
	public Sach() {
	}

	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia242, int soTrang242) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia242 = tacGia242;
		this.soTrang242 = soTrang242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia242 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang242 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia242);
		System.out.println("\tSo trang: " + soTrang242);
	}
}