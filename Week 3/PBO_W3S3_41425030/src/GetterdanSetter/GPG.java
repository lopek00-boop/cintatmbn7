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
/* Contoh 1: */ 
class GetSet { 
    private String name;
    
    //Method 1 - Getter 
    public String getName() { return name; } 
    
    //Metod 2 - Setter 
    public void setName(String N)
    { 
        this.name = N;
    }
}
class GPG {
    public static void main(String[] args)
    { 
        GetSet obj = new GetSet();
        
        obj.setName("Geeks for Geeks");
        System.out.println(obj.getName());
    }
}
