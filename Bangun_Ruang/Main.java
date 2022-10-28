package Bangun_Ruang;
import java.util.Scanner;
/**
 *
 * @author Afad
 */
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Main object = new Main();
        object.menu();
    }
    
    public void menu(){
        Bangun_Ruang bangunMenu = new Bangun_Ruang();
        bangunMenu.BangunMenu();
        System.out.print("Pilih perhitungan yang akan digunakan : ");
        int pilih = in.nextInt();
            
        switch(pilih){
            case 1: {
                Balok volumeBLK = new Balok();
                volumeBLK.volumeBalok();
                menu();
                break; 
            }
            
            case 2: {
                Balok kelilingBLK = new Balok();
                kelilingBLK.kelilingBalok();
                menu();
                break;
            }
            
            case 3: {
                Bola volumeBL = new Bola();
                volumeBL.volumeBola();
                menu();
                break;
            }
            
            case 4: {
                Bola kelilingBL = new Bola();
                kelilingBL.volumeBola();
                menu();
                break;
            }
            
            case 5: {
                LimasSegitiga l3 = new LimasSegitiga();
                l3.volumeLimasSegitiga();
                menu();
                break;
            }
            
            case 6: {
                LimasSegiempat l4 = new LimasSegiempat();
                l4.volumeLimasSegiempat();
                menu();
                break;
            }
            
            case 7: {
                Kubus volumeKBS = new Kubus();
                volumeKBS.volumeKubus();
                menu();
                break;
            }
            
            case 8: {
                Kubus kelilingKBS = new Kubus();
                kelilingKBS.kelilingKubus();
                menu();
                break;
            }
            
            case 9: {
                Kerucut krc = new Kerucut();
                krc.volumeKerucut();
                menu();
                break;
            }
            
            case 0: {
                System.exit(0);
            }
            default: {
                System.out.println("Salah memasukkan input");
                System.exit(0);
            }
        }
    }
}
