/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */
import java.util.Scanner; 

// Hal.24: Input atau  Output menggunakan Scanner
public class InputOutputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();         // Membaca input baris dari pengguna
        System.out.println("Halo, " + nama); // Menampilkan output
        sc.close();                          // Menutup scanner
    }
}
