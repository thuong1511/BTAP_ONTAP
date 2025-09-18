/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author THUONG
 */
public class Nguoi {
	// thuoc tinh
	private String hoTen242;
	private Date ngaySinh242;
	private String ngheNghiep242;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen242, Date ngaySinh242, String ngheNghiep242) {
		this.hoTen242 = hoTen242;
		this.ngaySinh242 = ngaySinh242;
		this.ngheNghiep242 = ngheNghiep242;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh242 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep242 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen242);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh242));
		System.out.println("\tNghe nghiep: " + ngheNghiep242);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date);

		return strDate;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh242;
	}
}
