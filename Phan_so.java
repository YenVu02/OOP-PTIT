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
    public PhanSo(long tso, long mso){
        this.tso = tso;
        this.mso = mso;
    }
    public static long gcd(long a, long b){
        if(b==0)  return a;
        else return gcd(b, a%b);
    }
    public void toi_gian(){
        long uoc = PhanSo.gcd(this.tso, this.mso);
        this.tso /= uoc;
        this.mso /= uoc;
    }
    public String toString(){
        return this.tso + "/" + this.mso;
    }
}
public class Phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo ps = new PhanSo(a,b);
        ps.toi_gian();
        System.out.println(ps);
    }
}
