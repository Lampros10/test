/*
Exercise1

1. Create class Shape, Circle, Square, Triangle.
2. Shape has color and size.
3. Size could be enum. (What are enums in Java?)
4. Shape has methods getPerimeter(), getArea(), printShape(), getters/setters.
5. Shape has only one Constructor with color and size.
5a. All Shapes should have only one full-argument Constructor.
6. Circle has radius.
7. Square has side.
8. Triangle has base, side2, side3, height.
9. All Shapes should have getPerimeter(), getArea(), printShape().
9a. All Classes should have getters/setters and toString().
10. printShape() should print a message "Printing a $SIZE $COLOR $SHAPE."
11. Create a t1, s1, c1.
12. Add them to a list of Shapes.
13. For every shape in the list, call it's printShape() and enjoy MAGIC.
14. Find the Shape that has the largest area, perimeter.
14. Create 2 more squares.
15. Print the Square with the largest perimeter.
*/


package mypackage;

import java.util.ArrayList;
import shapes.Circle;
import shapes.Shapes;
import shapes.Square;
import shapes.Triangle;

/**
 *
 * @author lampr
 */
public class sxhmataMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shapes s = new Shapes ("Blue", Size.MEDIUM);
        Triangle t1 = new Triangle("Blue", Size.SMALL, 5, 4, 8);
        Square s1 = new Square("Black", Size.LARGE, 10);
        Circle c1 = new Circle ("Red", Size.MEDIUM, 50);
        System.out.println(c1);
        ArrayList<Shapes> shape1 = new ArrayList();
        shape1.add(t1);
        shape1.add(s1);
        shape1.add(c1);
        for (Shapes sxhmata:shape1) {
            sxhmata.printShape();
        }
        s1.getPerimeter();
        
        
        if (s1.getPerimeter() >= t1.getPerimeter() && s1.getPerimeter() >= c1.getPerimeter()){
            System.out.println("s1 has the biggest perimeter");
        } else if (t1.getPerimeter() >= s1.getPerimeter() && t1.getPerimeter() >= c1.getPerimeter()){
                System.out.println("t1 has the biggest perimeter");
        } else 
            System.out.println("c1 has the biggest perimeter");
        
        if (s1.getArea()>= t1.getArea() && s1.getArea() >= c1.getArea()){
            System.out.println("s1 has the biggest area");
        } else if (t1.getArea() >= s1.getArea() && t1.getArea() >= c1.getArea()){
                System.out.println("t1 has the biggest area");
        } else 
            System.out.println("c1 has the biggest area");
        
        
        Square s2 = new Square("White", Size.MEDIUM, 5);
        Square s3 = new Square("Purple", Size.SMALL, 3);
        
        
        if (s1.getPerimeter() >= s2.getPerimeter() && s1.getPerimeter() >= s3.getPerimeter()){
            System.out.println("s1 has the biggest perimeter");
        } else if (s2.getPerimeter() >= s1.getPerimeter() && s2.getPerimeter() >= s3.getPerimeter()){
                System.out.println("s2 has the biggest perimeter");
        } else 
            System.out.println("s3 has the biggest perimeter");
    }
    
}
