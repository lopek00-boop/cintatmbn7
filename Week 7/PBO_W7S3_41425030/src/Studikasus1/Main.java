/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studikasus1;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Menginstansiasi objek dari kelas Perpustakaan
        Perpustakaan perpus = new Perpustakaan();

        // Pengujian 1: Meminjam 5 buku (Memicu custom exception karena > 3)
        try {
            System.out.println("--- Pengujian 1 (Melebihi Kuota) ---");
            perpus.pinjamBuku(5);
        } catch (BatasPinjamBukuException e) {
            // Menangkap dan menangani custom exception
            System.out.println("Penanganan Error: " + e.getMessage());
        } finally {
            // Blok yang selalu dijalankan terlepas dari ada atau tidaknya error
            System.out.println("Sesi transaksi peminjaman pertama selesai.\n");
        }

        // Pengujian 2: Meminjam 2 buku (Normal flow / Berhasil)
        try {
            System.out.println("--- Pengujian 2 (Kuota Valid) ---");
            perpus.pinjamBuku(2);
        } catch (BatasPinjamBukuException e) {
            System.out.println("Penanganan Error: " + e.getMessage());
        } finally {
            System.out.println("Sesi transaksi peminjaman kedua selesai.");
        }
    }
}
