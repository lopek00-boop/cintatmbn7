/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaraMembuatObjekdariSebuahClass;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author ASUS
 */

/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/  
class StudentSerializable implements Serializable {
    private String name;

    public StudentSerializable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
public class DeserializationDemo {
    public static void main(String[] args) {
        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(new StudentSerializable("Alice"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            StudentSerializable s = (StudentSerializable) in.readObject();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
