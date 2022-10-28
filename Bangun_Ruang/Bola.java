package Bangun_Ruang;

import java.util.Scanner;

/**
 *
 * @author Afad
 */
public class Bola extends Bangun_Ruang{
    Lingkaran lingkaran = new Lingkaran();
    public double volumeBola(){
        Scanner scVolumeBola = new Scanner(System.in);
        System.out.println("Menghitung Volume Bola");
        System.out.print("Masukkan Jari - jari : ");
        lingkaran.r = scVolumeBola.nextDouble();
        double hitung = 0.75 * 3.14 * (lingkaran.r * lingkaran.r * lingkaran.r);
        System.out.println("Volume Bola = 4/3 X phi X "+ lingkaran.r + " X " + lingkaran.r + " X " + lingkaran.r + " = " + hitung);
        return hasilVolume;
    }
    
    public double kelilingBola(){
        Scanner scKelilingBola = new Scanner(System.in);
        System.out.println("Menghitung Keliling Bola");
        System.out.print("Masukkan Jari - jari : ");
        lingkaran.r = scKelilingBola.nextDouble();
        double hitung = 0.75 * 3.14 *(lingkaran.r * lingkaran.r);
        System.out.println("Volume Bola = 4/3 X phi X "+ lingkaran.r + " X " + lingkaran.r + " = " + hitung);
        return hasilKeliling;
    }
}
