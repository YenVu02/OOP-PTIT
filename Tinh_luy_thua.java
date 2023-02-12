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
public class Tinh_luy_thua {
    public static int MOD = 1000000007;
    private static long luy_thua(long a, long b){
        int kt =1;
        if(b == 0) return kt;
        else{
            long x = luy_thua(a, b/2);
            if(b%2==0) return (x*x)%MOD;
            else return a*((x*x) %MOD)%MOD;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            long b = sc.nextLong();
            if(a==0 && b == 0) break;
            else{
                System.out.println(luy_thua(a, b));
            }
        }
    }
}
