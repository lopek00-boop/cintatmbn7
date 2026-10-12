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
public class StudentToString {
    @Override
    public String toString() {
        return "Student object";
    }

    public static void main(String[] args) {
        StudentToString s = new StudentToString(); // membuat objek Student
        System.out.println(s.toString());           // memanggil toString()
    }
}
