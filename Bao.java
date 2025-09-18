/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3;

import java.util.Scanner;

    public class Bao extends TaiLieu {

	private String ngayPhatHanh242;
	public Bao() {
	}
	public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh242) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh242 = ngayPhatHanh242;
	}
        public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh242 = sc.nextLine();
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh242);
	}
}

