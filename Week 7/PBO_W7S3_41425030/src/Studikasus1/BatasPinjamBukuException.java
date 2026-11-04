/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studikasus1;

/**
 *
 * @author ASUS
 */
/*
Nama: Cinta Tambunan
NIM: 41425030 
Prodi: D4 TRPL 
*/

// Mendeklarasikan kelas custom exception yang mewarisi kelas Exception (checked exception)
public class BatasPinjamBukuException extends Exception {
    
    // Constructor untuk menerima pesan error khusus
    public BatasPinjamBukuException(String pesan) {
        // Meneruskan pesan error ke constructor kelas induk (Exception)
        super(pesan);
    }
}