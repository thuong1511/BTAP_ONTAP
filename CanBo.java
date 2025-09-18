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
public class CanBo {
	// thuoc tinh
	private String hoTen242;
	private String ngaySinh242;
	private String gioiTinh242;
	private String diaChi242;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten, String ngaySinh242, String gioiTinh242, String diaChi242) {
		this.hoTen242 = hoten;
		this.ngaySinh242 = ngaySinh242;
		this.gioiTinh242 = gioiTinh242;
		this.diaChi242 = diaChi242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh242 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh242 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi242 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen242);
		System.out.println("\tNgay sinh: " + ngaySinh242);
		System.out.println("\tGioi tinh: " + gioiTinh242);
		System.out.println("\tDia chi: " + diaChi242);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen242;
	}
}




