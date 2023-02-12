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
public class Tong_giai_thua {
    public static long giai_thua(int n){
        if(n == 1) return 1;
        return n*(giai_thua(n-1));
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += giai_thua(i);
        }
        System.out.println(sum);
    }
}
