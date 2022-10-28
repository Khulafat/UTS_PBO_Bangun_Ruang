package Bangun_Ruang;

import java.util.Scanner;

/**
 *
 * @author Afad
 */
public class LimasSegitiga extends Bangun_Ruang{
    
    public double volumeLimasSegitiga(){
        Segitiga segitiga = new Segitiga();
        Scanner scLimasSegitiga = new Scanner(System.in);
        System.out.println("Menghitung Volume Limas Segitiga\n");
        System.out.print("Masukkan Tinggi : ");
        segitiga.tinggi = scLimasSegitiga.nextDouble();
        System.out.print("Masukkan Alas untuk menghitung luas alas Segitiga : ");
        segitiga.alas = scLimasSegitiga.nextDouble();
        double hitung = 0.333 * segitiga.luasSegitiga() * segitiga.tinggi;
        System.out.println("Volume Limas Segitiga = 1/3 X "+ segitiga.luasSegitiga() + segitiga.tinggi + " = " + hitung);
        return hasilVolume;
    }
}
