/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425030
Nama: Cinta Tambunan 
Motto: Semangat belajar */

public class OperasiLanjutan {
        public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        int sisaBagi = angka1 % angka2; 
        int pangkat = (int) Math.pow(angka1, angka2); 
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + pangkat);
    }
}
