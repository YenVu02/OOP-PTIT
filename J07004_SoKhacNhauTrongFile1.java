/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PTIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException{
        String file = "DATA.in";
        Scanner sc =new Scanner(new FileInputStream(file));
        int a[] = new int[1000];
        Arrays.fill(a, 0);
        try {
            while(sc.hasNext()){
                try {
                    a[Integer.parseInt(sc.next())]++;
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            sc.close();
        }
        for (int i = 0; i < 1000; i++){
            if(a[i] != 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
