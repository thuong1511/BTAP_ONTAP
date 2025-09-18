/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;

import java.util.Scanner;

/**
 *
 * @author THUONG
 */
public class Main {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	QLCB qlcb = new QLCB();
	qlcb.nhapDanhSach(sc);
	System.out.print("Nhap vao ho ten can tim kiem: ");
	String name = sc.nextLine();
	qlcb.timKiemCanBo(name);
 	sc.close();
    }
}
