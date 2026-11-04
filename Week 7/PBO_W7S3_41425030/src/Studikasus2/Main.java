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

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank();

        // Pengujian 1: Memicu JumlahTidakValidException (nominal bukan kelipatan 50rb)
        try {
            System.out.println("--- Pengujian 1 (Nominal Tidak Valid) ---");
            akun.tarikTunai(75000);
        } catch (JumlahTidakValidException e) {
            System.out.println("Penanganan Error [1]: " + e.getMessage());
        } catch (SaldoTidakCukupException e) {
            System.out.println("Penanganan Error [2]: " + e.getMessage());
        } finally {
            System.out.println("Sesi transaksi pertama selesai.\n");
        }

        // Pengujian 2: Memicu SaldoTidakCukupException (tarik melebihi saldo)
        try {
            System.out.println("--- Pengujian 2 (Saldo Tidak Cukup) ---");
            akun.tarikTunai(800000);
        } catch (JumlahTidakValidException e) {
            System.out.println("Penanganan Error [1]: " + e.getMessage());
        } catch (SaldoTidakCukupException e) {
            System.out.println("Penanganan Error [2]: " + e.getMessage());
        } finally {
            System.out.println("Sesi transaksi kedua selesai.");
        }
    }
}
