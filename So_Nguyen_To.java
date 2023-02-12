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

public class So_Nguyen_To {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            long n =sc.nextLong();
            int kt =1;
            if(n < 2) System.out.println("NO");
            else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0){
                        System.out.println("NO");
                        kt = 0;
                        break;
                    }
                    else{
                        kt = 1;
                    }
                }
                if(kt == 1) System.out.println("YES");
            }
            test--;
        }
    }    
}
