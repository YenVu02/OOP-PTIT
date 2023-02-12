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
import java.util.Set;
import java.util.HashSet;
public class Danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set <Character> set = new HashSet<>();
        for(int i = 0; i< s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
