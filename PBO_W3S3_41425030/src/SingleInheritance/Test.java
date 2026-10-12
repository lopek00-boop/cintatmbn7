/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/ 
// Superclass
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
// sub class 
class Car extends Vehicle { 
    Car() { 
        System.out.println("This Vehicle is Car");
    }
}
public class Test {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}
