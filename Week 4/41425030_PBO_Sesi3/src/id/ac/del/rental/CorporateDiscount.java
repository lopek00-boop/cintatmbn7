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
Nama : CINTA TAMBUNAN
NIM  : 41425030 
Prodi: DIV TRPL 2025 
*/
// Kelas CorporateDiscount mengimplementasikan antarmuka (interface) Discountable
public class CorporateDiscount implements Discountable {
    // Atribut persentase diskon dibuat private demi menerapkan enkapsulasi
    private double rate;
    // Konstruktor untuk menginisialisasi nilai rate/persentase diskon khusus Corporate
    public CorporateDiscount(double rate) {
        this.rate = rate;
    }
    // Mengimplementasikan (override) metode dari interface Discountable
    // Menghitung nominal potongan diskon berdasarkan persentase (rate) dikali subtotal biaya
    @Override
    public double calculateDiscount(double amount) {
        return amount * rate;
    }
}
