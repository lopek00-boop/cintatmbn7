/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/
public class StudentHashCode {
    int roll;

    @Override
    public int hashCode() {
        return roll;
    }

    public static void main(String[] args) {
        StudentHashCode s1 = new StudentHashCode();
        s1.roll = 101;

        StudentHashCode s2 = new StudentHashCode();
        s2.roll = 102;

        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
