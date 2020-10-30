package pbo2.pkg10119073.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk membandingkan dua buah
 * nilai
 *
 */

public class PBO210119073Latihan24PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        String ulangi;
        
        System.out.println("====Program Perbandingan Nilai====");
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = scanner.nextInt();
            
            if (nilai1 > nilai2) {
                System.out.println("Hasil : "+nilai1+" lebih besar dari "+nilai2+"\n");
            }else
                if(nilai1 < nilai2){
                System.out.println("Hasil : "+nilai1+" lebih kecil dari "+nilai2+"\n");
            }   else
                System.out.println("Hasil : "+nilai1+" sama dengan "+nilai2+"\n");
            
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = scanner.next();
            
            
        } while (!ulangi.equals("Tidak"));
        
    }
    
}