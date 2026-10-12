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

public class GanjilGenap {
        public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        if (bilangan % 2 ==0){
            System.out.println(bilangan + " adalah bilangan Genap");
        }else {
            System.out.println(bilangan + "adalah bilangan Ganjil");
        }
        }
}
