/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author Primm
 */
public class Circle extends Shape{
    private final double radius = 3.14;
    private final double diameter = 7.5;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
        }
        
    public double getCircumference(){
        return radius * diameter;// added this line to calculate the circles circumference
    }
    }

