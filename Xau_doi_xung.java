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
public class Xau_doi_xung {
    private static boolean check(String s){
        int kt = 1;
            for(int i = 0; i <  s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    kt--;
                    if(kt < 0) return false;
                }
            }
            
            if(kt==1&& s.length()%2==0) return false;
            return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
