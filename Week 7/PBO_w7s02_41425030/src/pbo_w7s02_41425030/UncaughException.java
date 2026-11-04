/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w7s02_41425030;

/**
 *
 * @author ASUS
 */

// Nama: Cinta Tambunan 
// NIM: 41425030 

class UncaughException {
    public static void main(String args[]) { 
        System.out.println(3/0);
    }
    
}

/* 1. UNCAUGHT EXCEPTION 
a. Analisis apa yang akan terjadi ketika program di atas di eksekusi.
Penjelasan: saat baris 17 dijalankan, akan dilakukan operasi pembagian bilangan bulat angka 3 dan 0.
dalam matemattika, pembagian dengan angka nol itu tidak terdefinisi. namun diJava ini akan menimbulkan runtime exception 
bertipe java.lang.ArithmeticException, karena didalam kode tidak ada penanganan error(try catch), 
jadi jvm akan menghentikan pengeksekusian program secara paksa dan mencetak laporan stack tracenya kekonsul.


b. Apa outputnya?
Penjelasan: 
Exception in thread "main" java.lang.ArithmeticException: / by zero
at pbo_w7s02_41425030.UncaughException.main(UncaughException.java:17)
C:\Users\ASUS\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ASUS\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds) 

*/
