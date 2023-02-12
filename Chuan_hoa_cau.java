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
public class Chuan_hoa_cau {
    public static String chuan_hoa_cau(String s){
        s = s.trim();
        String [] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i==0){
                sb.append(Character.toUpperCase(arr[0].charAt(0)));
                for(int j = 1; j < arr[i].length(); j++){
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }
            }
            else{
                for(int j = 0; j < arr[i].length(); j++){
                    sb.append(Character.toLowerCase(arr[i].charAt(j)));
                }
                if(arr[i].charAt(arr[i].length()-1) == '.'|| arr[i].charAt(arr[i].length()-1) == '!'|| arr[i].charAt(arr[i].length()-1) =='?'){
                    if(arr[i].length()==1){
                        sb.deleteCharAt(sb.length()-2);
                    }
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        if(sb.charAt(sb.length()-1) != '.' && sb.charAt(sb.length()-1) != '!' && sb.charAt(sb.length()-1) != '?'){
            sb.append(".");
        }
       return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(chuan_hoa_cau(s));
        }
    }
}
