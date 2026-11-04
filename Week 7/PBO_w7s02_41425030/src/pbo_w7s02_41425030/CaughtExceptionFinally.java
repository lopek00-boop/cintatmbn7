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

class CaughtExceptionFinally {
    public static void main(String args[]) { 
        int n = args.length;
        try { 
            if (n == 0) { 
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else { 
                System.out.println("This will be executed if" 
                        + "arguments is not zero");
            }
        } catch (Exception e) { 
            System.out.println("Catching exception: " + e);
        } finally { 
            System.out.println("After trying or catching...");
        }
        
    }
    
}


/* 
    3. USING FINALLY 
a. Coba eksekusi program di atas tanpa arguments. Apa hasilnya?
KODE EKSEKUSI: 
class CaughtExceptionFinally {
public static void main(String args[]) {
int n = args.length;
try {
if (n == 0) {
System.out.println(3/n);
System.out.println("This won't be executed");
} else {
System.out.println("This will be executed if"
+ "arguments is not zero");
}
} catch (Exception e) {
System.out.println("Catching exception: " + e);
} finally {
System.out.println("After trying or catching...");
} 
} 
}
OUTPUT: 
run:
Catching exception: java.lang.ArithmeticException: / by zero
After trying or catching...
BUILD SUCCESSFUL (total time: 0 seconds) 
Penjelasan singkat: 
Karena dijalankan tanpa argumen, jumlah args.length (n) bernilai 0. 
Program masuk ke blok if, lalu mengeksekusi System.out.println(3/0) yang 
memicu error pembagian dengan nol (ArithmeticException). Baris "This won't be executed" 
dilewati, error langsung ditangkap oleh blok catch, dan blok finally tetap dijalankan di bagian akhir.

b. Coba eksekusi program di atas dengan arguments. Apa hasilnya?
Penjelasan: 
KODE EKSEKUSI: 
class CaughtExceptionFinally {
    public static void main(String args[]) { 
        int n = 1; 
        try { 
            if (n == 0) { 
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else { 
                System.out.println("This will be executed if arguments is not zero");
            }
        } catch (Exception e) { 
            System.out.println("Catching exception: " + e);
        } finally { 
            System.out.println("After trying or catching...");
        }
    }
} 
OUTPUT: 
run:
This will be executed if arguments is not zero
After trying or catching...
BUILD SUCCESSFUL (total time: 0 seconds)

Penjelasan singkat: Karena nilai n diubah menjadi 1, 
program masuk ke blok else, melewati blok catch karena tidak ada error, 
lalu blok finally tetap dijalankan di bagian paling akhir.

c. Jelaskan kesimpulan Anda dari pertanyaan a dan b setelah menjalankan program.
Penjelasan: 
Blok finally terbukti akan selalu dieksekusi dalam situasi apa pun secara konsisten, 
baik ketika terjadi error/exception yang ditangkap di blok catch seperti saat program dijalankan tanpa argumen, 
maupun saat program berjalan normal tanpa error di blok else seperti saat program dijalankan dengan argumen.

*/

/* 4. Modifikasi kode program no.3. Ganti Exception di dalam catch block dengan
NullPointerException. Eksekusi dan jalankan kode. Apa hasilnya dan jelaskan apa yang
terjadi jika sebuah exception tidak memiliki sebuah catch yang cocok?
KODE EKSEKUSI: 
class CaughtExceptionFinallyMod {
public static void main(String args[]) {
int n = args.length;
try {
if (n == 0) {
System.out.println(3/n);
System.out.println("This won't be executed");
} else {
System.out.println("This will be executed if"
+ "arguments is not zero");
}
} catch (NullPointerException e) {
System.out.println("Catching exception: " + e);
} finally {
System.out.println("After trying or catching...");
}
}
} 

OUTPUT: 
run:
After trying or catching...
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at pbo_w7s02_41425030.CaughtExceptionFinallyMod.main(CaughtExceptionFinally.java:122)
C:\Users\ASUS\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ASUS\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds) 

Penjelasan: 
Ketika sebuah exception terjadi di dalam blok try tetapi tipe data pada blok catch tidak cocok, 
misalnya terjadi ArithmeticException tapi yang ditangkap adalah NullPointerException, 
maka blok catch tersebut akan mengabaikan exception tersebut dan dianggap tidak menangkapnya.
Meskipun blok catch terlewati, blok finally akan tetap dieksekusi terlebih dahulu di bagian akhir. 
Setelah blok finally selesai dijalankan, karena exception tidak tertangani oleh blok catch mana pun, 
Java akan menghentikan program secara paksa dan mencetak laporan stack trace error ke konsol, 
serta membuat status build menjadi gagal (BUILD FAILED).
*/