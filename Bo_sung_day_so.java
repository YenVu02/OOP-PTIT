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
public class Bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] f = new int[201];
        int Max = -1;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            f[a[i]] = 1;
            Max = Math.max(a[i], Max);
        }
        boolean kt = false;
        for(int i = 1; i <= Max; i++){
            if(f[i] == 0){
                System.out.println(i);
                kt = true;
            }
        }
        if(!kt) System.out.println("Excellent!");
    }
}
