/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri;

/**
 *
 * @author ASUS
 */
/* NIM: 41425030 
Nama: Cinta Tambunan 
Motto: Semangat Belajar 
*/
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[100]; 
        int itemCount = 0;
        boolean running = true;
        while (running) {
            System.out.println("=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan item: ");
                    String newItem = scanner.nextLine();
                    if (itemCount < items.length) {
                        items[itemCount] = newItem;
                        itemCount++;
                        System.out.println(newItem + " berhasil ditambahkan!");
                    } else {
                        System.out.println("Daftar belanjaan sudah penuh!");
                    }
                    break;
                case 2:
                    System.out.print("Hapus item pada posisi: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    if (pos >= 1 && pos <= itemCount) {
                        String removedItem = items[pos - 1];
                        for (int i = pos - 1; i < itemCount - 1; i++) {
                            items[i] = items[i + 1];
                        }
                        items[itemCount - 1] = null;
                        itemCount--;
                        System.out.println(removedItem + " berhasil dihapus!");
                    } else {
                        System.out.println("Posisi tidak valid!");
                    }
                    break;
                case 3:
                    if (itemCount == 0) {
                        System.out.println("Daftar belanjaan kosong.");
                    } else {
                        System.out.println("Daftar belanja:");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println((i + 1) + ". " + items[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Cari item: ");
                    String searchItem = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (items[i].equalsIgnoreCase(searchItem)) {
                            System.out.println(items[i] + " ditemukan pada posisi " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(searchItem + " tidak ditemukan dalam daftar.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
