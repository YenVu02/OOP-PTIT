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
class TinhCong{
    private String MaNV, name, chucVu;
    private int LuongCB;
    private int ngayCong;
    public TinhCong(String name,int LuongCB, int ngayCong, String chucVu){
        this.MaNV = "NV01";
        this.name = name;
        this.LuongCB = LuongCB;
        this.ngayCong =ngayCong;
        this.chucVu = chucVu;
    }
    public long LuongThang(){
        return this.LuongCB*this.ngayCong;
    }
    public long Thuong(){
        if(this.ngayCong >= 25) return (int)(0.2 * this.LuongThang());
        if(this.ngayCong >= 22 && this.ngayCong<25) return (int)(0.1 * this.LuongThang());
        return 0;
    }
    public int PhuCap(){
        if(this.chucVu.equals("GD")) return 250000;
        if(this.chucVu.equals("PGD")) return 200000;
        if(this.chucVu.equals("TP")) return 180000;
        return 150000;
    }
    public long ThuNhap(){
        return this.LuongThang()+this.Thuong()+this.PhuCap();
    }
    public String toString(){
        return this.MaNV+" "+this.name+" "+this.LuongThang()+" "+this.Thuong()+" "+ this.PhuCap()+" "+this.ThuNhap();
    }
}
public class Bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        TinhCong tc = new TinhCong(sc.nextLine(), sc.nextInt(), sc.nextInt(),sc.next());
        System.out.println(tc);
    }
}
