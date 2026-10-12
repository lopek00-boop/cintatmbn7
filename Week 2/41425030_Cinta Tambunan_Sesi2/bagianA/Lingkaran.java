/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianA;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425030
Nama: Cinta Tambunan 
Motto: Semangat belajar */ 

import java.util.Scanner;
public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}

//Pertanyaan Pemantik: 
// 1. Mengapa kita perlu validasi r<0?
/*Penjelasan: karena sudah ditenntukan pada program bahwasanya jari-jari tidak 
boleh bernilai negatif, jika terjadi penginputan jari jari bernilai negatif(r<0)
maka program akan menampilkan pesan error*/

//2. Dalam aplikasi nyata, dimana validasi input sangat penting? 
/*Penjelasan: Validasi input sangat penting pada sistem finansial(mencegah 
nominal transfer negatif), sistem login/autentikasi (mencegah input password 
kosong atau karakter berbahaya), form pendaftaran(memastikan format email 
dan nomor HP benar), serta sistem inventaris toko (mencegah stok bernilai minus) 
agar data tetap valid dan mencegah terjadinya error padas keamanan sistem.*/ 


