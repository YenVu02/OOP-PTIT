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

public class Chia_tam_giac {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1; i <= n-1; i++){
                double H = h *Math.sqrt((double)i/n);
                System.out.printf("%.6f ", H);
            }
            System.out.println();
            test--;
        }
    }    
}
