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
public class Sap_xep_chen {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i < n; i++){
            int j = i-1, key = a[i];
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            System.out.print("Buoc " + i + ": ");
            for(int k = 0; k <= i; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
