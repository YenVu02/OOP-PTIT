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
public class Day_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String [] arr = s.split("\\s+");
            int chan = 0, le = 0;
            for(String i:arr){
                int a = Integer.parseInt(i);
                if(a %2==0) chan++;
                else le++;
            }
            if((arr.length%2==0 && chan>le)|| arr.length%2!=0 && le>chan){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
