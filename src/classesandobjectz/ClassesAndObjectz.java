/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjectz;

import Shapes.Rectangle;
import Shapes.Triangle;

/**
 *
 * @author Primm
 */
public class ClassesAndObjectz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle tri1 = new Triangle();
        
        Triangle tri2 = new Triangle();
        
        Triangle tri3 = new Triangle();
        
        Triangle tri4 = new Triangle();
        
        Triangle tri5 = new Triangle();
        
        Triangle tri6 = new Triangle();
        
        int[]sideLengths = new int [18];
        // the lengths of tri1 sides will be first and the the lwngths of tril2 side will be sides etc
        
        sideLengths[0]= 5;
        sideLengths[1]= 8;
        sideLengths[2]= 9;
        //tri5(4,7,2)
        sideLengths[12]=4;
        sideLengths[13]=7;
        sideLengths[14]=2;
                
        // we want to set the middle side of each trienagle o be 3
        sideLengths[1]= 3;
        sideLengths[4]= 3;
        sideLengths[7]= 3;
        sideLengths[10]= 3;
        sideLengths[13]= 5;
        sideLengths[16]= 5;
        
        Person primmy = new Person(); 
       primmy.favTriangle = tri3;
        
        Rectangle rect1 =new Rectangle();     
        
        System.out.println( rect1.getArea());
       //  shape shape1= new shape ();
       // that means it can not be instanciated 
        System.out.println(rect1.getColour());
}


    
}
