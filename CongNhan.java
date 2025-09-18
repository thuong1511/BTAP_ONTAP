/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;

import java.util.Scanner;

/**
 *
 * @author THUONG
 */
public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac242;
	public CongNhan() {

	}
	public CongNhan(String hoten, String ngaySinh, String gioiTinh, String diaChi, String bac242) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.bac242 = bac242;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac242 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac242);
	}
}