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
public class Square extends Shapes{
    private int side;

    public Square() {
    }

    public Square(String color, Size size, int side) {
        super(color, size);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    
    public int getPerimeter(){
        
        int b = 4*side;
        //System.out.println(b);
        return b;
    }
    
    
    public int getArea(){
        
        int b = side*side;
        //System.out.println(b);
        return b;
    }
    
    public String getShape() {
        return "Square";
    }
    
    @Override
    public void printShape(){
        System.out.println("I am the shape: " + getShape() + " with color: " + super.getColor() + " and with size: " + super.getSize());
    }
    
    @Override
    public String toString(){
        return "size: " + super.getSize() + " color: " + super.getColor() + " side: " + side ;
    }
}
