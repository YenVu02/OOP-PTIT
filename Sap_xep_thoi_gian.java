/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Sap_xep_thoi_gian {
    private int gio, phut, giay;

    public Sap_xep_thoi_gian() {
    }

    public Sap_xep_thoi_gian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }
    public static int TongTG(Sap_xep_thoi_gian t){
        return t.giay + t.phut * 60 + t.gio * 3600;    
    } 
    public static void SapXep(Sap_xep_thoi_gian[] t){
        for(int i = 0; i < t.length-1; i++){
            for(int j = i+1;j < t.length; j++){
                if(TongTG(t[i]) > TongTG(t[j])){
                    Sap_xep_thoi_gian tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
        for(int i = 0; i < t.length; i++){
            System.out.println(t[i].gio + " " + t[i].phut + " " + t[i].giay);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Sap_xep_thoi_gian time[] = new Sap_xep_thoi_gian[t];
        Sap_xep_thoi_gian tmp = new Sap_xep_thoi_gian();
        for(int i = 0; i < t; i++) {
                    time[i] = new Sap_xep_thoi_gian();
                    time[i].setGio(sc.nextInt());
                    time[i].setPhut(sc.nextInt());
                    time[i].setGiay(sc.nextInt());
            }
            SapXep(time);
    }
}
