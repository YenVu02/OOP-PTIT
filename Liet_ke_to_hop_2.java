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
public class Liet_ke_to_hop_2 {
    private static int n, k, cnt = 0;
    private static int [] c = new int [20];
    public static void Try(int i){
        for(int j = c[i-1]+1; j <= n-k+i; j++){
            c[i] = j;
            if(i==k){
                for(int m = 1; m <= k; m++){
                    System.out.print(c[m]);
                }
                cnt++;
                System.out.print(" ");
            }
            else Try(i+1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        k =sc.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
