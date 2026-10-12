/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassingObjectinMethod;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/
class ObjectPassDemo {
    int a, b;

    ObjectPassDemo (int i, int j)
    {
        a = 1;
        b =j;
    }

    // Method
    boolean equalTo (ObjectPassDemo o)
    { 
        return (o.a == a && o.b == b) ;
    } 
} 

public class Main {

    public static void main(String args[]) {
        ObjectPassDemo obl = new ObjectPassDemo (100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo (100, 22) ;
        ObjectPassDemo ob3 = new ObjectPassDemo (-1, -1);

        System.out.println("obl == ob2: "
            + obl.equalTo(ob2));
        System.out.println("obl == ob3: "
            + obl.equalTo(ob3));
    } 
} 