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
class ThiSinh{
    private String name, date;
    private float diem1, diem2, diem3, tongDiem;
    public ThiSinh(){
        this.name=this.date="";
        this.diem1=this.diem2=this.diem3=this.tongDiem=0;
    }
    public ThiSinh(String name, String date, float diem1, float diem2, float diem3){
        this.name = name;
        this.date = date;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = this.diem1+this.diem2+this.diem3;
    }
    public String toString(){
        return this.name+" "+this.date+" "+String.format("%.1f", this.tongDiem);
    }
}
public class Khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.next(), sc.nextFloat(),sc.nextFloat(),sc.nextFloat() );
        System.out.println(ts);
    }
}
