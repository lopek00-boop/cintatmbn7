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
// Kelas SmartLamp wajib punya fungsi dari Switchable (on/off) dan Connectable (wifi)
public class SmartLamp implements Switchable, Connectable { 
    // Status awal lampu mati (false) dan tingkat kecerahan yang disembunyikan (private)
    private boolean isOn = false; // Status sakelar (State Management)
    private int brightness;       // Enkapsulasi kecerahan
    // Konstruktor buat ngeset tingkat kecerahan pas lampu pertama kali dibuat
    public SmartLamp(int brightness) {
        this.brightness = brightness;
    }
    // Fungsi buat menyalakan lampu
    @Override
    public void turnOn() {
        // Mengubah status lampu jadi nyala
        this.isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%"); 
    }
    // Fungsi buat mematikan lampu
    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }
    // Fungsi buat menyambungkan lampu ke WiFi
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Cek dulu: wifi cuma bisa tersambung kalau lampunya lagi nyala
        if (isOn) {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")"); 
        } else {
            // Kalau lampunya masih mati, tampilkan pesan error
            System.out.println("[Error] Perangkat dalam keadaan mati! Nyalakan terlebih dahulu."); 
        }
    }
}
