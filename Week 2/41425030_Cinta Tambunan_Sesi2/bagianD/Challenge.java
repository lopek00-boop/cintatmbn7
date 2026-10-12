/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianD;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
/*
Nama    : Cinta Tambunan
NIM     : 41425030
Motto: Semangat Belajar
*/
public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = input.nextLine().toLowerCase().replace(" ", "");
        String reverse = new StringBuilder(kata).reverse().toString();
        System.out.println(kata.equals(reverse) ? kata + " adalah palindrome" : kata + " bukan palindrome");
        int vokal = 0;
        for (char c : kata.toCharArray()) {
            if ("aiueo".indexOf(c) != -1) {
                vokal++;
            }
        }
        System.out.println("Jumlah huruf vokal: " + vokal);
    }
}

