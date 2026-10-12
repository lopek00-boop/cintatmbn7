/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */
/* 
Nama: CINTA TAMBUNAN
NIM: 41425030 
Prodi: DIV TRPL 2025 
*/
public class VehicleRental {
    // Ubah semua atribut menjadi private untuk enkapsulasi data
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    // Constructor
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        if (rate > 0) {
            this.rentalRatePerDay = rate;
        } else {
            System.out.println("[Error] Tarif sewa per hari harus lebih besar dari 0!");
            this.rentalRatePerDay = 0;
        }
    }

    // Setter dengan validasi agar tidak menerima hari negatif
    public void setRentalDays(int days) {
        if (days > 0) {
            this.rentalDays = days;
        } else {
            System.out.println("[Error] Jumlah hari sewa tidak valid: " + days + " (Harus > 0)");
        }
    }

    // Getters
    public String getPlateNumber() { 
        return plateNumber; 
    }
    
    public double getRentalRatePerDay() { 
        return rentalRatePerDay; 
    }
    
    public int getRentalDays() { 
        return rentalDays; 
    }

    // Method getTotalCost Standar (Tanpa Diskon)
    public double getTotalCost() {
        return rentalRatePerDay * rentalDays;
    }

    // Method getTotalCost dengan parameter Discountable (Polimorfisme)
    public double getTotalCost(Discountable discount) {
        double subtotal = getTotalCost();
        
        if (discount != null) {
            double discountAmount = discount.calculateDiscount(subtotal);
            return subtotal - discountAmount;
        }
        
        return subtotal;
    }
}

/* KODE SESUAI MODUL : 

Nama: CINTA TAMBUNAN
NIM: 41425030 
Prodi: DIV TRPL 2025 

public class VehicleRental {
 public String plateNumber;
 protected double rentalRatePerDay;
 private int rentalDays;
 double discountRate;
 public VehicleRental(String plateNumber, double rate) {
 this.plateNumber = plateNumber;
 this.rentalRatePerDay = rate;
 }
 public void setRentalDays(int days) {
 this.rentalDays = days;
 }
 public double getTotalCost() {
 return (rentalRatePerDay * rentalDays) -
 (rentalRatePerDay * rentalDays * discountRate);
 }
}
Penjelasan kenapa error ketika dijalankan dengan file TestRental.java? : 
1. method nya tidak ada jadi diTestRental.java memanggil : v.getTotalCost(member); // Menerima parameter objek diskon 
2. memanggil method public double getTotalCost() { ... } // Tidak menerima parameter sama sekali 
java tidak menemukan method tersebut yang bisa menerima parameter objek diskon, Java langsung mengirim pesan error cannot find symbol/method not found.
3. menggunakan atribut discountRate yang udah terpakai, kode: return (rentalRatePerDay * rentalDays) - (rentalRatePerDay * rentalDays * discountRate);
Variabel discountRate ini tidak pernah diisi nilainya (default-nya 0.0), dan rumusnya masih manual. 
Padahal di sistem baru, perhitungan diskon sudah diserahkan ke masing-masing objek diskon (MemberDiscount, FlashSaleDiscount, dll.) secara polimorfik.
4. Kalau dimasukkan angka negatif ke setRentalDays(-3), sistem lama akan langsung memprosesnya tanpa halangan, sehingga total biayanya bisa jadi minus/negatif.
5. Atribut seperti plateNumber masih public dan rentalRatePerDay masih protected, padahal prinsip OOP yang baik mewajibkan atribut bernilai sensitif dibuat private agar tidak bisa diubah sembarangan dari luar.
*/