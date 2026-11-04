/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studikasus1;

/**
 *
 * @author ASUS
 */
/*
Nama: Cinta Tambunan
NIM: 41425030 
Prodi: D4 TRPL 
*/

public class Perpustakaan {

    // Method 'pinjamBuku' menggunakan 'throws' untuk memberitahu pemanggil 
    // bahwa method ini berpotensi melempar custom exception BatasPinjamBukuException.
    public void pinjamBuku(int jumlahPinjam) throws BatasPinjamBukuException {
        System.out.println("Memeriksa kuota batas peminjaman buku...");

        // Batas maksimal peminjaman buku adalah 3 buah
        if (jumlahPinjam > 3) {
            // 'throw' digunakan untuk memicu dan melemparkan objek exception buatan
            throw new BatasPinjamBukuException(
                "Peminjaman ditolak: Maksimal kuota peminjaman buku adalah 3 buah."
            );
        }
        
        // Baris ini dieksekusi jika jumlah pinjaman valid (<= 3)
        System.out.println("Peminjaman berhasil! Silakan ambil buku di sirkulasi.");
    }
}
