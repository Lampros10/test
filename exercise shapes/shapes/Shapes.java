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
public class Shapes {
    private String color;
    private Size size;

    public Shapes() {
    }

    public Shapes(String color, Size size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public int getPerimeter(int a){
        int b = 4*a;
        return b;
    }
    
    public int getArea(int a){
        int b = a*a;
        return b;
    }
    
    public void printShape(){
        System.out.println("I am the shape:" + getColor() + getSize());
    }
    
    @Override
    public String toString(){
        return "size: " + size + " color: " + color;
    }
    
}
