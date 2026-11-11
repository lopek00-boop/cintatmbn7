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
import java.io.*;
import java.util.*;

public class TextProcessor {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String processedFile = "processed.txt";
        String reportFile = "report.txt";

        // Buat file sumber contoh
        createSampleFile(sourceFile);

        // Process file: uppercase + statistics
        processTextFile(sourceFile, processedFile, reportFile);

        // Tampilkan report
        displayReport(reportFile);
    }

    public static void createSampleFile(String filename) {
        // Array teks ini disesuaikan persis dengan isi teks pada modul praktikum
        String[] sampleText = {
           "Java programming is fun and powerful.",
           "Streams and Files are important concepts.",
           "Exception handling makes code robust.",
           "String manipulation is frequently used.",
           "Practice makes perfect in programming."
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : sampleText) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Sample file created:" + filename);
        } catch (IOException e) {
            System.out.println("Error creating sample file:" + e.getMessage());
        }
    }

    public static void processTextFile(String inputFile, String outputFile, String reportFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
             BufferedWriter reportWriter = new BufferedWriter(new FileWriter(reportFile))) {
            
            String line;
            int totalLines = 0;
            int totalWords = 0;
            int totalChars = 0;
            Map<Character, Integer> charFrequency = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                totalLines++;

                // Process Line: convert to uppercase
                String processedLine = line.toUpperCase();
                writer.write(processedLine);
                writer.newLine();

                // Calculate statistics
                String[] words = line.split("\\s+");
                totalWords += words.length;
                totalChars += line.length();

                // Character frequency
                for (char c : line.toLowerCase().toCharArray()) {
                    if (Character.isLetter(c)) {
                        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                    }
                }
            }

            // Write report
            reportWriter.write("=== TEXT PROCESSING REPORT ===");
            reportWriter.newLine();
            reportWriter.write("Total Lines:" + totalLines);
            reportWriter.newLine();
            reportWriter.write("Total Words:" + totalWords);
            reportWriter.newLine();
            reportWriter.write("Total Characters: " + totalChars);
            reportWriter.newLine();
            reportWriter.write("Average Words per Line: " + (double) totalWords / totalLines);
            reportWriter.newLine();
            reportWriter.write("CHARACTER FREQUENCY:");
            reportWriter.newLine();

            // Sort characters by frequency
            List<Map.Entry<Character, Integer>> sortedChars = new ArrayList<>(charFrequency.entrySet());
            sortedChars.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            for (Map.Entry<Character, Integer> entry : sortedChars) {
                reportWriter.write(entry.getKey() + ": " + entry.getValue());
                reportWriter.newLine();
            }

            System.out.println("File processing completed!");
            System.out.println(" - Input: " + inputFile);
            System.out.println(" - Output: " + outputFile);
            System.out.println(" - Report: " + reportFile);

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }

    public static void displayReport(String reportFile) {
        System.out.println("\n=== PROCESSING REPORT ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(reportFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading report: " + e.getMessage());
        }
    }
}
*/

/* 
Pertanyaan:
1. Bagaimana cara kerja HashMap untuk menghitung frekuensi karakter?
Jawaban: 
menyimpan pasangan kunci-nilai (key-value), di mana key adalah karakter (Character) dan value adalah jumlah kemunculannya (Integer). 
Method charFrequency.getOrDefault(c, 0) mengecek apakah karakter c sudah ada di dalam map. 
jika sudah ada, ia mengambil nilai lamanya lalu ditambah 1, dan jika belum ada, ia mengembalikan nilai default 0 lalu ditambah 1.

2. Mengapa kita menggunakan \\s+ untuk split words daripada spasi biasa?
Jawaban: 
Karena menggunakan ini lebih aman dan akurat dibandingkan spasi biasa yang dapat menyebabllan elemen kosong 
didalam array hasil split apabila terdapat dua spasi/ lebih yang berdampingan didalam teks. 

3. Apa keuntungan menggunakan BufferedReader/BufferedWriter?
Jawaban: 
1. Meningkatkan Performa: Menggunakan buffer (memori sementara) sehingga mengurangi akses fisik langsung ke disk dan membuat proses baca/tulis jauh lebih cepat.
2. Kemudahan Membaca Baris: Menyediakan method readLine() untuk membaca file teks baris demi baris dengan mudah.
3. Menghemat Waktu Proses: Meminimalkan jeda waktu eksekusi (latency) dalam transfer data.
*/

import java.io.*;
import java.util.*;

public class TextProcessor {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String processedFile = "processed.txt";
        String reportFile = "report.txt";
        String csvFile = "data_mahasiswa.csv";
        String csvReportFile = "csv_summary.txt";

        // 1. Buat File sumber contoh
        createSampleFile(sourceFile);

        // 2. Process file: uppercase + statistics (Modifikasi soal mudah & sedang dimasukkan di sini)
        processTextFile(sourceFile, processedFile, reportFile);

        // 3. Tampilkan report utama
        displayReport(reportFile);

