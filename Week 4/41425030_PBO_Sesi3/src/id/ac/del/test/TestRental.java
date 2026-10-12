/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author ASUS
 */
/* 
Nama: CINTA TAMBUNAN
NIM: 41425030 
Prodi: DIV TRPL 2025 
*/
import id.ac.del.rental.VehicleRental;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.CorporateDiscount;

// Nama class disesuaikan dengan nama file: TestRentalUpdate.java
public class TestRental {
    public static void main(String[] args) {
        // Objek rental kendaraan
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
        
        // Input hari sewa yang valid
        v.setRentalDays(3);

        // Nomor 3: Penggunaan Polimorfisme & Dependency Injection dengan Interface
        Discountable member = new MemberDiscount(0.20);        // Diskon 20%
        Discountable flashSale = new FlashSaleDiscount(0.50);  // Diskon 50%
        Discountable corporate = new CorporateDiscount(0.30);  // Diskon 30%

        // Output hasil perhitungan
        System.out.println("Plat Nomor           : " + v.getPlateNumber());
        System.out.println("Total (Member 20%)   : Rp" + v.getTotalCost(member));
        System.out.println("Total (FlashSale 50%): Rp" + v.getTotalCost(flashSale));
        System.out.println("Total (Corporate 30%): Rp" + v.getTotalCost(corporate));
    }
}

/*                                              JAWABAN BAGIAN C

    KODE SESUAI MODUL 

import id.ac.del.rental.VehicleRental;
public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
        
        // Baris A || bebas diakses dari luar package karna public
        v.plateNumber = ""; 
        // Baris B || error karna protected hanya bisa diakses dipackage yang sama
        v.rentalRatePerDay = -500000;
        // Baris C || error karna menggunakan default access modifier yang hanya diakses oleh kelas dalam package yang sama 
        v.discountRate = 0.20;
        // Baris D || tidak error kompilasi karena method nya public 
        v.setRentalDays(-7); 
        // method ini tidak memiliki validasi. method langsung menerima angka (-) padahal jumlah hari sewa tidak bisa bernilai - / 0 
        System.out.println("Total Biaya: Rp" + v.getTotalCost());
    } 
}

        2. KELEMAHAN INTEGRITAS DATA (DATA HIDING & VALIDATION)
1. Cacat logika pada method setRentalDays adalah tidak adanya validasi input, sehingga method dapat menerima nilai negatif (-7). Hari sewa 
seharusnya bernilai positif (> 0).Method setRentalDays versi awal tidak memiliki validasi terhadap nilai 
parameter yang masuk. Nilai yang dikirim langsung diisikan ke variabel 
'rentalDays'. Hal ini menyebabkan nilai tidak valid seperti angka negatif 
(misal -5) atau nol tetap dapat diproses oleh sistem tanpa memberikan error.

2. Total biaya bernilai negatif karena variabel rentalDays bernilai minus. Solusi refactoring-nya adalah mengubah seluruh atribut menjadi private 
(Enkapsulasi) dan menambahkan validasi `if (days > 0)` pada method 
setter agar data terhindar dari korupsi data (data corruption).
Penyebab Total Biaya Negatif & Solusi Refactoring:
      - Penyebab: Total biaya menjadi negatif karena 'rentalDays' atau 
        'rentalRatePerDay' diisi dengan angka negatif. Hasil perkalian tarif 
        dan hari sewa yang negatif menghasilkan total biaya bernilai negatif.
      - Solusi Refactoring:
        1. Enkapsulasi: Mengubah modifier seluruh atribut (plateNumber, 
           rentalRatePerDay, rentalDays) menjadi 'private'.
        2. Validasi: Menambahkan kondisi pengecekan (if-else) pada konstruktor 
           dan method setter untuk memastikan tarif dan hari sewa bernilai > 0.
        3. Getter: Menyediakan method getter publik untuk membaca data atribut 
           secara aman dari luar kelas.
        
        3. Penerapan Interface (Dependency Injection)
   - Kontrak Interface Discountable: Interface Discountable dibuat dengan metode 'double calculateDiscount(double amount)' 
      sebagai standar/kontrak perhitungan potongan harga.
   - Polimorfisme pada getTotalCost():Method getTotalCost() direfaktor agar menerima parameter bertipe interface Discountable. Dengan cara ini, kalkulasi diskon dapat mengenali kelas diskon 
apapun secara dinamis (Member, FlashSale, Corporate) saat runtime.
*/


