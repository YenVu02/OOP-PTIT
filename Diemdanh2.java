/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Diemdanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = sc.nextLine();
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (int i = 0; i < n; i++) {
            String masv = sc.next();
            String diemDanh = sc.next();
            for (SinhVien sv : arrayList) {
                if (sv.getMaSV().compareTo(masv) == 0) {
                    sv.setDiemCC(diemDanh);
                    sv.setGhiChu();
                }
            }
        }
        b = sc.nextLine();
        String maLop = sc.nextLine();
        for (SinhVien sv : arrayList){
            if(sv.getLop().compareTo(maLop) == 0){
                System.out.println(sv.toString());
            }
        }
    }
}

class SinhVien {
    private String maSV;
    private String tenSV;
    private String lop;
    private int diemCC;
    private String ghiChu;

    public SinhVien(String maSV, String tenSV, String lop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getDiemCC() {
        return diemCC;
    }

    public void setDiemCC(String diemDanh) {
        int diem = 10;
        for (int i = 0; i < diemDanh.length(); i++) {
            if (diemDanh.charAt(i) == 'v') diem -= 2;
            if (diemDanh.charAt(i) == 'm') diem -= 1;
        }
        this.diemCC = diem > 0 ? diem : 0;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu() {
        if (this.diemCC == 0) this.ghiChu = "KDDK";
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop + " " + diemCC + (diemCC == 0 ? " " + this.getGhiChu() : "");
    }
}
