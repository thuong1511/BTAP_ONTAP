/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;

/**
 *
 * @author THUONG
 */
import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    // thuoc tinh

    private int soNguoi242;
    private int soNha242;
    private Nguoi[] list242;

    public HoDan() {
        list242 = new Nguoi[10];
    }

    // ham khoi tao co doi so
    public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi242, int soNha242) {
        super(hoTen, ngaySinh, ngheNghiep);
        this.soNguoi242 = soNguoi242;
        this.soNha242 = soNha242;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so nguoi: ");
        soNguoi242 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha242 = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i = 0; i < soNguoi242; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list242[i] = new Nguoi();
            list242[i].nhapThongTin(sc);
        }
    }
    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi242);
        System.out.println("\tSo nha: " + soNha242);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i = 0; i < soNguoi242; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list242[i].hienThiThongTin();
        }
    }
    public Nguoi[] getList() {
        return list242;
    }
    public int getSoNguoi() {
        return soNguoi242;
    }
}
