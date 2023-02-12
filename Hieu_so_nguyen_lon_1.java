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
public class Hieu_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();
            if(s2.length() > s1.length()){
                for(int i = s2.length()-1; i >=0; i++){
                    int a = s2.charAt(i) - '0';
                    int b = s1.charAt(i) - '0';
                    if(a > b){
                        
                    }
                }
            }
            t--;
        }
    }
}
