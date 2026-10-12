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
public class StudentEquals {
    int roll;

    @Override
    public boolean equals(Object o) {
        if (o instanceof StudentEquals) {
            return this.roll == ((StudentEquals) o).roll;
        }
        return false;
    }

    public static void main(String[] args) {
        StudentEquals s1 = new StudentEquals();
        s1.roll = 101;

        StudentEquals s2 = new StudentEquals();
        s2.roll = 101;

        StudentEquals s3 = new StudentEquals();
        s3.roll = 102;

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}
