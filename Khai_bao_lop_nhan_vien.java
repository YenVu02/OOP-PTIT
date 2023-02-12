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
class NhanVien{
    private String MaNV, name, gioiTinh, date, diaChi, MaThue, ngayKiHD;
    public NhanVien(){
        this.MaNV = this.name = this.gioiTinh = this.date = this.diaChi = this.MaThue = this.ngayKiHD = "";
    }
    public NhanVien(String name,String gioiTinh,String date,String diaChi,String MaThue,String ngayKiHD){
        this.MaNV = "00001";
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.diaChi = diaChi;
        this.MaThue = MaThue;
        this.ngayKiHD = ngayKiHD;
    }
    public String toString(){
        return this.MaNV+" "+this.name+" "+this.gioiTinh+" "+this.date+" "+this.diaChi+" "+this.MaThue+" "+this.ngayKiHD;
    }
}
public class Khai_bao_lop_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
}
