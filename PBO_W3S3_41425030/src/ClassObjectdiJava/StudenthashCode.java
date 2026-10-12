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
public class StudenthashCode {
    int roll;

    @Override
    public int hashCode() {
        return roll;
    }

    public static void main(String[] args) {
        StudenthashCode s1 = new StudenthashCode();
        s1.roll = 101;

        StudenthashCode s2 = new StudenthashCode();
        s2.roll = 102;

        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
