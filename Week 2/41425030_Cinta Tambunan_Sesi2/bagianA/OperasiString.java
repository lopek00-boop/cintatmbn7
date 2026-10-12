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

public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

// Pertanyaa Pemantik: 
// 1.Bagaimana jika nama yang diinput dengan lebih dari satu spasi? 
/*Penjelasan: 
1. Method nama.length() akan menghitung seluruh karakter termasuk setiap spasi 
yang dimasukkan (misalnya: "A  B" akan dihitung panjangnya 4).
2. Method nama.charAt(0) tetap mengambil karakter paling pertama 
(jika diawali spasi, maka hasil huruf pertama adalah karakter spasi).
3. Method nama.contains(" ") tetap mengembalikan nilai boolean true 
selama ditemukan minimal satu karakter spasi di dalam teks tersebut. */
