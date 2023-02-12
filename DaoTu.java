/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            s.trim();
            String[] sb = s.split("\\s+");
            for (int i = 0; i < sb.length; i++) {
                for (int j = sb[i].length() - 1; j >= 0; j--) {
               System.out.print(sb[i].charAt(j));
                }
               System.out.print(" ");
            }
            System.out.println();
        }
        
    }

    private static boolean charAt(int j) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
