/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
/*
NIM: 41425030
Nama: Cinta Tambunan 
Motto: Semangat belajar */ 
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.print("Masukkan suhu dalam Celsius: ");
    double c = input.nextDouble();
    double fResult = (c * 9.0 / 5.0) + 32;
    System.out.printf("%.1f C = %.1f F\n", c, fResult);
    System.out.print("Masukkan suhu dalam Fahrenheit: ");
    double f = input.nextDouble();
    double cResult = (f - 32) * 5.0 / 9.0;
    System.out.printf("%.1f F = %.2f C\n", f, cResult);
    }
}