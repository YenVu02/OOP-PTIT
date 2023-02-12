/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt;

/**
 *
 * @author admin
 */

import java.util.Scanner;

public class Nhap{
	public static void taoEmail(String[] s, int n) {
		String[] diaChiMail = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = s[i].toLowerCase();
			s[i] = s[i].trim();
			String[] tmp = s[i].split(" ");
			int t = tmp.length;
			String temp = tmp[t - 1];
			for (int j = 0; j < t - 1; j++) {
				if (tmp[j].length() > 0)
					temp = temp + tmp[j].charAt(0);
			}
			diaChiMail[i] = temp;
			int d = 0;
			for (int j = 0; j < n; j++) {
				if (temp.equals(diaChiMail[j])) {
					d++;
				}
			}
			System.out.print(diaChiMail[i]);
			if (d > 1)
				System.out.print(d);
			System.out.print("@ptit.edu.vn");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b = sc.nextLine();
		String[] hoTen = new String[n];
		for (int i = 0; i < n; i++) {
			hoTen[i] = sc.nextLine();
		}
		taoEmail(hoTen, n);
	}
}
