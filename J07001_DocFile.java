/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package OOP_PTIT;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07001_DocFile {

    public static void main(String[] args) throws Exception{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
