/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9;

/**
 *
 * @author THUONG
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon242;
	private Date ngayMuon242;
	private Date hanTra242;
	private String soHieu242;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon242, Date ngayMuon242, String soHieu242) {
		this.soMuon242 = soMuon242;
		this.ngayMuon242 = ngayMuon242;
		this.soHieu242 = soHieu242;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon242 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon242 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra242 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu242 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon242);
		System.out.println("\tNgay muon: " + ngayMuon242);
		System.out.println("\tHan tra: " + hanTra242);
		System.out.println("\tSo hieu: " + soHieu242);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra242;
	}
}

