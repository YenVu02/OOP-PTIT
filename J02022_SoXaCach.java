/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PTIT;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J02022_SoXaCach {
    public static int n;
    public static int []a = new int[105];
    public static int []b = new int[105];
    public static void print(){
        boolean kt = true;
        for(int j = 1; j <= n-1; j++){
            if(Math.abs(a[j]-a[j+1]) == 1){
                kt = false;
                break;
            }
        }
        if(kt){
            for(int i = 1; i <= n; i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
    public static void BackTrack(int i){
        for(int j = 1; j <= n; j++){
            if(b[j] == 1){
                a[i] = j;
                b[j] = 0;
                if(i==n) print();
                else BackTrack(i+1);
                b[j] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            for(int i = 1; i <= n; i++) b[i] = 1;
            BackTrack(1);
        }
    }
}
