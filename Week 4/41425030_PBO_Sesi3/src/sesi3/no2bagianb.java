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
public class no2bagianb {
    public static void main(String[] args) {
        // Simulasi Lampu Pintar
        SmartLamp lamp = new SmartLamp(80);
        lamp.turnOn(); 
        lamp.connectToWifi("Rumah_Indah_5G", "192.168.1.50"); 

        // Simulasi AC Pintar
        SmartAC ac = new SmartAC(22);
        ac.turnOn(); 
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51"); 
        ac.turnOff(); 
    }
}
