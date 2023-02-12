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
public class Dao_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String [] arr = s.split("\\s+");
            for(String i:arr){
                for(int j = i.length()-1; j>=0;j--){
                    System.out.print(i.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