        // 4. Tugas Modifikasi Sulit: Proses file CSV dan buat summary statistics
        createSampleCsvFile(csvFile);
        processCsvFile(csvFile, csvReportFile);
        displayReport(csvReportFile);
    }

    public static void createSampleFile(String filename) {
        String[] sampleText = {
            "Java programming is fun and powerful.",
            "Streams and Files are important concepts.",
            "Exception handling makes code robust.",
            "String manipulation is frequently used.",
            "Practice makes perfect in programming."
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : sampleText) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Sample file created: " + filename);
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }
    }

    public static void processTextFile(String inputFile, String outputFile, String reportFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
             BufferedWriter reportWriter = new BufferedWriter(new FileWriter(reportFile))) {
            
            String line;
            int totalLines = 0;
            int totalWords = 0;
            int totalChars = 0;
            int totalSentences = 0; // MODIFIKASI MUDAH: Menghitung jumlah kalimat
            
            Map<Character, Integer> charFrequency = new HashMap<>();
            Map<String, Integer> wordFrequency = new HashMap<>(); // MODIFIKASI SEDANG: Frekuensi kata

            while ((line = reader.readLine()) != null) {
                totalLines++;
                
                // Process Line: convert to uppercase
                String processedLine = line.toUpperCase();
                writer.write(processedLine);
                writer.newLine();
                
                // Calculate statistics
                String[] words = line.split("\\s+");
                totalWords += words.length;
                totalChars += line.length();

                // Hitung jumlah kalimat berdasarkan tanda titik '.'
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '.') {
                        totalSentences++;
                    }
                }
                
                // Character frequency
                for (char c : line.toLowerCase().toCharArray()) {
                    if (Character.isLetter(c)) {
                        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                    }
                }

                // Word frequency (MODIFIKASI SEDANG)
                for (String w : words) {
                    // Bersihkan tanda baca dari kata
                    String cleanW = w.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!cleanW.isEmpty()) {
                        wordFrequency.put(cleanW, wordFrequency.getOrDefault(cleanW, 0) + 1);
                    }
                }
            }

            // Cari kata yang paling sering muncul (MODIFIKASI SEDANG)
            String mostFrequentWord = "-";
            int maxWordCount = 0;
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                if (entry.getValue() > maxWordCount) {
                    maxWordCount = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }

            // Write report
            reportWriter.write("=== TEXT PROCESSING REPORT ===");
            reportWriter.newLine();
            reportWriter.write("Total Lines: " + totalLines);
            reportWriter.newLine();
            reportWriter.write("Total Sentences: " + totalSentences); // Output Modifikasi Mudah
            reportWriter.newLine();
            reportWriter.write("Total Words: " + totalWords);
            reportWriter.newLine();
            reportWriter.write("Total Characters: " + totalChars);
            reportWriter.newLine();
            reportWriter.write("Average Words per Line: " + ((double) totalWords / totalLines));
            reportWriter.newLine();
            reportWriter.write("Most Frequent Word: " + mostFrequentWord + " (" + maxWordCount + " times)"); // Output Modifikasi Sedang
            reportWriter.newLine();
            reportWriter.newLine();
            
            reportWriter.write("CHARACTER FREQUENCY:");
            reportWriter.newLine();
            
            // Sort characters by frequency
            List<Map.Entry<Character, Integer>> sortedChars = new ArrayList<>(charFrequency.entrySet());
            sortedChars.sort((a, b) -> b.getValue().compareTo(a.getValue()));
            for (Map.Entry<Character, Integer> entry : sortedChars) {
                reportWriter.write(entry.getKey() + ": " + entry.getValue());
                reportWriter.newLine();
            }

            System.out.println("File processing completed!");
            System.out.println(" - Input: " + inputFile);
            System.out.println(" - Output: " + outputFile);
            System.out.println(" - Report: " + reportFile);

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }

    public static void displayReport(String reportFile) {
        System.out.println("\n=== DISPLAYING: " + reportFile + " ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(reportFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading report: " + e.getMessage());
        }
    }

    // --- TUGAS MODIFIKASI SULIT: Pemrosesan CSV dan Summary Statistics ---
    public static void createSampleCsvFile(String filename) {
        String[] csvData = {
            "Name,Age,Score,Major",
            "Alice,20,85,TRPL",
            "Bob,22,90,Informatika",
            "Charlie,21,78,TRPL",
            "Diana,23,95,Sistem Informasi",
            "Eko,20,88,Informatika"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : csvData) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("\nSample CSV file created: " + filename);
        } catch (IOException e) {
            System.out.println("Error creating CSV file: " + e.getMessage());
        }
    }

    public static void processCsvFile(String csvFilename, String reportFilename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(reportFilename))) {
            
            String line;
            int totalRecords = 0;
            int sumAge = 0;
            double sumScore = 0;
            double maxScore = Double.MIN_VALUE;
            double minScore = Double.MAX_VALUE;
            String topStudent = "";

            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue; // Lewati baris header CSV
                }

                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    totalRecords++;
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    double score = Double.parseDouble(parts[2].trim());

                    sumAge += age;
                    sumScore += score;

                    if (score > maxScore) {
                        maxScore = score;
                        topStudent = name;
                    }
                    if (score < minScore) {
                        minScore = score;
                    }
                }
            }

            // Tulis ringkasan statistik CSV ke file report
            writer.write("=== CSV SUMMARY STATISTICS REPORT ===");
            writer.newLine();
            writer.write("Total Records: " + totalRecords);
            writer.newLine();
            writer.write("Average Age: " + (totalRecords > 0 ? (double) sumAge / totalRecords : 0));
            writer.newLine();
            writer.write("Average Score: " + (totalRecords > 0 ? sumScore / totalRecords : 0));
            writer.newLine();
            writer.write("Highest Score: " + maxScore + " (Achieved by " + topStudent + ")");
            writer.newLine();
            writer.write("Lowest Score: " + minScore);
            writer.newLine();

            System.out.println("CSV processing and summary generation completed!");

        } catch (IOException e) {
            System.out.println("Error processing CSV: " + e.getMessage());
        }
    }
}
