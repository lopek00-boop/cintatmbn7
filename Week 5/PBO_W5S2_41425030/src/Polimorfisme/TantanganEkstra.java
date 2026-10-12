/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author ASUS
 */
/* 
Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: D4 TRPL 
*/
// Kelas induk abstrak sebagai kerangka dasar kendaraan
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor untuk mengisi data plat nomor dan kapasitas
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Method abstrak yang wajib di-override oleh kelas anak
    public abstract void angkutBarang(String namaBarang);
}

// Child Class 1: TrukBox
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang + "' ke dalam kontainer tertutup pendingin.");
    }
}

// Child Class 2: MobilVan
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang + "' di bagasi belakang untuk distribusi kota.");
    }
}

// Child Class 3: MotorKurir
class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor [" + noPolisi + "] membawa '" + namaBarang + "' menggunakan tas samping ekspres.");
    }
}
public class TantanganEkstra {
    public static void main(String[] args) {
        System.out.println("=== TANTANGAN EKSTRA: POLIMORFISME ARRAY ===");

        // 1. Membuat array bertipe Parent Class (KendaraanEkspedisi) berukuran 3 slot
        KendaraanEkspedisi[] armada = new KendaraanEkspedisi[3];

        // 2. Mengisi array dengan objek-objek dari Child Class yang berbeda
        armada[0] = new TrukBox("B 9081 TXT", 5000);
        armada[1] = new MobilVan("B 1122 KAA", 800);
        armada[2] = new MotorKurir("BK 4567 DEL", 50);

        // 3. Menggunakan satu buah for-loop (for-each) untuk melakukan iterasi
        // Method angkutBarang() dipanggil melalui referensi parent class (KendaraanEkspedisi)
        for (KendaraanEkspedisi kendaraan : armada) {
            // Java secara otomatis mengeksekusi method angkutBarang() milik child class masing-masing
            kendaraan.angkutBarang("Paket Logistik LOGIX");
        }
    }
}
