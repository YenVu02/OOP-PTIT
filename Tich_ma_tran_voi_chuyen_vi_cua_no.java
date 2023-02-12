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
public class Tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1; k <= t; k++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] arr = new int [n][m];
            int [][] b = new int [100][100];
            int [][] c = new int [100][100];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    b[j][i] = arr[i][j];
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int l = 0; l < m; l++){
                        c[i][j] += (arr[i][l] * b[l][j]);
                    }
                }
            }
            System.out.println("Test " + k + ":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
