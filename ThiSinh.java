/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4;

import java.util.Scanner;

/**
 *
 * @author THUONG
 */
public class ThiSinh {
	// thuoc tinh
	private int soBD242;
	private String hoTen242;
	private String diaChi242;
	private String dienUuTien242;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD242, String hoTen242, String diaChi242, String dienUuTien242) {
		this.soBD242 = soBD242;
		this.hoTen242 = hoTen242;
		this.diaChi242 = diaChi242;
		this.dienUuTien242 = dienUuTien242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD242 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi242 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien242 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD242);
		System.out.println("\tHo ten: " + hoTen242);
		System.out.println("\tDia chi: " + diaChi242);
		System.out.println("\tDien uu tien: " + dienUuTien242);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD242;
	}
}
