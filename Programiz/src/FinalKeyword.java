// Java final keyword

/*
* Final keyword
* Used to define a constant
* Used in: Variables, Methods, Classes
*
* Use uppercase to define java Constants
*
* Final methods
* Cannot be overridden by child classes
*
* Final class
* Cannot be inherited by another class
* */



// Parent
class FinalDemo {

    // Final method
    public final void display() {
        System.out.println("This is a final method.");
    }
}

// Child
class FinalChild extends FinalDemo {

    // Try to override (Gives an error)
    // public final void display() {
    //     System.out.println("The final method is overriden");
    // }

    public static void main(String[] args) {
    }
}


public class FinalKeyword {
    public static void main(String[] args) {

        // Final variable (We cannot change its value)
        final int AGE = 20;
        System.out.println(AGE);
    }
}
