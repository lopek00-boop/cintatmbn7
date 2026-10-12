/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi3;

/**
 *
 * @author ASUS
 */

/* 
Nama: CINTA TAMBUNAN
NIM: 41425030 
Prodi: DIV TRPL 2025 
*/
// PRAKTEK 1 - SISTEM KEAMANAN REKENING BANK
public class BankAccount {
    // Variabel private untuk enkapsulasi data agar tidak diakses langsung dari luar
    private String accountNumber;
    private double balance;

    // Konstruktor dengan validasi saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter untuk membaca nomor akun
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter untuk membaca saldo
    public double getBalance() {
        return balance;
    }

    // Mutator/Setter deposit dengan validasi nominal positif
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Mutator/Setter withdraw dengan validasi ketercukupan saldo
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("[Error] Jumlah penarikan harus lebih dari 0!");
        } else if (amount > balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!"); 
        } else {
            balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount); 
        }
    }
    
    public static void main(String[] args) { 
        BankAccount acc = new BankAccount("ACC-001", 500000);
        
        acc.deposit(-100000);
        acc.withdraw(700000);
        acc.withdraw(200000);
        
        System.out.println("Saldo akhir akun " + acc.getAccountNumber() + ": Rp" + acc.getBalance());
    }
}
