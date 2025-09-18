/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10;

/**
 *
 * @author THUONG
 */
import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo242;
	protected int soNha242;
	protected String maCongTo242;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo242, int soNha242, String maCongTo242) {
		this.tenChuHo242 = tenChuHo242;
		this.soNha242 = soNha242;
		this.maCongTo242 = maCongTo242;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo242 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha242 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo242 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo242);
		System.out.println("\tSo nha: " + soNha242);
		System.out.println("\tMa cong to: " + maCongTo242);
	}
}
