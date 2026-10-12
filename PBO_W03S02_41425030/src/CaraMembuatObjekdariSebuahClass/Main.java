/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaraMembuatObjekdariSebuahClass;

/**
 *
 * @author ASUS
 */

/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/  

class Student { 
    public Student() {}
}
public class Main {
    public static void main(String[] args) {
        try {
            Class <?> c = Class.forName("Student") ;
            Student s2 = (Student) c.getDeclaredConstructor() .newInstance();
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
