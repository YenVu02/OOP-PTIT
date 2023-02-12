/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PTIT;

/**
 *
 * @author admin
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        String file = "DATA.in";
        Scanner sc = new Scanner(new FileInputStream(file));
        long sum = 0;
        try {
            while(sc.hasNext()){
                try {
                    sum += Integer.parseInt(sc.next());
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            sc.close();
        }
        System.out.println(sum);
    }
}
