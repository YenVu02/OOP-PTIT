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

public class TinhLuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPhong = sc.nextInt();
		String tmp = sc.nextLine();
		PhongBan[] PB = new PhongBan[soPhong];
		for(int i = 0; i < soPhong; i++) {
			PB[i] = new PhongBan();
			PB[i].setMaPB(sc.next());
			PB[i].setTenPB(sc.nextLine());
		}
		int soNV = sc.nextInt();
		NhanVien1[] NV = new NhanVien1[soNV];
		for(int i = 0; i < soNV; i++) {
			tmp = sc.nextLine();
			NV[i] = new NhanVien1();
			NV[i].setMaNV(sc.nextLine());
			NV[i].setTen(sc.nextLine());
			NV[i].setLuongCB(sc.nextInt());
			NV[i].setSoNgayCong(sc.nextInt());
			NV[i].setLoaiNV(NV[i].getMaNV());
			NV[i].setSoNamCT(NV[i].getMaNV());
			NV[i].setMaPB(NV[i].getMaNV());
			for(int j = 0; j < soPhong; j++) {
				if(NV[i].getMaPB().equals(PB[j].getMaPB())) {
					NV[i].setTenPB(PB[j].getTenPB());
				}
			}
			NV[i].setHeSo();
			NV[i].setTongLuong();
		}
		for(int i = 0; i < soNV; i++) {
			System.out.println(NV[i].toString());
		}
	}
}

class PhongBan {
	private String maPB;
	private String tenPB;

	public PhongBan(String maPB, String tenPB) {
		this.maPB = maPB;
		this.tenPB = tenPB;
	}

	public PhongBan() {
	}

	public String getMaPB() {
		return maPB;
	}

	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}

	public String getTenPB() {
		return tenPB;
	}

	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}
}

class NhanVien1 {
	private String maNV;
	private String ten;
	private int luongCB;
	private int soNgayCong;
	private String maPB;
	private String tenPB;
	private int soNamCT;
	private String loaiNV;
	private int heSo;
	private int tongLuong;

	public NhanVien1(String maNV, String ten, int luongCB, int soNgayCong) {
		this.maNV = maNV;
		this.ten = ten;
		this.luongCB = luongCB;
		this.soNgayCong = soNgayCong;
	}

	public NhanVien1() {
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(int luongCB) {
		this.luongCB = luongCB;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public String getMaPB() {
		return maPB;
	}

	public void setMaPB(String maNV) {
		this.maPB = maNV.substring(3);
	}

	public String getTenPB() {
		return tenPB;
	}

	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}

	public int getSoNamCT() {
		return soNamCT;
	}

	public void setSoNamCT(String maNV) {
		String tmp = maNV.substring(1, 3);
		this.soNamCT = Integer.valueOf(tmp);
	}

	public String getLoaiNV() {
		return loaiNV;
	}

	public void setLoaiNV(String maNV) {
		this.loaiNV = maNV.substring(0, 1);
	}
	
	public int getHeSo() {
		return heSo;
	}

	public void setHeSo() {
		String loaiNV = this.getLoaiNV();
		int soNamCT = this.getSoNamCT();
		if(loaiNV.equals("A")) {
			if(soNamCT >= 1 && soNamCT <= 3) this.heSo = 10;
			else if(soNamCT >= 4 && soNamCT <= 8) this.heSo = 12;
			else if(soNamCT >= 9 && soNamCT <= 15) this.heSo = 14;
			else this.heSo = 20;
		} else if(loaiNV.equals("B")) {
			if(soNamCT >= 1 && soNamCT <= 3) this.heSo = 10;
			else if(soNamCT >= 4 && soNamCT <= 8) this.heSo = 11;
			else if(soNamCT >= 9 && soNamCT <= 15) this.heSo = 13;
			else this.heSo = 16;
		} else if(loaiNV.equals("C")) {
			if(soNamCT >= 1 && soNamCT <= 3) this.heSo = 9;
			else if(soNamCT >= 4 && soNamCT <= 8) this.heSo = 10;
			else if(soNamCT >= 9 && soNamCT <= 15) this.heSo = 12;
			else this.heSo = 14;
		} else {
			if(soNamCT >= 1 && soNamCT <= 3) this.heSo = 8;
			else if(soNamCT >= 4 && soNamCT <= 8) this.heSo = 9;
			else if(soNamCT >= 9 && soNamCT <= 15) this.heSo = 11;
			else this.heSo = 13;
		}
	}
	public void setTongLuong() {
		this.tongLuong = this.luongCB * this.soNgayCong * this.heSo * 1000;
	}
	public String toString() {
		return this.maNV + " " + this.ten + this.tenPB + " " + this.tongLuong;
	}
}

