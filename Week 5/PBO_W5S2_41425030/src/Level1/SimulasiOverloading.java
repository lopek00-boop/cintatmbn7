/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
// Kelas untuk menghitung tarif pengiriman barang
class MesinTarif { 
    //Variabel untuk menyimpan data nama kota asal pengiriman
    private String kotaAsal;
    //Constructor: Method yang otomatis berjalan saat objek MesinTarif dibuat
    public MesinTarif(String kotaAsal) { 
        this.kotaAsal = kotaAsal; 
    }
    //method overloading 1: menghitung ongkir  
    public double hitungOngkir(double beratKg) { 
        return beratKg * 10000;
        //tarif dasar Rp.10000/Kg
    } 
    //method overloading 2: menghitung ongkir+biaya asuransi barang
    public double hitungOngkir(double beratKg, double nilaiBarang){ 
        double biayaAsuransi = nilaiBarang * 0.01;
        //biaya asuransi 1% dari harga barang 
        return (beratKg * 10000) + biayaAsuransi;
        //ongkir dasar,biaya asuransi
    }
    //method overloading 3: menghitung ongkir untuk layanan express 
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        //hitung ongkir dasar diawal
        if (isExpress) {
            total += 20000;
            //memilih layanan, tambah biaya tambahan Rp.20000
        }
        return total;
    }
}
//Kelas utama untuk menjalankan simulasi program
public class SimulasiOverloading {
    public static void main(String[] args) {
        // Membuat objek 'tarif' dari kelas MesinTarif dengan kota asal "Medan"
        MesinTarif tarif = new MesinTarif("Medan");
        
        System.out.println("=== INI METHOD OVERLOADING ===");
        // Memanggil hitungOngkir dengan 1 parameter (2.0)
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp " +tarif.hitungOngkir(2.0));
        // Memanggil hitungOngkir dengan 2 parameter angka (2.0 dan 5000000.0)
        System.out.println("Ongkir + Asuransi (Barang 5Jt) : Rp " + tarif.hitungOngkir (2.0, 5000000.0));
        // Memanggil hitungOngkir dengan 2 parameter (2.0 dan boolean true)
        System.out.println("Ongkir Express (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0, true));
    }
}

/* Analisis Overloading: 
1. Mengapa compiler Java dapat menentukan method hitungOngkir mana yang dijalankan
sebelum program dieksekusi (compile-time)? Bagian method apa yang diperiksa compiler?
Penjelasan:Karena Java menggunakan konsep Method Overloading (Compile-Time Polymorphism). 
Bagian method yang diperiksa oleh compiler dinamakan Method Signature, yaitu:Jumlah parameter, 
Tipe data parameter, Urutan tipe data parameter.Compiler mencocokkan argumen yang dimasukkan 
saat pemanggilan dengan daftar parameter yang ada, sehingga jenis method sudah pasti ketahuan dari awal sebelum program dijalankan. 

2. Jika pada class MesinTarif ditambahkan method berikut:
public int hitungOngkir(double beratKg) {
return (int)(beratKg * 10000);
}
Mengapa compiler menolak kode tersebut padahal tipe kembaliannya berbeda (int vs double)?
Penjelasan: Karena tipe kembalian (return type) tidak termasuk syarat dalam 
Method Overloading. Java hanya membedakan method berdasarkan nama dan 
parameter-nya saja. Method baru ini memiliki nama dan parameter yang persis sama 
dengan yang lama (sama-sama menerima 1 parameter double), sehingga dianggap duplikat (already defined). 
Java menolaknya karena akan membingungkan compiler saat method tersebut dipanggil.
*/