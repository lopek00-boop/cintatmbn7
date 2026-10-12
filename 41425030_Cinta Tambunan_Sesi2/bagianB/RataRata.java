/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB;

/**
 *
 * @author ASUS
 */
/*
NIM: 41425030
Nama: Cinta Tambunan 
Motto: Semangat belajar */

import java.util.Scanner;
    
public class RataRata {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();
        double RataRata = (nilai1 + nilai2 + nilai3) / 3.0; 
        System.out.printf("Rata-rata: %.2f\n", RataRata);
    }
}
