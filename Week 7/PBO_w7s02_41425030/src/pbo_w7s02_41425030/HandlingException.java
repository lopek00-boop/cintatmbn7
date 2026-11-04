/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s02_41425030;

/**
 *
 * @author ASUS
 */

// Nama: Cinta Tambunan 
// NIM: 41425030 
public class HandlingException {
    public static void main(String[] args) { 
        try { 
            System.out.println(3/0);
        } catch (ArithmeticException ex) { 
            System.out.println("Error " + ex);
        }
    }
} 

/*KODE EKSEKUSI:  
    menggunakan ex.getMessage() 
public class HandlingException {
    public static void main(String[] args) { 
        try { 
            System.out.println(3/0);
        } catch (ArithmeticException ex) { 
            System.out.println("Error " + ex.getMessage());
        }
    }
}
Output: 
run:
Error / by zero
BUILD SUCCESSFUL (total time: 0 seconds)
*/

/* 
    menggunakan ex.getStackTrace()
public class HandlingException {
    public static void main(String[] args) { 
        try { 
            System.out.println(3/0);
        } catch (ArithmeticException ex) { 
            System.out.println("Error " + ex.getStackTrace());
        }
    }
}
OUTPUT: 
run:
Error [Ljava.lang.StackTraceElement;@10f87f48
BUILD SUCCESSFUL (total time: 0 seconds)

Ganti AtirhmeticException dengan Exception
public class HandlingException {
    public static void main(String[] args) { 
        try { 
            System.out.println(3/0);
        } catch (Exception ex) { 
            System.out.println("Error " + ex);
        }
    }
} 
OUTPUT: 
run:
Error java.lang.ArithmeticException: / by zero
BUILD SUCCESSFUL (total time: 0 seconds)  

*/


/* 
2. Handling the Excception 
a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk
mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya.
Penjelasan: 
- menggunakan ex.getMessage(),berikut hasilnya : 
run:
Error / by zero
BUILD SUCCESSFUL (total time: 0 seconds)
jadi outputnya cuma memberitahu bagian mana yang salah.

- menggunakan ex.printStackTrace(),berikut hasilnya: 
run:
Error [Ljava.lang.StackTraceElement;@10f87f48
BUILD SUCCESSFUL (total time: 0 seconds) 
Mengembalikan referensi array objek memori, karena method ini tidak otomatis 
mencetak isi array-nya jika dipanggil langsung tanpa looping.


b. Ganti AtirhmeticException dengan Exception. Apa hasilnya? Jelaskan.
Penjelasan: 
Hasilnya itu program akan tetap berjalan tanpa error dan berhasil menangkap error pembagian dengan nol tersebut. 
dimana kelas Exception adalah induk (superclass) dari semua jenis exception di Java (termasuk ArithmeticException), 
sehingga sistem tetap mengenalinya dan error berhasil diatasi dengan baik.

*/
