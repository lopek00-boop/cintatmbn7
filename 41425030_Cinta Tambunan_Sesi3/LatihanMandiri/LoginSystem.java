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
Nama:Cinta Tambunan 
Motto: Semangat Belajar 
*/ 
import java.util.Scanner; 
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String VALID_USERNAME = "admin";
        final String VALID_PASSWORD = "password123";
        int maxAttempts = 3;
        boolean isSuccess = false;

        System.out.println("=== Sistem Login ===");
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Percobaan " + attempt + ":");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            
            boolean hasDigit = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break;
                }
            }
            if (password.length() < 8 || !hasDigit) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.\n");
            } 
            else if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                System.out.println("Login berhasil!");
                isSuccess = true;
                break; 
            } 
            else {
                System.out.println("Login gagal! Password salah.\n");
            }
        } 
        if (!isSuccess) {
            System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
        }
        scanner.close();
    } 
}
