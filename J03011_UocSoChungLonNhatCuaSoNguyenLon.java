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
public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigInteger x = new BigInteger(a, 10);
            BigInteger y= new BigInteger(b, 10);
            BigInteger z = x.gcd(y);
            System.out.println(z);
        }
    }
}
