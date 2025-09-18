/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7;

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
	protected String queQuan242;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen242, Date ngaySinh242, String queQuan242) {
		this.hoTen242 = hoTen242;
		this.ngaySinh242 = ngaySinh242;
		this.queQuan242 = queQuan242;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
                sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen242 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh242 = strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan242 = sc.nextLine();
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
		System.out.println("\tQue quan: " + queQuan242);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan242;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh242;
	}
}
