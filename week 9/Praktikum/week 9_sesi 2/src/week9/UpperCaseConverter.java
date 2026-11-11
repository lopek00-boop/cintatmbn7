/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

/**
 *
 * @author ASUS
 */
import java.io.*; // Mengimpor semua class yang ada di package java.io untuk kebutuhan input/output file

public class UpperCaseConverter {
    public static void main(String[] args) {
        // Membuka try with resources agar BufferedReader dan BufferedWriter otomatis tertutup 
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            
            String line; // Deklarasi variabel untuk menampung tiap baris teks yang dibaca
            
            // Melakukan perulangan membaca file baris per baris sampai habis (null)
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase()); // Mengubah teks baris menjadi huruf besar, lalu ditulis ke file baru
                bw.newLine(); // Menambahkan baris baru di file output
            }
            
            System.out.println("Konversi selesai!"); // Menampilkan pesan Konversi selesai jika proses selesai
            
        } catch (IOException e) {
            // Menangkap dan menampilkan pesan jika terjadi error, misal file input.txt tidak ditemukan 
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
