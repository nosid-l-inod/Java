// This keyword in Java


/*
* This
* Used to refer to the current object inside e method or constructor
* */

public class thisKeyword {

    int age;

    thisKeyword(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword(8);

        System.out.println(obj.age);
    }
}

/*
* Constructor overloading
* Invoke one constructor from another, using "this" keyword
* */
class Complex {

    // Variables
    private int x, y;

    // Constructor with 2 parameters
    private Complex(int i, int j) {
        this.x = i;
        this.y = j;
    }

    // Constructor with 1 parameter
    private Complex(int i) {

        // Invoke constructor with 2 parameters
        this(i, i);
    }

    // Constructor without parameter
    private Complex() {

        // Invoke constructor with one parameter
        this(0);
    }


    @Override
    public String toString() {
        return this.x + " + " + this.y + "i";
    }

    public static void main(String[] args) {

        // Create an object
        Complex complexObj = new Complex(10, 20);

    }

}
