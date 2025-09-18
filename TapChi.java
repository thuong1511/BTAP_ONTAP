
package pkg3;
import java.util.Scanner;
public class TapChi extends TaiLieu {
	private int soPhatHanh242;
	private int thangPhatHanh242;
	public TapChi() {
	}
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh242, int thangPhatHanh242) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh242 = soBanPhatHanh;
		this.thangPhatHanh242 = thangPhatHanh242;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh242 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh242 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh242);
		System.out.println("\tThang phat hanh: " + thangPhatHanh242);
	}
}

