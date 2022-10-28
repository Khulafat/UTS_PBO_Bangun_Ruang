package Bangun_Ruang;

import java.util.Scanner;

/**
 *
 * @author Afad
 */
public class Kerucut extends Bangun_Ruang{
    Lingkaran lingkaran = new Lingkaran();
    Segitiga segitiga = new Segitiga();
    public double volumeKerucut(){
        Scanner scBola = new Scanner(System.in);
        System.out.println("Menghitung Volume Kerucut");
        System.out.print("Masukkan Jari - jari : ");
        lingkaran.r = scBola.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        segitiga.tinggi = scBola.nextDouble();
        double hitung= 0.333 * 3.14 * lingkaran.r * lingkaran.r * segitiga.tinggi;
        System.out.println("Volume Bola = 1/3 X phi X "+ lingkaran.r + " X " + lingkaran.r + " X " + segitiga.tinggi + " = " + hitung);
        return hasilVolume;
    }
}
