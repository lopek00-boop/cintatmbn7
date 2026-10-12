/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi3;

/**
 *
 * @author ASUS
 */
/* 
Nama: CINTA TAMBUNAN
NIM: 41425030 
Prodi: DIV TRPL 2025 
*/
public class StudentGrade {
    // Menyimpan data penting secara tertutup (private) supaya gak bisa diubah sembarangan dari luar
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf; // Attribute read-only

    // Constructor: Menginisialisasi data NIM dan Nama saat objek dibuat
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        
        // Hitung grade huruf awal dengan otomatis
        
        // menampilkan pesan kalau mahasiswa berhasil didaftarkan
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // READ ONLY PROPERTIES (Hanya mengambil/melihat data, gak ada fungsi buat setter)  
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getGradeHuruf() {
        return gradeHuruf;
    }
    public double getNilaiKuis() {
        return nilaiKuis;
    }
    public double getNilaiUTS() {
        return nilaiUTS;
    }
    //PRIVATE INTERNAL METHOD (Untuk menghitung gradeHuruf secara otomatis)
    private void calculateGrade() {
        double nilaiAkhir = getNilaiAkhir();
        if (nilaiAkhir >= 85.0) {
            this.gradeHuruf = "A";
        } else if (nilaiAkhir >= 75.0) {
            this.gradeHuruf = "B";
        } else if (nilaiAkhir >= 65.0) {
            this.gradeHuruf = "C";
        } else if (nilaiAkhir >= 50.0) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }
    // Fungsi buat ngisi/ngubah nilai kuis (harus angka 0 - 100)
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            // Update grade hurufnya secara otomatis
            calculateGrade();
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
        } else {
            // ketika nilai nyaa (-) maka akan muncul pesan error 
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }
    // Fungsi buat ngisi/ngubah nilai UTS (harus angka 0 - 100)
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
           // Update grade hurufnya secara otomatis
            calculateGrade();
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
        } else {
             // ketika nilai nyaa (-) maka akan muncul pesan error 
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS + " (Harus antara 0 - 100)");
        }
    }

    // METHOD MENGHITUNG NILAI AKHIR (40% Kuis + 60% UTS) 
    public double getNilaiAkhir() {
        return (0.40 * nilaiKuis) + (0.60 * nilaiUTS);
    }

    // MENCETAK LAPORAN (KARTU HASIL STUDI) 
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + getNilaiAkhir());
    }
}