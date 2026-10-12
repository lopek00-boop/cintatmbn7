/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
//Define the circle class
public class Circle { //Save as "circle.java"
    //Private variables 
    double radius;
    private String color; 
    
    //Constructors (overloaded) 
    public Circle(){ //1st Constructor 
        radius = 1.0; 
        color = "red"; 
    }
    public Circle(double r){ //2nd COntructor
        radius = r; 
        color = "red"; 
    }
    public Circle(double r, String c){ //3rd Contructor 
        radius = r; 
        color = c;
    }
    //public methods 
    public double getRadius(){
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
