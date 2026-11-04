/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studikasus2;

/**
 *
 * @author ASUS
 */

/*
Nama: Cinta Tambunan
NIM: 41425030 
Prodi: D4 TRPL 
*/

// Custom exception kedua untuk menangani nominal tarikan yang tidak valid/bukan kelipatan
public class JumlahTidakValidException extends Exception {
    public JumlahTidakValidException(String pesan) {
        super(pesan);
    }
}
