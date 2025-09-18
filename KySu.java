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
public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao242;

	public KySu() {

	}
	public KySu(String hoten, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao242) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao242 = nganhDaoTao242;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao242 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao242);
	}
}

