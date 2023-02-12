/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class DN  implements Comparable<DN>{
    private String ma;
    private String ten;
    private int soSV;

    public DN() {
    }

    public DN(String ma, String ten, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
    public String toString() {
        return ma+" "+ten+" "+soSV;
    }

    @Override
    public int compareTo(DN o) {
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return -1;
    }
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DN> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < t; i++){
            l.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        l.forEach(System.out::println);
    }
}
