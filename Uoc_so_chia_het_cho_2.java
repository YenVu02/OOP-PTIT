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
public class Uoc_so_chia_het_cho_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int dem = 0;
            int a = (int) Math.sqrt(n);
            for(int i = 1; i <= a; i++){
                if(n%i==0){
                    if(i%2==0) dem++;
                    if((n/i)%2==0) dem++;
                }
            }
            if(dem!=0 && a*a==n) dem-=1;
            System.out.println(dem);
            t--;
        }
    }
}
