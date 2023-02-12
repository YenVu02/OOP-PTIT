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
public class J03021_DienThoaiCucGach {
    public static int check(char s){
        if(s == 'a' || s == 'b' || s == 'c') return 2;
        if(s == 'd' || s == 'e' || s == 'f') return 3;
        if(s == 'g' || s == 'h' || s == 'i') return 4;
        if(s == 'j' || s == 'k' || s == 'l') return 5;
        if(s == 'm' || s == 'n' || s == 'o') return 6;
        if(s == 'p' || s == 'q' || s == 'r' ||s == 's' ) return 7;
        if(s == 't' || s == 'u' || s == 'v') return 8;
        if(s == 'w' || s == 'x' || s == 'y'||s == 'z') return 9;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String n = "";
            for(int i = 0; i < s.length(); i++){
                if(check(s.charAt(i)) != -1){
                    n += check(s.charAt(i));
                }
            }
            StringBuffer sb = new StringBuffer(n);
            String s1 = sb.reverse().toString();
            if(n.compareToIgnoreCase(s1) == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
