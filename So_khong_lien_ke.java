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
public class So_khong_lien_ke {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            int kt = 1;
            for(int i = 0; i < s.length()-1; i++){
                if(Math.abs((s.charAt(i+1) -'0') -(s.charAt(i)-'0') )!= 2){
                    kt = 0;
                    break;
                }
                else{
                    kt = 1;
                }
            }
            if(kt == 0) System.out.println("NO");
            else if(kt == 1){
                int sum = 0;
                for(int i = 0; i < s.length(); i++){
                    sum += (s.charAt(i) -'0');
                }
                if(sum % 10 == 0) System.out.println("YES");
                else System.out.println("NO");
            }
            t--;
        }
    }
}
