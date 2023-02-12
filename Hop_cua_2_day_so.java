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
public class Hop_cua_2_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int [] x = new int[1000], y = new int [1000];
        for(int i = 0; i < a; i++){
            x[sc.nextInt()]  = 1;
        }
        for(int i = 0; i < b; i++){
            y[sc.nextInt()] = 1;
        }
        for(int i = 0; i < 1000; i++){
            if(x[i] !=0 || y[i] !=0){
                System.out.print(i + " ");
            }
        }
    }
}
