/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/

// Superclass
class Mahasiswa {
    String nama;
    String nim;
}

// Subclass
class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class TugasSoal2 {
    public static void main(String[] args) {
        // Membuat dan mengisi data objek MahasiswaAktif
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "Dina";
        mhs.nim = "123456";
        mhs.semester = 5;

        // Menampilkan output
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        mhs.belajar();
    }
}