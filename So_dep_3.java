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
public class So_dep_3 {
    private static boolean So_thuan_nghich(String s){
        boolean kt = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() -i - 1)){
                kt = false;
            }
        }
        if(kt) return true;
        return false;
    }
    private static boolean nguyen_to(String s){
        int kt = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '2' || s.charAt(i) == '3' ||s.charAt(i) == '5' ||s.charAt(i) == '7' )
                kt = 0;
            else kt = 1;
        }
        if(kt == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(So_thuan_nghich(s) && nguyen_to(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t--;
        }
    }
}
