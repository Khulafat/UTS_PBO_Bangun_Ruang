package Bangun_Ruang;

import java.util.Scanner;
/**
 *
 * @author Afad
 */
public class Balok extends Bangun_Ruang{
    PersegiPanjang persegipanjang = new PersegiPanjang();
    Segitiga segitiga = new Segitiga();
    public double volumeBalok(){
        Scanner scVolumeBalok = new Scanner(System.in);
        System.out.println("Menghitung Volume Balok");
        System.out.print("Masukkan Panjang : ");
        persegipanjang.panjang = scVolumeBalok.nextDouble();
        System.out.print("Masukkan Lebar : ");
        persegipanjang.lebar = scVolumeBalok.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        segitiga.tinggi = scVolumeBalok.nextDouble();
        double hitung = persegipanjang.panjang * persegipanjang.lebar * segitiga.tinggi;
        System.out.println("Volume Balok = "+ persegipanjang.panjang + " X " + persegipanjang.lebar + " X " + segitiga.tinggi + " = " + hitung);    
        return hasilVolume;
    }
    
    public double kelilingBalok(){
        Scanner scKelilingBalok = new Scanner(System.in);
        System.out.println("Menghitung Keliling Balok");
        System.out.print("Masukkan Panjang : ");
        persegipanjang.panjang = scKelilingBalok.nextDouble();
        System.out.print("Masukkan Lebar : ");
        persegipanjang.lebar = scKelilingBalok.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        segitiga.tinggi = scKelilingBalok.nextDouble();
        double hitung = 4 * (persegipanjang.panjang + persegipanjang.lebar + segitiga.tinggi);
        System.out.println("Keliling Balok = 4 X ("+ persegipanjang.panjang + " X " + persegipanjang.lebar + " X " + segitiga.tinggi + ") = " + hitung);
        return hasilKeliling;
    }
}
