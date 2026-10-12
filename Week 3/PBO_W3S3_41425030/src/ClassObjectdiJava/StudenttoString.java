/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava;

/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/
public class StudenttoString {
    @Override
    public String toString() {
        return "Student object";
    }

    public static void main(String[] args) {
        StudenttoString s = new StudenttoString(); // membuat objek Student
        System.out.println(s.toString());           // memanggil toString()
    }
}
