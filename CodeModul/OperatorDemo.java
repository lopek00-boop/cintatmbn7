/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */

public class OperatorDemo {
    public static void main(String[] args) {
        // Hal.13: Arithmetic Operators 
        int sum = 3 + 4;
        int diff = 10 - 3;
        int prod = 7 * 3;
        double q = 20.0 / 3;
        int r = 7 % 3;

        //Hal. 14: Assignment & Math Utility
        int x = 10;
        x += 5; 
        double p = Math.pow(2, 3); 
        double s = Math.sqrt(64);  

        // Hal.15: Relational dan Logical Operators 
        int a = 5;
        boolean ok = (a == 5);
        boolean r1 = (5 > 3) && (7 < 10); 
        boolean r2 = (5 < 3) || (7 < 10); 
        boolean r3 = !(5 > 3);            

        // Hal.16: Bitwise Operators 
        int and = 5 & 3; 
        int or = 5 | 3;  
        int xor = 5 ^ 3; 
    }
}
