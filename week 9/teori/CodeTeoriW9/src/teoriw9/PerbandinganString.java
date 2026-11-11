/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

/**
 *
 * @author ASUS
 */
public class PerbandinganString {
    public static void main(String[] args) {
        String a = "Del";
        String b = "Del";
        String c = new String("Del");

        System.out.println(a == b);         // true -> sama-sama di String Pool
        System.out.println(a == c);         // false -> objek baru di heap
        System.out.println(a.equals(c));    // true -> isi string sama
    }
}