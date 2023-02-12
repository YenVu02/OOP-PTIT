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
class SinhVien{
    private String MaSV, name, lop, date;
    private float GPA;
    public SinhVien(){
        this.MaSV = this.name=this.lop=this.date;
        this.GPA=0;
    }
    public SinhVien(String name, String lop, String date, float GPA){
        this.MaSV = "B20DCCN001";
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.GPA = GPA;
    }
    public void chuan_hoa(){
        StringBuilder sb = new StringBuilder(this.date);
        if(sb.charAt(2)!='/') sb.insert(0, 0);
        if(sb.charAt(5)!='/') sb.insert(3, 0);
        this.date= sb.toString();
    }
    public String toString(){
        return this.MaSV+" "+this.name+" "+this.lop+" "+this.date+" "+String.format("%.2f", this.GPA);
    }
}
public class Khai_bao_lop_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien s = new SinhVien(sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
        s.chuan_hoa();
        System.out.println(s);
    }
}
