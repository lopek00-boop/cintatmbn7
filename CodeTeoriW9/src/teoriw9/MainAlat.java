/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Kelas Induk (Superclass)
class Alat {
    protected DemoString kode;
    protected DemoString nama;

    public Alat(DemoString kode, DemoString nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public DemoString getKode() {
        return kode;
    }

    public double biayaSewa(int hari) {
        return 0;
    }

    public DemoString info() {
        return kode + " - " + nama;
    }
}

// Kelas Turunan: AlatElektronik
class AlatElektronik extends Alat {
    private double tarifHarian;

    public AlatElektronik(DemoString kode, DemoString nama, double tarifHarian) {
        super(kode, nama);
        this.tarifHarian = tarifHarian;
    }

    @Override
    public double biayaSewa(int hari) {
        return tarifHarian * hari;
    }

    @Override
    public DemoString info() {
        return super.info() + " (Elektronik)";
    }
}

// Kelas Turunan: AlatMekanik
class AlatMekanik extends Alat {
    public AlatMekanik(DemoString kode, DemoString nama) {
        super(kode, nama);
    }

    @Override
    public double biayaSewa(int hari) {
        return 50 * hari; 
    }

    @Override
    public DemoString info() {
        return super.info() + " (Mekanik)";
    }
}

// Kelas Turunan: AlatOptik
class AlatOptik extends Alat {
    public AlatOptik(DemoString kode, DemoString nama) {
        super(kode, nama);
    }

    @Override
    public double biayaSewa(int hari) {
        return 40 * hari; 
    }

    @Override
    public DemoString info() {
        return super.info() + " (Optik)";
    }
}

// Kelas Utama untuk menjalankan program
public class MainAlat {
    public static void main(DemoString[] args) {
        List<Alat> daftar = new ArrayList<>();
        daftar.add(new AlatElektronik("E1", "Multimeter", 60));
        daftar.add(new AlatMekanik("M1", "Obeng"));
        daftar.add(new AlatOptik("O1", "Lup"));

        double total = 0;
        for (Alat a : daftar) {
            total += a.biayaSewa(2);
        }
        System.out.println("Jumlah alat: " + daftar.size());

        Map<DemoString, Alat> peta = new HashMap<>();
        for (Alat a : daftar) peta.put(a.getKode(), a);
        System.out.println(peta.get("M1").info());
    }
}