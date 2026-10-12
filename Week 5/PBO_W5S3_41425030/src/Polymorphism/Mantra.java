/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author ASUS
 */

/* 
Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 
*/

import java.util.*;

public class Mantra {
    //Method ucapkan() dengan satu parameter 
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }
    // Overload: method ucapkan() dengan dua parameter (String, int)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }
/*
    // Task 1.1 No. 2: Overload method ucapkan() dengan dua parameter (String, String) tanpa kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: " + target + " terkena mantra!");
    }
    // Task 1.1 No. 3 (Pertanyaan): Overload dengan urutan parameter berbeda (int, String)
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan " + namaMantra + " dengan tingkat energi " + kekuatan);
    }
*/
    // Overload: method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }
    public static void main(String[] args) {
        Mantra mantra = new Mantra(); 
        // Memanggil berbagai bentuk overload method ucapkan()
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
/*
        mantra.ucapkan("Expelliarmus", "Draco Malfoy"); // Uji coba method baru (namaMantra, target)
        mantra.ucapkan(12, "Stupefy");                  // Uji coba method urutan parameter berbeda
*/
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}

/* 
 Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method
dengan dua parameter.
Penjelasan: yang terjadi yaitu akan terjadi error dimana pesan error nya itu: Compile Time Error, Karena 
Compiler pada java tidak bisa menemukan method yang menerima data bertipe (string,int).

 Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba
buat method ucapkan(int kekuatan, String namaMantra).
Penjelasan: Bisa, Overloading itu ditentukan oleh method signature seperti nama method, jumlah parameter, tipe data 
parameter, dan urutan tipe data parameternya. dimana ketika Method ucapkan(int kekuatan,string namaMantra) memiliki tipe
parameter (int,string) yang beda dari ucaplan(string namaMantra,int kekuatan).

*/
