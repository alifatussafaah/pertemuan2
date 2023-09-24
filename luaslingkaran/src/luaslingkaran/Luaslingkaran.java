/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luaslingkaran;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Luaslingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float luas, phi = (float) 3.14;
        int r;
        
        System.out.print("Masukkan Jari-Jari Lingkaran : ");
        r = input.nextInt();
        
        luas = r * r * phi;
        
        System.out.println("Luas Lingkaran = " + luas);
    }
    
}
