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
public class So_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.next();
            int c = 0;
            int l = 0;
            int kt = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    kt = 1;
                    if((s.charAt(i)-'0') % 2 == 0){
                        c++;  
                    }
                    else l++;
                }
                else{
                    kt = 0;
                    break;
                }
            }
            if(kt == 0) System.out.println("INVALID"); 
            else if(kt==1){
                if(c>l){
                    if(s.length()%2==0) System.out.println("YES");
                    else System.out.println("NO");
                }
                else if(l > c){
                    if(s.length()% 2 == 1) System.out.println("YES");
                    else System.out.println("NO");
                }
                else System.out.println("NO");
            }
            t--;
            
        }
    }
}
