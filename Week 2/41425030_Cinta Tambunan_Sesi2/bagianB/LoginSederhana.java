/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB;

/**
 *
 * @author ASUS
 */
/*
NIM: 41425030
Nama: Cinta Tambunan
Motto: Semangat belajar
*/
import java.util.Scanner; 
public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        boolean adaAngka = password.matches(".*\\d.*");
        if (username.equals("admin") && password.length() >= 6 && adaAngka) {
        System.out.println("Login berhasil!");
        } else {
        System.out.println("Login gagal! Password tidak valid.");
        }
    }
}
