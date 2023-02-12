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
class Rectange{
    private double width, height;
    private String color;
    public Rectange(){
        this.height=this.width=1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height =height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return this.height*this.width;
    }
    public double findPerimeter(){
        return 2*(this.height+this.width);
    }
    public String toString(){
        return String.format("%.0f", this.findPerimeter())+" " +String.format("%.0f", this.findArea())+ " " +this.color;
    }
}
public class Khai_bao_lop_hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        String s = sc.next();
        if(d <= 0 || r <= 0) System.out.println("INVALID");
        else{
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(s.charAt(0)));
            for(int j = 1; j < s.length(); j++){
                sb.append(Character.toLowerCase(s.charAt(j)));
            }
            Rectange rec = new Rectange(d, r, sb.toString());
            System.out.println(rec);
        }
    }
}
