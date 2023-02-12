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
public class So_dep_2 {
    private static boolean so_thuan_nghich(String s){
        boolean kt = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()- i - 1)){
                kt = false;
            }
            else kt = true;
        }
        if(kt) return true;
        else return false;
    }
    private static boolean chia_het_cho_10(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) -'0');
        }
        if(sum % 10 == 0) return true;
        else return false;
    }
    private static boolean bat_dau_ket_thuc_bang_8(String s){
        if(s.charAt(0) == '8' && s.charAt(s.length() -1 ) == '8'){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(so_thuan_nghich(s) && bat_dau_ket_thuc_bang_8(s) && chia_het_cho_10(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t--;
        }
    }
}
