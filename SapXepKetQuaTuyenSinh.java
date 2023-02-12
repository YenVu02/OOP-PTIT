/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
final class Student{
    private String MaTS, name;
    private Double Toan, Li, Hoa;
    private String KetQua;

    public Student() {
    }

    public Student(String MaTS, String name, Double Toan, Double Li, Double Hoa) {
        this.MaTS = MaTS;
        setName(name);
        this.Toan = Toan;
        this.Li = Li;
        this.Hoa = Hoa;
        setKetQua();
    }

    public String getMaTS() {
        return MaTS;
    }

    public void setMaTS(String MaTS) {
        this.MaTS = MaTS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] list = name.trim().split("\\s+");
        for(int i = 0; i < list.length; i++){
            list[i] = list[i].substring(0,1).toUpperCase()+list[i].substring(1).toLowerCase();
        }
        this.name = String.join(" ", list);
    }

    public Double getToan() {
        return Toan;
    }

    public void setToan(Double Toan) {
        this.Toan = Toan;
    }

    public Double getLi() {
        return Li;
    }

    public void setLi(Double Li) {
        this.Li = Li;
    }

    public Double getHoa() {
        return Hoa;
    }

    public void setHoa(Double Hoa) {
        this.Hoa = Hoa;
    }

    public String getKetQua() {
        return KetQua;
    }

    public void setKetQua() {
        if(Double.parseDouble(getScore())>=24) KetQua = "TRUNG TUYEN";
        else KetQua ="TRUOT";
    }
    public String getUuTien(){
        switch (MaTS.substring(2, 3)) {
            case "1":
                return "0.5";
            case "2":
                return "1";
            default:
                return "2.5";
        }
    }
    public String getScore(){
        String getUuTien;
        double score = Toan*2+Li+Hoa+Double.parseDouble(getUuTien());
        if(score == (int) score){
            return Integer.toString((int) score);
        }
        return String.format("%.1f", score);
    }
    public String toString(){
        return MaTS+" "+name+" "+ getUuTien()+" "+getScore()+" "+KetQua;
    }
}
public class SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        ArrayList<Student> student = new ArrayList<>();
        for(int  i =1; i <= t; i++){
            student.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        student.sort((Student a, Student b) ->{
            if(Double.parseDouble(a.getScore()) < Double.parseDouble(b.getScore()))
                return 1;
            if(Double.parseDouble(a.getScore()) > Double.parseDouble(b.getScore()))
                return -1;
            return a.getMaTS().compareTo(b.getMaTS());
        });
        student.forEach(System.out::println);
    }
}
