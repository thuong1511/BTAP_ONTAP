/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8;

/**
 *
 * @author THUONG
 */
import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung242;
	private double thuong242;
	private double phat242;
	private double luongThucLinh242;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung242 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong242 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat242 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh242 = luongCung242 + thuong242 - phat242;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung242);
		System.out.println("\tThuong: " + thuong242);
		System.out.println("\tPhat: " + phat242);
		System.out.println("\tLuong thuc linh: " + luongThucLinh242);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh242;
	}
}

