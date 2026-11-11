/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

/**
 *
 * @author ASUS
 */
public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); 
        sb.append("World"); 
        sb.insert(5," , Java");
        System.out.println(sb); //Output: Hello, Java World
    }
}
