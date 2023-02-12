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

public class BangDiemTuyenSinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ThiSinh1[] TS = new ThiSinh1[n];
		for(int i = 0; i < n; i++) {
			String tmp = sc.nextLine();
			TS[i] = new ThiSinh1();
			TS[i].setMaTS(sc.nextLine());
			TS[i].setHoTen(sc.nextLine());
			TS[i].setDiemToan(sc.nextDouble());
			TS[i].setDiemLi(sc.nextDouble());
			TS[i].setDiemHoa(sc.nextDouble());
			TS[i].setDiemCong(TS[i].getMaTS());
			TS[i].setTongDiem();
			TS[i].setTrangThai();
		}
		for(int i = 0; i < n; i++) {
			System.out.println(TS[i].toString());
		}
	}
}

class ThiSinh1 {
	private String maTS;
	private String hoTen;
	private double diemToan;
	private double diemLi;
	private double diemHoa;
	private double tongDiem;
	private double diemCong;
	private String trangThai;

	public ThiSinh1(String maTS, String hoTen, double diemToan, double diemLi, double diemHoa) {
		this.maTS = maTS;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLi = diemLi;
		this.diemHoa = diemHoa;
	}

	public ThiSinh1() {
	}

	public String getMaTS() {
		return maTS;
	}

	public void setMaTS(String maTS) {
		this.maTS = maTS;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		hoTen = hoTen.trim();
		hoTen = hoTen.toLowerCase(); // viet thuong
		String[] a = hoTen.split(" ");
		hoTen = "";
		for (int i = 0; i < a.length; i++) {
			String tmp = a[i].substring(0, 1);
			hoTen = hoTen + tmp.toUpperCase() + a[i].substring(1) + " ";
		}
		hoTen = hoTen.trim();
		this.hoTen = hoTen;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLi() {
		return diemLi;
	}

	public void setDiemLi(double diemLi) {
		this.diemLi = diemLi;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public double getTongDiem() {
		return tongDiem;
	}

	public void setTongDiem() {
		this.tongDiem = this.diemToan * 2 + this.diemLi + this.diemHoa;
	}

	public double getDiemCong() {
		return diemCong;
	}

	public void setDiemCong(String maTS) {
		if(maTS.substring(0, 3).equals("KV1")) this.diemCong = 0.5;
		else if(maTS.substring(0, 3).equals("KV2")) this.diemCong = 1.0;
		else this.diemCong = 2.5;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai() {
		if(this.tongDiem + this.diemCong >= 24) this.trangThai = "TRUNG TUYEN";
		else this.trangThai = "TRUOT";
	}

	public String toString() {
		String diemCong = this.diemCong + "";
		if(this.diemCong == (int) this.diemCong) {
			diemCong = String.format("%.0f", this.diemCong);
		}
		String tongDiem = this.tongDiem + "";
		if(this.tongDiem == (int) this.tongDiem) {
			tongDiem = String.format("%.0f", this.tongDiem);
		} else tongDiem = String.format("%.1f", this.tongDiem);
		return this.maTS + " " + this.hoTen + " " + diemCong + " " + tongDiem + " " + this.trangThai;
	}
}
