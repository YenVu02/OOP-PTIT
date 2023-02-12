/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PTIT;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String x = sc.next();
            String y = sc.next();
            long m = Math.max(x.length(), y.length());
            BigInteger a = new BigInteger(x,10);
            BigInteger b = new BigInteger(y, 10);
            BigInteger c = a.subtract(b).abs();
            String s = c.toString();
            long size = s.length();
            while(size < m){
                size += 1;
                System.out.print("0");
            }
            System.out.println(c.abs());
        }
    }
}
