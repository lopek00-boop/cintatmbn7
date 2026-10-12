/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

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

// Superclass / Induk Class
class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Subclass HarryPotter
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Subclass Hermione
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}
/*
// Task 1.2 No. 2: Menambahkan kelas RonWeasley yang mewarisi Penyihir
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra tetapi tongkatnya sedikit patah dan meledak!");
    }
}
*/

public class DemoPenyihir {
    public static void main(String[] args) {
        // Polymorphism: Tipe referensi Superclass menunjuk ke objek Subclass
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
/*
        Penyihir penyihir3 = new RonWeasley(); // Objek dari class RonWeasley
*/
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
/*
        penyihir3.ucapkanMantra(); // Memanggil method override dari RonWeasley
*/
    }
}
 
/* 
 Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih
berjalan?
Penjelasan: yang terjadi yaitu kode tetap bisa berjalan tanpa error. dimana @Override yaitu 
membantu memastikan apakah override dilakukan dengan benar pada method superclass. disaat ada kesalahan(typo)
contoh:ucapkanmantra() tanpa @Override maka compiler menganggapnya sebagai method baru, sedangkan menggunakan 
@Override compiler akan mengeluarkan error. 

 Apa keuntungan menggunakan polymorphism dalam contoh ini?
Penjelasan: Flexibility dan Reusability itu dimana kode nya bisa diperlakukan semua objek turunannya
(HarryPotter, Hermione, RonWeasley) sebagai tipe Penyihir.
Extensibility itu dimana disaat menambah penyihir baru, contoh: NevilleLongbottom, cukup hanya menambahkan
classnya tanpa perlu merubah panggilan dimethod utama(main).

*/