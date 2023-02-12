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
import java.util.Arrays;
public class Bo_ba_so_pytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long [] arr = new long [n];
            for(int i = 0; i < n; i++){
                    arr[i] = sc.nextLong();
                    arr[i] = arr[i] * arr[i];//canh binh phuong
            }
            
            boolean check = false;
            Arrays.sort(arr);//sap xep mang theo thu tu tang dan
            
            kt:for(int i = 2; i<n; i++){
                int l = 0, r = i-1;
                while(l<r){
                    if(arr[l] + arr[r] == arr[i]){
                        check = true;
                        break kt;
                    }
                    else if(arr[l] + arr[r] > arr[i]) r--;
                    else l++;
               }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
