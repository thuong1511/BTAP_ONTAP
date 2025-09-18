package pkg1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhanSo ps1= new PhanSo();
        PhanSo ps2= new PhanSo();

        System.out.println("Nhap vao phan so thu nhat:");
        ps1.Nhap(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2.Nhap(sc);

        PhanSo psTong = ps1.congPS(ps2);	
        PhanSo psHieu = ps1.truPS(ps2);
        PhanSo psTich = ps1.nhanPS(ps2);
        PhanSo psThuong = ps1.chiaPS(ps2);

        System.out.println("\nPhan so thu nhat la:");
        ps1.hienthi();
        System.out.println("Phan so thu hai la:");
        ps2.hienthi();
        System.out.println("Tong hai phan so la:");
        psTong.hienthi();
        System.out.println("Hieu hai phan so la:");
        psHieu.hienthi();
        System.out.println("Tich hai phan so la:");
        psTich.hienthi();
        System.out.println("Thuong hai phan so la:");
        psThuong.hienthi();

        sc.close();      
    } 
}
