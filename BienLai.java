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

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi242;
	private int chiSoCu242;
	private double tien242;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi242, int chiSoCu242, double tien242) {
		this.chiSoMoi242 = chiSoMoi242;
		this.chiSoCu242 = chiSoCu242;
		this.tien242 = tien242;
	}

	public BienLai(String tenChuHo, int chiSoMoi242, int chiSoCu242, double tien242) {
		this.tenChuHo242 = tenChuHo242;
		this.chiSoMoi242 = chiSoMoi242;
		this.chiSoCu242 = chiSoCu242;
		this.tien242 = tien242;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi242 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu242 = sc.nextInt();
		sc.nextLine();
		tien242 = (chiSoMoi242 - chiSoCu242) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi242);
		System.out.println("\tChi so cu: " + chiSoCu242);
		System.out.println("\tTien: : " + tien242);
	}
}
