/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */
public class TipeDatadanVariabel {
    // Hal.6:Instance Variables 
    int speed; 

    // Hal.6:Class Variables 
    static int jumlahMahasiswa;

    // Hal.6:Parameterss
    void setNama(String nama) {
        this.nama = nama;
    }

    // Hal.6: Local Variables 
    void hitung() {
        int count = 0; 
    }
    String nama;

    public static void main(String[] args) {
        // Hal.6 dan 7: Primitive Data Type
        int umur = 20;               // Tipe data integer
        double gaji = 3500000.50;    // Tipe data double 
        boolean lulus = true;        // Tipe data boolean
        String nama = "Budi";        // Objek untuk teks

        // Hal.11 dan 12: String Methods
        nama.length();                
        nama.toUpperCase();           
        nama.equals("Budi");         

        // Hal. 14: Type Casting
        int myInt = 9;
        double myDouble = myInt; //otomatis

        // Hal.14: Explicit Casting 
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // hasil 9. .78 hilang 
    }
}
