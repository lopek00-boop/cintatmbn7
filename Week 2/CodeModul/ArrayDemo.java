/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // Hal.10: Array 1D, Deklarasi dan Alokasi Memori
        int[] anArray;
        anArray = new int[10];

        //Inisialisasi elemen berdasarkan indeks
        anArray[0] = 100;
        anArray[1] = 200;

        // Shortcut inisialisasi array
        int[] anArrayShortcut = {100, 200, 300, 400};

        // Hal.11: Multidimensional Array  
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        //Mengakses elemen array multidimensi
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
    }
        
}
