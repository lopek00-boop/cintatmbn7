/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterdanSetter;

/**
 *
 * @author ASUS
 */
/* Nama: Cinta Tambunan 
NIM: 41425030 
Prodi: DIV TRPL 2025
*/ 
/* Contoh 2: */ 
class GetSet {
    private int num;
    // Method 1 - Setter
    public void setNumber (int number)
    { 
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException ();
        } 
        num = number;
    } 
    
    // Method 2 - Getter
    public int getNumber() { return num; }
} 
class GFG {
    public static void main(String[] args)
    { 
        GetSet obj = new GetSet ();
        obj.setNumber (5) ;
        System.out.println (obj.getNumber ()) ;
    } 
}