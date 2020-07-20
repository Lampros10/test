/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import mypackage.Size;

/**
 *
 * @author lampr
 */
public class Triangle extends Shapes{
    private int base;
    private int side1;
    private int side2;

    public Triangle() {
    }

    public Triangle(String color, Size size, int base, int side1, int side2) {
        super(color, size);
        this.base = base;
        this.side2 = side2;
    }

    public int getBase() {
        return base;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
    
    
    public int getPerimeter(){
        
        int b = base + side2 + side1;
        //System.out.println(b);
        return b;
    }
    
    
    public int getArea(){
        
        
        int b = (base*side2)/2;
        //System.out.println(b);
        return b;
        
    }
    
    
    public String getShape() {
        return "Triangle";
    }
    
    @Override
    public void printShape(){
        System.out.println("I am the shape: " + getShape() + " with color: " + super.getColor() + " and with size: " + super.getSize());
    }
    
    @Override
    public String toString(){
        return "size: " + super.getSize() + " color: " + super.getColor() + " side1: " + side1 + " side2: " + side2 + " base: " + base ;
    }
}
