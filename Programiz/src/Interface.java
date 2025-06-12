// Java Interface

/*
* Interface:
* An interface is a fully abstract class
* It includes groups of abstract methods without body
*
* Use "interface" keyword
*
* We cannot create objects of interfaces
*
* Use "implements" keyword to implement an interface in other classes
*
* We can create multiple interfaces and extend them as well
* */


import org.w3c.dom.css.Rect;

// Interface
interface Polygon {

    // Method
    void getArea(int length, int breadth);
}

// Implement the interface
class Rectangle implements Polygon {

    // Implement abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

public class Interface {
    public static void main(String[] args) {

        // Create object
        Rectangle rectangle = new Rectangle();

        // Call method
        rectangle.getArea(1, 10);
    }
}
