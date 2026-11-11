/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

import java.io.*;

public class ReadCharacter {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ketik karakter, 'q' untuk keluar:");
        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != 'q');
    }
}