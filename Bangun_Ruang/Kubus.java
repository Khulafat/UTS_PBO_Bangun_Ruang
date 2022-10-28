package Bangun_Ruang;

import java.util.Scanner;

/**
 *
 * @author Afad
 */
public class Kubus extends Bangun_Ruang{
    public double volumeKubus(){
        Persegi persegi = new Persegi();
        Scanner scVolumeKubus = new Scanner(System.in);
        System.out.println("Menghitung Volume Kubus\n");
        System.out.print("Masukkan Rusuk Kubus : ");
        persegi.sisi = scVolumeKubus.nextDouble();
        double hitung =  persegi.sisi * persegi.sisi * persegi.sisi;
        System.out.println("Volume Kubus = "+ persegi.sisi + " X " + persegi.sisi + " X " + persegi.sisi + " = " + hitung);       
        return hasilVolume;
    }
    
    public double kelilingKubus(){
        Persegi persegi = new Persegi();
        Scanner scKelilingKubus = new Scanner(System.in);
        System.out.println("Menghitung Keliling Kubus\n");
        System.out.print("Masukkan Rusuk Kubus : ");
        persegi.sisi = scKelilingKubus.nextDouble();
        double hitung =  12 * persegi.sisi;
        System.out.println("Volume Kubus = 12 X "+ persegi.sisi + " = " + hitung);       
        return hasilKeliling;
    }
}
