/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s02_41425030;

/**
 *
 * @author ASUS
 */

//Nama: Cinta Tambunan 
//NIM: 41425030


class ThrowsDemo {
    static void throwOne() { 
        System.out.println("I'm throwing a non Runtime exception that I "
                 + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccesException("demo");
    }
    
     public static void main (String args[]) {
         throwOne();
     }
} 


/*PERBAIKAN
class ThrowsDemo { 
    static void throwOne() throws IllegalAccessException { 
        System.out.println("I'm throwing a non Runtime exception that I "
                 + "don't handle");
        System.out.println("Wothout specifying in method declaration");
        throw new IllegalAccessException("demo");
    }
    
    public static void main(String args[]) { 
        try{ 
            throwOne();
        } catch (IllegalAccessException e) { 
            System.out.println("Caught " + e);
        }
    }
}
*/


/* 
a. Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?
Penjelasan: program akan tetap berjalan, karena exception tipe IllegalAccessException adalah 
checked exception (bukan runtime exception), sehingga method throwOne() telah mendeklarasikannya menggunakan keyword 
throws IllegalAccessException, dan pemanggilnya di dalam fungsi main telah membungkusnya menggunakan blok try-catch sehingga error tertangani dengan benar.

b. Apa yang akan terjadi jika IllegalAccessException diganti dengan
ArithmeticException? Mengapa? Perbaiki kode program di atas seperti yang
ditunjukkan di bawah ini:
Penjelasan: 
tetap akan bisa dikompilasi dan berjalan, Karena ArithmeticException adalah 
jenis unchecked exception (turunan dari RuntimeException).unchecked exception bersifat opsional untuk dideklarasikan dengan 
throws ataupun ditangkap dengan try-catch secara eksplisit pada saat kompilasi. Meskipun demikian, penambahan blok try-catch 
di fungsi main tetap akan berfungsi dengan baik untuk menangkap exception tersebut saat dijalankan.

*/

/*EXCEPTION HANDLING ADALAH mengelola dan menangani kesalahan yang terjadi saat program berjalan 
ssehingga program tidak langsung crash dan dapat berjalan lebih terkontrol. 
*/