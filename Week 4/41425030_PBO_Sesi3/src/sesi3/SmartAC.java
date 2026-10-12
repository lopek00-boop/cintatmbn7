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
public class SmartAC implements Switchable, Connectable { 
    private boolean isOn = false; // Status sakelar (State Management)
    private int temperature;     // Enkapsulasi suhu

    public SmartAC(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C"); 
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("[AC Pintar] Dimatikan."); 
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // Logika State Management: Perangkat harus menyala
        if (isOn) {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")"); 
        } else {
            System.out.println("[Error] Perangkat dalam keadaan mati! Nyalakan terlebih dahulu."); 
        }
    }
}