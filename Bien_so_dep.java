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
public class Bien_so_dep {
    public static boolean so_loc_phat(StringBuilder s){
        boolean kt = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                kt = false;
                break;
            }
            else kt = true;
        }
        if(kt) return true;
        else return false;
    }
    public static boolean bang_nhau(StringBuilder sb){
        boolean kt = true;
        for(int i = 0; i < sb.length()-1; i++){
            if(sb.charAt(i) != sb.charAt(i+1)){
                kt = false;
                break;
            }
            else kt = true;
        }
        if(kt) return true;
        else return false;
    }
    public static boolean tang_chat(StringBuilder sb){
        boolean kt = true;
        for(int i = 0; i < sb.length()-1; i++){
            if(sb.charAt(i) >= sb.charAt(i+1)){
                kt = false;
                break;
            }
            else kt = true;
        }
        if(kt) return true;
        else return false;
    }
    public static boolean dau_cuoi(StringBuilder sb){
       if(sb.charAt(0) == sb.charAt(1) && sb.charAt(1) == sb.charAt(2) && sb.charAt(3) == sb.charAt(4))return true;
       else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            s = s.substring(5);
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.deleteCharAt(3);
            if(so_loc_phat(sb) ||  bang_nhau(sb)||tang_chat(sb)|| dau_cuoi(sb)){
                System.out.println("YES");
            }
            else System.out.println("NO");
            //System.out.println(sb);
        }
    }
}
