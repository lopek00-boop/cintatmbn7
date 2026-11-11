/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w9s3_41425030;

/**
 *
 * @author ASUS
 */
// Nama: Cinta Tambunan 
//NIM: 41425030 
//Prodi: D4 Teknologi Rekayasa Perangkat Lunak 

/*
import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        String text = "Hello World! Welcome to Java Programming";
        
        System.out.println("=== BASIC STRING OPERATIONS ===");
        System.out.println("Original: '" + text +"'");
        System.out.println("Length:" + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Uppercase: '" + text.toUpperCase() + "'");
        System.out.println("Lowercase: '" + text.toLowerCase() + "'");
        
        // Substring dan indexing
        System.out.println("\n=== SUBSTRING & INDEXING ===");
        System.out.println("Character at index 5: '" + text.charAt(5) + "'");
        System.out.println("Substring (7-12): '" + text.substring(7, 12) + "'");
        System.out.println("Index of 'World': " + text.indexOf("World"));
        System.out.println("Last index of 'a': " + text.lastIndexOf("a"));
        
        // Replacement dan comparison
        System.out.println("\n=== REPLACEMENT & COMPARISON ===");
        System.out.println("Replace 'Java' with 'Python': '" +
                text.replace("Java", "Python") + "'");
        System.out.println("Contains 'Programming': " + text.contains("Programming"));
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello"));
        System.out.println("Ends with 'Programming': " + text.endsWith("Programming"));
        
        // Split dan join
        System.out.println("\n=== SPLIT & JOIN ===");
        String[] words = text.trim().split(" ");
        System.out.println("Number of words: " + words.length);
        System.out.print("Words: ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
        
        // StringBuilder untuk efisiensi
        System.out.println("\n=== STRING BUILDER ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" Programming");
        sb.insert(0, "Learn ");
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
    }
}
*/ 

/* Pertanyaan: 
1. Mengapa startsWith("Hello") mengembalikan false?
Jawaban: karena diKode teks didefinisikan sebagai String text = " Hello World! Welcome to Java Programming "; 
dimana ada spasi diawal string. Metode startWith("Hello") mengecek apakah string tadi diawali dengan kata 
"Hello" secara sama tanpa mengabaikan spasi didepannya. kearena karakter pertamanya itu spasi, jadi text.startsWith("Hello") bernilai false. 

2. Apa perbedaan antara String dan StringBuilder?
Jawaban: 
String : Tidak Mutable(Tidak dapat diubah), Thread-Safe nya aman, Kinerjanya Lambat jika sering diubah, kegunaannya sebagai teks konstan. 
StringBuilder: Mutable(dapat diubah), Thread-Safe nya Aman, Kinerjanya Paling cepat, kegunaannya Program single-thread(mengeksekusi perintah satu persatu, tanpa melakukan banyak hal secara bersamaan) 

3. Bagaimana cara mengambil hanya kata "Java" dari string tersebut?
Jawaban: 
menggunakan method substring() dengan menentukan indeks awal dan akhir kata "Java" dalam teks, atau menggunakan method indexOf("Java")
int startIndex = text.indexOf("Java");
String wordJava = text.substring(startIndex, startIndex + 4);
*/

/* 
Modifikasi:
~ Ubah kode untuk menampilkan hanya kata-kata yang panjangnya lebih dari 4 karakter
~ Buat method untuk menghitung jumlah huruf vokal dalam string
*/

//Kode Modifikasi : 
import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        String text = " Hello World! Welcome to Java Programming ";
        System.out.println("=== BASIC STRING OPERATIONS ===");
        System.out.println("Original: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Uppercase: '" + text.toUpperCase() + "'");
        System.out.println("Lowercase: '" + text.toLowerCase() + "'");

        // Substring dan indexing
        System.out.println("\n=== SUBSTRING & INDEXING ===");
        System.out.println("Character at index 5: '" + text.charAt(5) + "'");
        System.out.println("Substring (7-12): '" + text.substring(7, 12) + "'");
        System.out.println("Index of 'World': " + text.indexOf("World"));
        System.out.println("Last index of 'a': " + text.lastIndexOf("a"));

        // Replacement dan comparison
        System.out.println("\n=== REPLACEMENT & COMPARISON ===");
        System.out.println("Replace 'Java' with 'Python': '" + text.replace("Java", "Python") + "'");
        System.out.println("Contains 'Programming': " + text.contains("Programming"));
        // Menggunakan trim() agar pengecekan awalan akurat karena ada spasi di awal
        System.out.println("Starts with 'Hello': " + text.trim().startsWith("Hello"));
        System.out.println("Ends with 'Programming': " + text.trim().endsWith("Programming"));

        // Split dan join
        System.out.println("\n=== SPLIT & JOIN ===");
        String[] words = text.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
        System.out.print("Words: ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        // MODIFIKASI 1: Menampilkan kata dengan panjang > 4 karakter
        System.out.println("\n=== KATA DENGAN PANJANG > 4 KARAKTER ===");
        for (String word : words) {
            // Hilangkan tanda baca jika ada (misal: "World!")
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > 4) {
                System.out.print("[" + cleanWord + "] ");
            }
        }
        System.out.println();

        // MODIFIKASI 2: Menghitung jumlah huruf vokal
        int vowelCount = hitungVokal(text);
        System.out.println("Jumlah huruf vokal dalam teks: " + vowelCount);

        // StringBuilder untuk efisiensi
        System.out.println("\n=== STRING BUILDER ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" Programming");
        sb.insert(0, "Learn ");
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
    }

    // Method untuk menghitung jumlah huruf vokal
    public static int hitungVokal(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}