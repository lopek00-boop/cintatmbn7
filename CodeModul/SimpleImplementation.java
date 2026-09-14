/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */
// Hal.25: Simple Implementation 
public class SimpleImplementation {
    public static void main(String[] args) {
        int[] nilai = {80, 90, 75, 88}; // Data nilai
        int total = 0;

        //Enhanced for loop untuk menjumlahkan semua nilai
        for (int n : nilai) {
            total += n;
        }

        //Menghitung rata-rata dengan explicit casting ke double
        double rata = (double) total / nilai.length;
        System.out.println("Rata-rata = " + rata);
    }
}
