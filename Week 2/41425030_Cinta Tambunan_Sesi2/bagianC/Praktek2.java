/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianC;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
    /*
NIM: 41425030
Nama: Cinta Tambunan 
Motto: Semangat belajar */ 
public class Praktek2 {
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
        
        System.out.println("Modulus (Sisa Bagi): " + (a % b));
        System.out.println("Pangkat: " + (long) Math.pow(a, b));
    }
}

