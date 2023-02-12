/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class SV implements Comparable<SV>{
    private String ma;
    private String name;
    private String lop;
    private String email;

    public SV() {
    }

    public SV(String ma, String name, String lop, String email) {
        this.ma = ma;
        String[] name1 = name.trim().split("\\s+");
        String res = "";
        for(int i =0; i<name1.length; i++){
            name1[i] = name1[i].substring(0,1).toUpperCase()+name1[i].substring(1).toLowerCase();
            res += name1[i] + " ";
        }
        this.name = res;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return ma + " " + this.name + " " + lop + " " + email;
    }
    @Override
    public int compareTo(SV o) {
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return -1;
    }
    
}
public class J07033_DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV> l = new ArrayList<>();
        for(int i = 0; i < t; i++){
            l.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l);
        l.forEach(System.out::println);
    }
}
