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
public class no1bagianb {
    public static void main(String[] args) {
        // 1. Registrasi Mahasiswa
        StudentGrade mhs = new StudentGrade("11425001", "Marsha");

        // 2. Simulasi Input Nilai Kuis yang Tidak Valid (> 100)
        mhs.setNilaiKuis(110.0);

        // 3. Update Nilai Kuis dan UTS yang Valid
        mhs.setNilaiKuis(85.0);
        mhs.setNilaiUTS(90.0);

        // 4. Cetak Kartu Hasil Studi
        mhs.cetakLaporan();
    }
}