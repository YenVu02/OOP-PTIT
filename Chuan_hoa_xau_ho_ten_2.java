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
public class Chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextByte();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            s = s.trim();
            String [] s1 = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < s1.length; i++){
                sb.append(Character.toUpperCase(s1[i].charAt(0)));
                for(int j = 1; j < s1[i].length(); j++){
                    sb.append(Character.toLowerCase(s1[i].charAt(j)));             
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() -1);
            sb.append(", ");
            sb.append(s1[0].toUpperCase());
            System.out.println(sb);
            t--;
        }
    }
}
