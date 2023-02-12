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
public class Tinh_Tong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            long n = sc.nextInt();
            long sum = n *(n+1)/2;
            System.out.println(sum);
            test--;
        }
    }
}
