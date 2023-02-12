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
public class UCLN_BCNN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = a, y = b, ucln, bcnn;
            if(a == 0 || b == 0) ucln = a+b;
            else{
                while(a!=b){
                    if(a>b) a-=b;
                    else b-=a;
                }
                ucln =a;
            }
            bcnn = x*y/ucln;
            System.out.println(bcnn + " " + ucln);
            t--;
        }
    }
}
