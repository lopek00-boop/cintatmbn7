/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

/**
 *
 * @author ASUS
 */
public class StringExample {
    public static void main(DemoString[] args) {
        DemoString nama = "Del";
        nama.concat("Institute of Technology");
        System.out.println(nama); // Output: Del (tidak berubah) 
        
        nama = nama.concat("Institute of Technology"); 
        System.out.println(nama);
    }
}
