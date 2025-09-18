/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6;

/**
 *
 * @author THUONG
 */
import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro242;
	private String loaiPhong242;
	private double giaPhong242;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen242, int CMND242, int soNgayTro242, String loaiPhong242, double giaPhong242) {
		this.hoTen242 = hoTen242;
		this.CMND242 = CMND242;
		this.soNgayTro242 = soNgayTro242;
		this.loaiPhong242 = loaiPhong242;
		this.giaPhong242 = giaPhong242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro242 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong242 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong242 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro242);
		System.out.println("\tLoai phong: " + loaiPhong242);
		System.out.println("\tGia phong: " + giaPhong242);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro242;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong242;
	}
}
