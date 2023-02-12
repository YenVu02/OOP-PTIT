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
public class Chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            s = s.trim();
            String [] a = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : a){
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int i = 1; i < x.length(); i++){
                    sb.append(Character.toLowerCase(x.charAt(i)));
                }
                sb.append(" ");
            }
            System.out.println(sb);
            t--;
        }
    }
          
}
