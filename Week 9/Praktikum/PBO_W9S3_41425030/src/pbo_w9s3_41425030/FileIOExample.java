/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w9s3_41425030;

/**
 *
 * @author ASUS
 */
/*
import java.util.*;
import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "output.txt";
        
        // Tulis data ke file
        writeToFile(inputFile);
        
        // Baca data dari file
        readFromFile(inputFile);
        
        // Process dan tulis ke file baru
        processFile(inputFile, outputFile);
    }
    
    public static void writeToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Alice,25,Computer Science");
            writer.newLine();
            writer.write("Bob,30,Mathematics");
            writer.newLine();
            writer.write("Charlie,22,Physics");
            writer.newLine();
            writer.write("Diana,28,Chemistry");
            writer.newLine();
            
            System.out.println("Data berhasil ditulis ke " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
    
    public static void readFromFile(String filename) {
        System.out.println("\n=== MEMBACA FILE ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            
            System.out.println("File berhasil dibaca");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void processFile(String inputFile, String outputFile) {
        System.out.println("\n=== MEMPROSES FILE ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            writer.write("NAME,AGE,MAJOR,STATUS");
            writer.newLine();
            
            while ((line = reader.readLine()) != null) {
                // Split data berdasarkan koma
                String[] data = line.split(",");
                String name = data[0].toUpperCase();
                int age = Integer.parseInt(data[1]);
                String major = data[2];
                String status = (age > 25) ? "GRADUATE" : "UNDERGRADUATE";
                
                // Tulis data yang telah diproses
                String processedLine = String.format("%s,%d,%s,%s", name, age, major, status);
                writer.write(processedLine);
                writer.newLine();
                
                System.out.println("Processed: " + processedLine);
            }
            
            System.out.println("File berhasil diproses dan disimpan sebagai " + outputFile);
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
*/ 

/* 
Pertanyaan:
1. Apa keuntungan menggunakan try-with-resources?
Jawaban: 
memastikan bahwa setiap resource kayak BufferedReader, BufferedWriter,FileREader akan ditutup secara manual(close()) setelah 
blok try selesai dieksekusi, baik prosesnya berhasil maupun terjadi exception. ini mencegah terjadinya resource 
leak(kebocoran memori) tanpa perlu mengetik blok finally secara manual. 

2. Mengapa perlu menangani FileNotFoundException dan IOException secara terpisah?
Jawaban: 
Karena memberikan pesan error yang jauh lebih baik kepada pengguna, misalnya: memberitahu kepada siUser bahwa file 
memang tidak ada direktori, dibandingkan penanganan IOException yang bisa disebabkan oleh banyak faktor, misalnya: masalah 
izin akses/permission,disk penuh, dan lain-lain. 

3. Apa yang terjadi jika file data.txt sudah ada sebelum program dijalankan?
Jawaban: akan menimpa isi file lama dengan data yang baru dilakukan. ketika ingin menambahkan data tanpa menghapus data lama, dapat 
menggunakan constructor overload dengan parameter append yaitu new FileWriter(filename, true).
*/

/* 
Modifikasi:
~ Tambahkan exception handling untuk NumberFormatException
~ Buat method untuk membaca file dan menghitung rata-rata usia
~ Modifikasi program untuk menambahkan data baru ke file tanpa menghapus yang lama
*/

//Kode Modifikasi: 
import java.io.*;
import java.util.*;

public class FileIOExample {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "output.txt";

        writeToFile(inputFile, false);

        appendToFile(inputFile, "Eko, 35, Information Technology");

        readFromFile(inputFile);

        processFile(inputFile, outputFile);

        hitungRataRataUsia(inputFile);
    }

    public static void writeToFile(String filename, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, append))) {
            writer.write("Alice, 25, Computer Science");
            writer.newLine();
            writer.write("Bob, 30, Mathematics");
            writer.newLine();
            writer.write("Charlie, 22, Physics");
            writer.newLine();
            writer.write("Diana, 28, Chemistry");
            writer.newLine();
            System.out.println("Data berhasil ditulis ke " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Method untuk menambah data baru tanpa menghapus data lama
    public static void appendToFile(String filename, String newData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(newData);
            writer.newLine();
            System.out.println("Data baru berhasil ditambahkan (append) ke " + filename);
        } catch (IOException e) {
            System.out.println("Error appending file: " + e.getMessage());
        }
    }

    public static void readFromFile(String filename) {
        System.out.println("\n=== MEMBACA FILE ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            System.out.println("File berhasil dibaca");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void processFile(String inputFile, String outputFile) {
        System.out.println("\n=== MEMPROSES FILE ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            String line;
            writer.write("NAME, AGE, MAJOR, STATUS");
            writer.newLine();
            
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 3) continue; // Skip baris yang tidak valid
                
                try {
                    String name = data[0].trim().toUpperCase();
                    int age = Integer.parseInt(data[1].trim()); // Potensi NumberFormatException
                    String major = data[2].trim();
                    String status = (age > 25) ? "GRADUATE" : "UNDERGRADUATE";
                    
                    String processedLine = String.format("%s, %d, %s, %s", name, age, major, status);
                    writer.write(processedLine);
                    writer.newLine();
                    System.out.println("Processed: " + processedLine);
                } catch (NumberFormatException e) {
                    System.out.println("Format angka tidak valid pada baris: [" + line + "] -> " + e.getMessage());
                }
            }
            System.out.println("File berhasil diproses dan disimpan sebagai " + outputFile);
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }

    // Method untuk menghitung rata-rata usia dari file data
    public static void hitungRataRataUsia(String filename) {
        System.out.println("\n=== MENGHITUNG RATA-RATA USIA ===");
        int totalAge = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2) {
                    try {
                        int age = Integer.parseInt(data[1].trim());
                        totalAge += age;
                        count++;
                    } catch (NumberFormatException e) {
                   
                    }
                }
            }
            if (count > 0) {
                double average = (double) totalAge / count;
                System.out.println("Total Data Orang: " + count);
                System.out.println("Rata-rata Usia: " + average);
            } else {
                System.out.println("Tidak ada data usia yang valid.");
            }
        } catch (IOException e) {
            System.out.println("Error membaca file untuk rata-rata usia: " + e.getMessage());
        }
    }
}

