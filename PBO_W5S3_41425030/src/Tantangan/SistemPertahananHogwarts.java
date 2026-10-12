package Tantangan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

/* 
Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 
*/ 

import java.util.ArrayList;
import java.util.List;

// 1. Abstract Class MantraPerlindungan
abstract class MantraPerlindungan {
    private String namaMantra;

    public MantraPerlindungan(String namaMantra) {
        this.namaMantra = namaMantra;
    }

    public String getNamaMantra() {
        return namaMantra;
    }

    // Abstract methods yang wajib diimplementasikan oleh subclass
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2. Protego: saat diaktifkan, mencetak "Perisai Protego terbentuk!"
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("[" + getNamaMantra() + "] Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("[" + getNamaMantra() + "] Perisai Protego menghilang.");
    }
}

// 2. Fidelius: saat diaktifkan, membutuhkan penyihir yang menjadi secret keeper.
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        super("Fidelius Charm");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("[" + getNamaMantra() + "] Rahasia Hogwarts dilindungi dengan Secret Keeper: " + secretKeeper + "!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("[" + getNamaMantra() + "] Mantra Fidelius dicabut, rahasia tidak tersembunyi lagi.");
    }
}

// 2. MantraAntiApparition: mencegah apparition di area tertentu.
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        super("Mantra Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("[" + getNamaMantra() + "] Sihir Apparition dan Disapparition diblokir di area: " + area + "!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("[" + getNamaMantra() + "] Akses Apparition kembali diizinkan di area: " + area + ".");
    }
}

// 3. Kelas SistemPertahanan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    // tambahMantra(MantraPerlindungan mantra)
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Sistem Pertahanan: Mantra " + mantra.getNamaMantra() + " berhasil ditambahkan.");
    }

    // aktifkanSemuaMantra(): mengaktifkan semua mantra yang ada.
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== MENGAKTIFKAN SISTEM PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
        System.out.println("================================================\n");
    }

    // nonaktifkanSemuaMantra(): menonaktifkan semua mantra
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== MENONAKTIFKAN SISTEM PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
        System.out.println("=================================================\n");
    }
}

// 4. Main Class Demonstrasi
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        // Inisialisasi Sistem Pertahanan
        SistemPertahanan hogwartsDefense = new SistemPertahanan();

        // Membuat Objek Mantra Perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Seluruh Area Kastil Hogwarts");

        System.out.println("\n=== Pendaftaran Mantra Pertahanan ===");
        hogwartsDefense.tambahMantra(protego);
        hogwartsDefense.tambahMantra(fidelius);
        hogwartsDefense.tambahMantra(antiApparition);

        // Uji coba Mengaktifkan Semua Mantra
        hogwartsDefense.aktifkanSemuaMantra();

        // Uji coba Menonaktifkan Semua Mantra
        hogwartsDefense.nonaktifkanSemuaMantra();
    }
}
