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

public class GenericsDemo {
    public static void main(DemoString[] args) {
        List<DemoString> l = new ArrayList<>();
        l.add("teks");
        
        // l.add(42); // Baris ini akan langsung memicu error kompilasi jika di-uncomment
        
        // Mengambil data tanpa perlu casting
        DemoString s = l.get(0); 
    }
}
