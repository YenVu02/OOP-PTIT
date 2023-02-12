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

public class Ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [][] arr = new int [n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int d = 0, x = 0;
        for(int i = 0; i < n; i++){
            d = 0;
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 1){
                    d++;
                }
            }
            if(d > 1) x++;
        }
        System.out.println(x);
    }
}
