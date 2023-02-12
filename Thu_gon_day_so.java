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
public class Thu_gon_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b =new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int j = 0;
        for(int i = 0; i < n - 1; i++){
            if((a[i] + a[i+1]) % 2 != 0){
                b[i] = a[i];
                j ++;
            }
        }
        System.out.println(j);
    }
     
}
