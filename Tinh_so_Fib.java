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
public class Tinh_so_Fib {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long [] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; i++){
            f[i] = f[i-1]+f[i-2];
        }
        while(t>0){
            int n = sc.nextInt();
            System.out.println(f[n]);
            t--;
        }
    }
}