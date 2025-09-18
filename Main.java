/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

import java.util.Scanner;

/**
 *
 * @author THUONG
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp = new KhuPho();

		qlkp.nhapDanhSach(sc);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp.timKiemThongTin();
	}

}
