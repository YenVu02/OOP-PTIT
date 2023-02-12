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
class ThuNhap{
    private String MaNgach, name;
    private long LuongCB;
    public ThuNhap(String MaNgach, String name, long LuongCB){
        this.MaNgach = MaNgach;
        this.name = name;
        this.LuongCB = LuongCB;
    }
    public int BacLuong(){
        return Integer.parseInt(this.MaNgach.substring(2));
    }
    public int PhuCap(){
        String s = this.MaNgach.substring(0, 2);
        if(s.equals("HT")) return 2000000;
        if(s.equals("HP")) return 900000;
        return 500000;
    }
    public long Thu_nhap(){
        return this.LuongCB*this.BacLuong()+this.PhuCap();
    }
    public String toString(){
        return this.MaNgach+" " + this.name + " " + this.BacLuong() +" "+ this.PhuCap() + " " + this.Thu_nhap();
    }
}
public class Tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuNhap tn = new ThuNhap(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(tn);
    }
}
