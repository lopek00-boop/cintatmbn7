/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Challenge;

/**
 *
 * @author ASUS
 */
/* NIM: 41425030 
Nama: Cinta Tambunan 
Motto: Semangat Belajar 
*/
import java.util.Scanner;
public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor kartu: ");
        String input = scanner.nextLine().trim();
        if (input.contains("-")) {
            if (input.length() != 19 || input.charAt(4) != '-' || input.charAt(9) != '-' || input.charAt(14) != '-') {
                System.out.println("Nomor kartu tidak valid!");
                scanner.close();
                return;
            }
        }
        String cleanNumber = input.replace("-", "");
        if (cleanNumber.length() != 16 || !cleanNumber.matches("\\d+")) {
            System.out.println("Nomor kartu tidak valid!");
            scanner.close();
            return;
        }
        char firstDigit = cleanNumber.charAt(0);
        if (firstDigit != '4' && firstDigit != '5' && firstDigit != '6') {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");
            scanner.close();
            return;
        }
        System.out.println("Nomor kartu valid.");

        scanner.close();
    }
}
