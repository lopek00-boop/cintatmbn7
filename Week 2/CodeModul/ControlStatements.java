/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeModul;

/**
 *
 * @author ASUS
 */
public class ControlStatements {
 public static void main(String[] args) {
        // Hal.18: Control Statement IF ELSE
        int age = 15;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Hal.18: Control Statement IF,ELSE IF,ELSE
        int marks = 75;
        if (marks >= 85) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // Hal.19: Switch Statement
        int month = 8;
        String name;
        switch (month) {
            case 1: name = "January"; break;
            case 8: name = "August"; break;
            default: name = "Invalid"; break;
        }

        // Hal.20: While Loop
        int i = 1;
        while (i <= 3) {
            i++;
        }

        // Hal.20: Do-While Loop
        int j = 1;
        do {
            j++;
        } while (j <= 3);

        // Hal.21: For Loop dan Enhanced For Loop
        for (int k = 1; k <= 3; k++) {}

        int[] nums = {10, 20, 30};
        for (int n : nums) {}

        // Hal. 22: Branching Statement, Break
        int[] arr = {32, 87, 3, 589, 12};
        int target = 12;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                break; 
            }
        }

        // Hal. 23: Branching Statement, Continue
        String str = "peter piper picked...";
        int countP = 0;
        for (int idxStr = 0; idxStr < str.length(); idxStr++) {
            if (str.charAt(idxStr) != 'p') continue; // Melompati iterasi jika bukan huruf 'p'
            countP++;
        }
    }
}
