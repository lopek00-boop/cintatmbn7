/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */
/* 
Nama: CINTA TAMBUNAN
NIM: 41425030 
Prodi: DIV TRPL 2025 
*/
// Kelas MemberDiscount mengimplementasikan antarmuka (interface) Discountable
public class MemberDiscount implements Discountable {
    // Atribut privat untuk menyimpan persentase diskon member (Enkapsulasi)
    private double rate;
    // Konstruktor untuk menginisialisasi besaran rate diskon member saat objek dibuat
    public MemberDiscount(double rate) {
        this.rate = rate;
    }
    // Mengimplementasikan (override) metode dari antarmuka Discountable
    // Menghitung nominal potongan harga: total biaya (amount) dikali rate diskon member
    @Override
    public double calculateDiscount(double amount) {
        return amount * rate;// Potongan diskon berdasarkan persen 
    }
}