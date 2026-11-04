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

public class AkunBank {
    private double saldo = 500000; // Saldo awal Rp 500.000

    // Method mendeklarasikan beberapa 'throws' untuk beberapa custom exception sekaligus
    public void tarikTunai(double jumlahTarik) throws SaldoTidakCukupException, JumlahTidakValidException {
        System.out.println("Memproses penarikan tunai sebesar Rp " + jumlahTarik + "...");

        // Pengecekan 1: Jika nominal <= 0 atau bukan kelipatan 50.000
        if (jumlahTarik <= 0) {
            throw new JumlahTidakValidException("Penarikan ditolak: Nominal harus lebih besar dari Rp 0.");
        }
        if (jumlahTarik % 50000 != 0) {
            throw new JumlahTidakValidException("Penarikan ditolak: Nominal harus kelipatan Rp 50.000.");
        }

        // Pengecekan 2: Jika jumlah yang ditarik melebihi saldo
        if (jumlahTarik > saldo) {
            throw new SaldoTidakCukupException("Penarikan ditolak: Saldo tidak mencukupi (Sisa saldo: Rp " + saldo + ").");
        }
        
        saldo -= jumlahTarik;
        System.out.println("Penarikan berhasil! Sisa saldo Anda: Rp " + saldo);
    }
}
