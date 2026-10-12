/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author ASUS
 */

/* 
Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 
*/ 

import java.util.*;

// Abstract class tidak dapat di-instansiasi langsung
abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method: wajib di-implementasikan oleh subclass konkret
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}
/*
// Task 2.1 No. 2: Menambahkan class Lumos
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Mengeluarkan cahaya terang di ujung tongkat.");
    }
}
*/ 

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
       /* MantraAbstrak mantra3 = new Lumos(); // Objek Lumos */

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();
/*
        mantra3.ucapkan();
        mantra3.efek();
*/

        // Coba instansiasi Abstract Class secara langsung (Akan Error):
        // MantraAbstrak m = new MantraAbstrak("Test"); // Error: MantraAbstrak is abstract; cannot be instantiated
    }
} 

/* 
 Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
Coba dan jelaskan errornya.
Penjelasan: akan terjadi "Compile Time Error", pesannya: MantraAbstrak is abstract; cannot be instantiated.
dimana abstract class yaitu blueprint yang belum lengkap dan dirancang untuk dibuat objeknya secara langsung.

 Mengapa kita perlu membuat abstract class? Apa keuntungannya?
Penjelasan: 
1. sebagai blueprint, keuntungannya untuk menjamin bahwa setiap kelas anak itu memiliki 
struktur dan fungsi dasar yang wajib.
2. sebagai redudansi code, keuntungannya untuk Menghindari penulisan kode yang sama berulang kali. 
3. memfasilitasi polymorphism, karena berbagai kelas anak yang berbeda untuk diperlakukan sebagai satu tipe data umum (abstract class).
*/