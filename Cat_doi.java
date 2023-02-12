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
public class Cat_doi {
    public static String catdoi(String s){
        String a = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '0' || c == '8' || c == '9') a += '0';
            else if( c == '1' ) a += '1';
            else return "INVALID";
        }
        int i = 0;
        while(i < s.length() && a.charAt(i) == '0'){
            i++;
        }
        if(i == s.length()) return "INVALID";
        return a.substring(i);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
           System.out.println(catdoi(s));
           t--;
        }
    }
}
