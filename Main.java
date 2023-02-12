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
public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("1. ");
            System.out.println("0. Thoat");
            System.out.print("Moi chon(0-9): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!!");
                    System.exit(0);
                    break;
                case 1:
                 
                    break;
                
               
                default:
                    System.out.print("Ban chi duoc chon 0-9");
                    break;
            }
                    
        }
    }
}

