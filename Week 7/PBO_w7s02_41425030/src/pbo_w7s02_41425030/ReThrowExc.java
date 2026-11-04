/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s02_41425030;

/**
 *
 * @author ASUS
 */
class ReThrowExc {
    static void demoThrow() { 
        try { 
            System.out.println("I'm throwing an exception from demoThrow "
                     + "method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) { 
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }
    public static void main(String args[]) { 
        try{ 
            demoThrow();
        } catch (NullPointerException e) { 
            System.out.println("I'm catching the exception ["+ e + " ]\n" 
                     + "throw from demoThrow method");
        }
    }
}

/* 
a. Jika exception e tidak dilempar (rethrown) dari method demoThrow, apakah masih
akan di tangkap dari dalam main function?
Penjelasan: Tidak, exception tersebut tidak akan tertangkap di dalam fungsi main. 
ketika exception tertangkap oleh blok catch di dalam method demoThrow() dan tidak dilempar 
ulang menggunakan perintah throw e;, maka exception tersebut dianggap sudah selesai ditangani 
(resolved) di dalam method itu sendiri. Program akan menganggap eksekusi demoThrow() berjalan 
normal tanpa error hingga selesai, sehingga blok catch di dalam fungsi main tidak akan mendeteksi/menangkap apa pun.


b. Apa yang bisa Anda simpulkan dari kode program di atas?
Penjelasan: 
meneruskan (re-throwing) suatu exception yang sudah pernah ditangkap di dalam 
sebuah method agar bisa ditangkap kembali oleh pemanggil method tersebut.
Mekanisme ini berguna ketika ingin melakukan penanganan awal (seperti mencetak pesan/logging) di dalam method subrutin, 
tetapi tetap membiarkan method utama mengetahui dan menangani error tersebut secara lebih lanjut.


*/