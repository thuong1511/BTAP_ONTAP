
package pkg3;
import java.util.Scanner;
public class TaiLieu {
	private String maTaiLieu242;
	private String tenNXB242;
	private int soBanPhatHanh242;
	public TaiLieu() {
	}
	public TaiLieu(String maTaiLieu242, String tenNXB242, int soBanPhatHanh242) {
		this.maTaiLieu242 = maTaiLieu242;
		this.tenNXB242 = tenNXB242;
		this.soBanPhatHanh242 = soBanPhatHanh242;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu242 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB242 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh242 = sc.nextInt();
		sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu242);
		System.out.println("\tTen nha xuat ban: " + tenNXB242);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh242);
	}
	public String getMaTaiLieu() {
		return maTaiLieu242;
	}
}

