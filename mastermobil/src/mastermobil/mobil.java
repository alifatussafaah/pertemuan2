/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermobil;

/**
 *
 * @author DELL
 */
public class mobil {
    static masterMobil dataMobil = new masterMobil();
    
    public static void main(String[] args) {
        System.out.println("Mobil \t \t : " + dataMobil.merk);
        System.out.println("Berwarna \t : " + dataMobil.warna);
        System.out.println("Tahun \t \t : " + dataMobil.tahun);
        
        dataMobil.Stop();
    }
}
