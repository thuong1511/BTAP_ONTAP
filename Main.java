/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8;

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

		QuanLy ql = new QuanLy();

		ql.nhapDanhSach(sc);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql.timKiem(8000000);

		sc.close();
	}

}