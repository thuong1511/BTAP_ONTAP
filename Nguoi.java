/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6;

/**
 *
 * @author THUONG
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen242;
	protected Date ngaySinh242;
	protected int CMND242;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen242, Date ngaySinh242, int CMND242) {
		this.hoTen242 = hoTen242;
		this.ngaySinh242 = ngaySinh242;
		this.CMND242 = CMND242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh242 = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND242 = sc.nextInt();
	}

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

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen242);
		System.out.println("\tNgay sinh: " + ngaySinh242);
		System.out.println("\tCMND: " + CMND242);
	}

	// ham lay ra thong tin CMND242
	public int getCMND242() {
		return CMND242;
	}
}

