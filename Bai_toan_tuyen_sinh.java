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
class TuyenSinh{
    private String MaTS, name;
    private double toan, li, hoa;
    public TuyenSinh(String MaTS, String name, double toan, double li, double hoa){
        this.MaTS = MaTS;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }
    public String uuTien(){
        if(this.MaTS.charAt(2) == '1') return "0.5";
        if(this.MaTS.charAt(2) == '2') return "1";
        return "2.5";
    }
    public double TongDiem(){
        double h = 2*this.toan + this.li+this.hoa, k;
        k = h-(int)h;
        return k;
    }
    public double TongDiem1(){
        double h = 2*this.toan + this.li+this.hoa;
        return h;
    }
    public String TrangThai(){
        if(this.TongDiem1() + Double.parseDouble(this.uuTien()) >=24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public String toString(){
       if(this.TongDiem()==0){
            int diem = 2 * (int)this.toan + (int)this.li+(int)this.hoa;
            return this.MaTS+" " + this.name+" "+ this.uuTien()+" "+ diem +" "+this.TrangThai();
       }
       else{
             double h = 2*this.toan + this.li+this.hoa;
            return this.MaTS+" " + this.name+" "+ this.uuTien()+" "+String.format("%.1f", h)+" "+this.TrangThai();
       }
    }
}
public class Bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(ts);
    }
}
