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

public class Nguoi {
	// thuoc tinh
	protected String hoTen242;
	protected String ngaySinh242;
	protected String queQuan242;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen242, String ngaySinh242, String queQuan242) {
		this.hoTen242 = hoTen242;
		this.ngaySinh242 = ngaySinh242;
		this.queQuan242 = queQuan242;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh242 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan242 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen242);
		System.out.println("\tNgay sinh: " + ngaySinh242);
		System.out.println("\tQue quan: " + queQuan242);
	}
}

