/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Motto: Semangat Belajar*/

public class KasirSederhana {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();
        double totalSebelumDiskon = harga * jumlah;
        double diskon = 0;
        if (totalSebelumDiskon >= 100000) {
            diskon = totalSebelumDiskon * 0.10;
        }
        double totalBayar = totalSebelumDiskon - diskon;
        System.out.println("Total sebelum diskon: " + (long) totalSebelumDiskon);
        System.out.println("Diskon: " + (long) diskon);
        System.out.println("Total bayar: " + (long) totalBayar);
    
    }
}
