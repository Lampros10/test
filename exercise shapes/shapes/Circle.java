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
public class Circle extends Shapes{
    private float radius;

    public Circle() {
    }

    public Circle(String color, Size size, int radius) {
        super(color, size);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
    public float getPerimeter(){
        
        float b = (float) (2*3.14*(float)radius);
        //System.out.println(b);
        return b;
    }
    
    
    public float getArea(){
        
        float b = (float) (3.14*radius*radius);
        //System.out.println(b);
        return b;
    }
    
    
    public String getShape() {
        return "Circle";
    }
    
    @Override
    public void printShape(){
        System.out.println("I am the shape: " + getShape() + " with color: " + super.getColor() + " and with size: " + super.getSize());
    }
    
    @Override
    public String toString(){
        return "size: " + super.getSize() + " color: " + super.getColor() + " radius: " + radius ;
    }
}
