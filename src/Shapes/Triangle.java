package Shapes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Primm
 */
public class Triangle  extends Shape {
   
    private int side1;
    private int side2;
    private int size3;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        if (side1>0){
            this.side1=side1;
        }
        else{
            System.out.println("Cannot set side1 of  TRIANGLE  to be non- ppositive ");
        }
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSize3() {
        return size3;
    }

    public void setSize3(int size3) {
        this.size3 = size3;
    }
}
