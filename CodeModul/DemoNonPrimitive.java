/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */

//Hal.8:Class dan atributes  
class Demo {
    int a, b; //atribut
    //constructor
    Demo(int a, int b){ this.a = a; this.b = b;}
    //method menjumlahkan 
    int addition() {return a + b;}
} 
//hal.9: interface, tanpa implementasi
interface Operasi {
    int tambah(int a, int b);
}
//hal.9 : implementation, yang mengimplementasikan interface
class Kalkulator implements Operasi {
    public int tambah(int a, int b) { 
        return a + b; 
    }
}
public class DemoNonPrimitive {
    public static void main(String[] args) {
        //hal.8:menginisialisasi oobjek dari class demo 
        Demo d = new Demo(5, 10);
        d.addition();

        // Hal.9: Menginisialisasi objek dari class Kalkulator
        Kalkulator k = new Kalkulator();
        k.tambah(3, 4);

        // Hal.8: String (Objek khusus untuk teks)
        String s1 = "Hello";
        String s2 = new String("Java");

        // Hal.9: Array (Koleksi elemen bertipe sama)
        int[] arr = {1, 2, 3};
        double[] arr2 = {1.1, 2.2};
    }
}
