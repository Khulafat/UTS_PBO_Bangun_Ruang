package Bangun_Ruang;

import java.util.Scanner;

/**
 *
 * @author Afad
 */
public class LimasSegiempat extends Bangun_Ruang{
    Segitiga segitiga = new Segitiga();
    public double volumeLimasSegiempat(){
        Persegi persegi = new Persegi();
        Scanner scBola = new Scanner(System.in);
        System.out.println("Menghitung Volume Kerucut");
        System.out.print("Masukkan Sisi : ");
        persegi.sisi = scBola.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        segitiga.tinggi = scBola.nextDouble();        
        double hitung = 0.333 * persegi.luasPersegi() * segitiga.tinggi;
        System.out.println("Volume Bola = 1/3 X "+ persegi.luasPersegi() + " X " + segitiga.tinggi + " = " + hitung);
        return hasilVolume;
    }
}
