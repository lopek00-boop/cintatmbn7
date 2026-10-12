/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Level1;

/**
 *
 * @author ASUS
 */
/* 
Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: D4 TRPL 
*/
// Kelas induk (Parent Class) untuk kurir biasa/reguler
class KurirReguler {
    // Variabel untuk menyimpan nama kurir. 
    // protected: bisa diakses oleh kelas ini dan kelas turunannya (child class).
    protected String nama;

    // Constructor: Method yang pertama kali berjalan saat membuat objek KurirReguler
    public KurirReguler(String nama) {
        this.nama = nama; // Menyimpan nilai nama dari parameter ke variabel kelas
    }

    // Method standar untuk mengirim barang melalui jalur darat
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

// Kelas anak (Child Class) yang mewarisi sifat dari KurirReguler menggunakan 'extends'
class KurirDrone extends KurirReguler {
    // Variabel khusus untuk menyimpan ID dari drone (hanya bisa diakses di dalam kelas ini)
    private String idDrone;

    // Constructor untuk KurirDrone
    public KurirDrone(String nama, String idDrone) {
        super(nama); // Memanggil constructor milik kelas induk (KurirReguler) untuk mengisi nama
        this.idDrone = idDrone; // Menyimpan ID drone
    }

    // @Override menandakan bahwa method ini menggantikan/menimpa method kirimBarang() milik kelas induk
    @Override
    public void kirimBarang(String alamat) {
        // Cara pengiriman disesuaikan khusus untuk drone (terbang lewat udara)
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama + 
                           " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

// Kelas utama untuk menjalankan simulasi program
public class SimulasiOverriding {
    public static void main(String[] args) {
        // Menampilkan judul simulasi
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Membuat objek kurir biasa dengan nama Budi
        KurirReguler k1 = new KurirReguler("Budi");

        // Membuat objek kurir drone dengan operator Arka dan kode drone DRN-01,
        // tetapi disimpan dalam tipe variabel KurirReguler (konsep Polimorfisme)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Memanggil method kirimBarang() pada Budi -> Akan menjalankan pengiriman jalur darat
        k1.kirimBarang("Jl. Sudirman No. 10");

        // Memanggil method kirimBarang() pada Arka -> Karena objek aslinya adalah KurirDrone,
        // Java secara otomatis menjalankan method versi drone (jalur udara)
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/* Analisis Overriding:
- Pada class KurirDrone, hapus atau jadikan komentar baris @Override. Kemudian, ubah nama
method di bawahnya secara sengaja menjadi salah ketik, misalnya: public void
kirimbarang(String alamat) (menggunakan huruf 'b' kecil).
- Jalankan SimulasiOverriding.java. Apa output yang tercetak dari k2.kirimBarang("Gedung
Graha Lt. 5")? Apakah masih "lewat jalur udara" atau berubah menjadi "lewat jalur darat"?
- Sekarang kembalikan tulisan @Override di atas method yang salah ketik tersebut, lalu kompilasi
ulang. Salin pesan error yang muncul!
- Berdasarkan eksperimen di atas, jelaskan dengan bahasa Anda sendiri apa fungsi utama dari tulisan
@Override bagi seorang programmer

Penjelasan: 
Output yang tercetak dari k2.kirimBarang("Gedung Graha Lt. 5"):
Outputnya berubah menjadi "lewat jalur darat".
yang dicetak: Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan.

Pesan error saat tulisan @Override dikembalikan di atas method yang salah ketik:
method does not override or implement a method from a supertype

@Override fungsinya yaitu pengecek otomatis dari compiler Java. 
Dengan memasang @Override, Java akan memastikan bahwa method yang kita buat benar-benar 
menimpa(override) method yang ada di kelas induk. Jika ada kesalahan ketik nama method atau beda parameter, 
Java akan langsung memberikan pesan error saat dikompilasi. 
*/