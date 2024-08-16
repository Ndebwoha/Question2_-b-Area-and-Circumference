/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class Circle_02 {
    private double radius;
    private final double PI = 22.0/7.0;
    
   // Constructor
    public Circle_02(double radius) {
        this.radius = radius;
    }
    // Method to calculate area
    public double calculateArea() {
        return PI * radius * radius;
    }
    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}
    
    

