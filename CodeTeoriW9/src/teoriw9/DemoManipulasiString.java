/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

/**
 *
 * @author ASUS
 */
public class DemoManipulasiString {
    public static void main(String[] args) {
        String nama = "Del Institute"; 
        // "Metode substring() digunakan saat ingin memecah data dari file, seperti membaca kolom tertentu dalam teks CSV."
        
        System.out.println(nama.substring(0, 3)); // Output: Del
        System.out.println(nama.toUpperCase());   // Output: DEL INSTITUTE
        System.out.println(nama.equals("del"));   // Output: false
    }
}