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
public class Mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int [] a= new int [n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean kt = true;
            for(int i = 0; i <= n/2; i++){
                if(a[i] != a[n-i-1]){
                    kt =false;
                    break;
                }
                else{
                    kt = true;
                }
            }
            if(kt) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
