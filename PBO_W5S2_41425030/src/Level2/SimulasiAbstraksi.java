/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level2;

/**
 *
 * @author ASUS
 */
/* 
Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: D4 TRPL 
*/
// Kelas abstrak (kerangka dasar) untuk semua jenis kendaraan ekspedisi
abstract class KendaraanEkspedisi {
    // Variabel untuk menyimpan nomor polisi dan kapasitas daya angkut
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor: Digunakan untuk mengisi nomor polisi dan kapasitas saat kendaraan dibuat
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Method biasa: Menampilkan informasi plat nomor dan daya angkut kendaraan
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method: Method tanpa isi (wajib diisi/di-override oleh kelas anak)
    public abstract void angkutBarang(String namaBarang);
}

// Subclass (kelas anak) TrukBox yang mewarisi sifat dari KendaraanEkspedisi
class TrukBox extends KendaraanEkspedisi {
    // Constructor TrukBox yang memanggil constructor dari kelas induk (KendaraanEkspedisi)
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Mengisi/mengatur cara kerja method angkutBarang khusus untuk TrukBox
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang + "' ke dalam kontainer tertutup pendingin.");
    }
}

// Subclass (kelas anak) MobilVan yang mewarisi sifat dari KendaraanEkspedisi
class MobilVan extends KendaraanEkspedisi {
    // Constructor MobilVan yang memanggil constructor dari kelas induk (KendaraanEkspedisi)
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Mengisi/mengatur cara kerja method angkutBarang khusus untuk MobilVan
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang + "' di bagasi belakang untuk distribusi kota.");
    }
}

// Kelas utama untuk menjalankan simulasi program
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // Kendaraan Ekspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        // Membuat objek TrukBox
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("------------------------------------------");

        // Membuat objek MobilVan
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}

/* 
- Eksperimen 1: Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris
PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
Pertanyaan: Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep"
yang sudah Anda baca, mengapa Java menggagalkan baris kode ini?
Penjelasan: 
Pesan error: KendaraanEkspedisi is abstract; cannot be instantiated 
Kenapa java menggagalkan baris kode itu? Karena KendaraanEkspedisi dideklarasikan sebagai abstract class.
Kelas abstrak hanyalah sebuah blueprint yang belum memiliki bentuk nyata dan memiliki method abstrak yang 
belum ada aksinya, seperti method angkutBarang. Oleh karena itu, Java melarang pembuatan objek nyata secara langsung 
menggunakan kata kunci new dari sebuah abstract class.


- Eksperimen 2: Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke
KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya.
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir.
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java (seperti
NetBeans/IntelliJ/Eclipse) untuk mengatasi error tersebut!
Penjelasan: 
1. Implemen all abstract methods(disini ditambahkan dan disi implementasi untuk method abstrak 
angkutBarang(String namaBarang) yang diwarisi dari kelas KendaraanEkspedisi kedlm kelas MotorKurir. 

2. Make class 'MotorKurir' abstract ( disini diubah class MotorKurir jadi class abstrak dengan menambahkan abstract didpn nama kelasnya: 
abstract class MotorKurir extends KendaraanEkspedisi
*/