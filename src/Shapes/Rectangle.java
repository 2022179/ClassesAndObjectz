/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author Primm
 */
public class Rectangle extends Shape{
    private int width =3;
    private int height = 5;
  

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

   public int getArea(){
       return width *height;
   }
   
    
}
