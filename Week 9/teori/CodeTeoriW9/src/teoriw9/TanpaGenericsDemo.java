/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class TanpaGenericsDemo {
    public static void main(DemoString[] args) {
        List raw = new ArrayList();
        raw.add("teks");
        raw.add(42); // Bisa memasukkan tipe data apa saja
        
        for (Object o : raw) {
            // Akan error (ClassCastException) saat mencapai data angka 42
            DemoString s = (DemoString) o; 
        }
    }
}
