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
class PhanSo{
    private long tso, mso;
    public PhanSo(){
    }
    public PhanSo(long tso, long mso){
        this.tso = tso;
        this.mso = mso;
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public void toi_gian(){
        long uoc = PhanSo.gcd(this.tso, this.mso);
        this.tso /= uoc;
        this.mso /= uoc;
    }
    public PhanSo add(PhanSo b){
        PhanSo c;
        long tu = this.tso*b.mso + this.mso*b.tso;
        long mau = this.mso * b.mso;
        c = new PhanSo(tu, mau);
        c.toi_gian();
        return c;
    }
    public String toString(){
        return this.tso +"/" +this.mso;
    }
}
public class Tong_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1= sc.nextLong();
        long a2 = sc.nextLong();
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();
        PhanSo p1 = new PhanSo(a1, a2);
        PhanSo p2 = new PhanSo(b1, b2);
        PhanSo sum = p1.add(p2);
        System.out.println(sum);
    }
}
