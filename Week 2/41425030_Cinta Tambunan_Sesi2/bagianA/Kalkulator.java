/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianA;

/**
 *
 * @author ASUS
 */
/*
NIM: 41425030
Nama: Cinta Tambunan 
Motto: Semangat belajar */ 

import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}

//Pertanyaan Pemantik: 
// Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int? 
/* Penjelasan: Casting dari double keint akan memotong angka dibelakang koma,
bukan membulatkan angka tersebut.*/

//Praktek 2: Mengapa pembagian int perlu dicasting kedouble? 
/*Penjelasan: Pembagian dua bilangan int pada java akan menghasilkan bilangan 
bulat dan membuang sisanya[cite:1]. dimana casting kedouble dilakukan agar 
hasil pembagian memiliki angka yang desimal*/

//Praktek 3: Apa risiko jika pembagi =0? 
/*Penjelasan:Program akan mengalami runtime error dan program akan berhenti 
secara tiba-tiba*/ 