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
class DonHang{
    private String NameDH, MaDH, SoTT;
    private int DonGia, SoLuong, Loai, GiamGia, ThanhTien;

    public DonHang() {
    }

    public DonHang(String NameDH, String MaDH, int DonGia, int SoLuong) {
        this.NameDH = NameDH;
        this.MaDH = MaDH;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }

    public String getNameDH() {
        return NameDH;
    }

    public void setNameDH(String NameDH) {
        this.NameDH = NameDH;
    }

    public String getMaDH() {
        return MaDH;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }

    public String getSoTT() {
        return SoTT;
    }

    public void setSoTT(String SoTT) {
       this.SoTT = MaDH.substring(1, 4);
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getLoai() {
        return Loai;
    }

    public void setLoai(String MaDH) {
        this.Loai = Integer.valueOf(MaDH.substring(4));
    }

    public int getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia() {
        if(this.Loai == 1) this.GiamGia = (int) (0.5 * this.DonGia * this.SoLuong);
	else this.GiamGia = (int) (0.3 * this.DonGia * this.SoLuong);
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien() {
        this.ThanhTien = this.SoLuong * this.DonGia - this.GiamGia;
    }
    public String toString(){
        return this.NameDH + " " + this.MaDH+" "+this.SoTT+" "+this.GiamGia+" "+this.ThanhTien;
    }
}
public class SapXepDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        DonHang[] DH = new DonHang[t];
        for(int i =0 ; i < t; i++){
            String tmp = sc.nextLine();
            DH[i] = new DonHang();
            DH[i].setNameDH(sc.nextLine());
            DH[i].setMaDH(sc.nextLine());
            DH[i].setDonGia(sc.nextInt());
            DH[i].setSoLuong(sc.nextInt());
            DH[i].setLoai(DH[i].getMaDH());
            DH[i].setSoTT(DH[i].getMaDH());
            DH[i].setGiamGia();
            DH[i].setThanhTien();
        }
        for(int i = 0; i < t-1;i++){
            for(int j = i+1; j < t; j++){
                if(DH[i].getSoTT().compareTo(DH[j].getSoTT()) > 0){
                    DonHang tmp = DH[i];
                    DH[i] = DH[j];
                    DH[j] = tmp;
                }
            }
        } 
        for(int i = 0; i < t; i++){
            System.out.println(DH[i].toString());
        }
    }
}
