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
public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++){
            int n = sc.nextInt();
            int [] a = new int [n];
            int [] b = new int [100001];
            for(int i = 0; i < n; i++){
                a[i]=sc.nextInt();
                b[a[i]]++;
            }
             System.out.println("Test " + k + ":");
            for(int i = 0; i < n; i++){
                if(b[a[i]]!=0){
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]] = 0;
                }
            }
        }
    }
}
