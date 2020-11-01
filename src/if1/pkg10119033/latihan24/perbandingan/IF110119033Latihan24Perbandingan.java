/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan24.perbandingan;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menentukan perbandingan dua buah nilai integer
 */
public class IF110119033Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    static int x, y;
    static Scanner scanner = new Scanner (System.in);
    
    static void inputNilai() {
        System.out.print("Masukan Nilai Pertama\t: ");
        x = scanner.nextByte();
        System.out.print("Masukan Nilai Kedua\t: ");
        y = scanner.nextByte();
    }
    
    static String perbandinganNilai(int paramSatu, int paramDua){
        String hasil;
        if (paramSatu > paramDua){
            hasil = paramSatu + " Lebih besar dari " + paramDua;
        } else if (paramSatu < paramDua){
            hasil = paramSatu + " Lebih kecil dari " + paramDua;
        } else {
            hasil = paramSatu + " Sama dengan " + paramDua;
        }
        return hasil;
    }
    
    static void tampilHasil() {
        System.out.println("Hasil : " + perbandinganNilai(x, y));
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String aktifitas;
        System.out.println("======Program Perbandingan Nilai======");
        do {
            inputNilai();
            tampilHasil();
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            aktifitas = scanner.next();
            System.out.println();
        } while(aktifitas.toUpperCase().equals("YA"));
       
    }
    
}
