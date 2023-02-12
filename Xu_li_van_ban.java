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
public class Xu_li_van_ban {
    public static void xu_li_van_ban (String s){
        s = s.trim();
        String [] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            int len = arr[i].length();
            if(i==0){
                sb.append(Character.toUpperCase(arr[0].charAt(0)));
                for(int j = 1; j < len; j++){
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }
            }
            else{
                for(int j = 0; j < len; j++){
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }
                if(arr[i].charAt(len-1) == '.' ||arr[i].charAt(len-1) == '?' ||arr[i].charAt(len-1) == '!'){
                    System.out.println();
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        if(sb.charAt(sb.length()-1) != '.' && sb.charAt(sb.length()-1) != '!' && sb.charAt(sb.length()-1) != '?'){
            sb.append(".");
            //them dau cham cuoi cau
        }
         sb.deleteCharAt(sb.length()-1);
         System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            xu_li_van_ban(s);
        }
    }
}
