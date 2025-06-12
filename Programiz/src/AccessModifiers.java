// Java Access Modifiers

/*
* Access modifiers
* Used to set the visibility of classes, variables, interfaces, methods, constructors, setters, data members
*
* public
* It can be accessed by other classes
*
* private
* Cannot be accessed by other classes
*
* Access modifiers
* Not used in getters methods
*
* Types of access modifiers
* Default - Declarations are visible only within the package
* Private - Visible within the class only (Use getters and setters to access data)
* Protected - Visible within the package or subclasses
* Public - Visible everywhere
*
* Getter and Setter
* Methods to access private variables in Java
* */


class Data {

    // Private variable
    private String name;

    // Getter method
    public String getName() {
        return this.name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        // Create data object
        Data dataObj = new Data();

        // Access the private variable (Gives an error)
        // dataObj.name = "James";

        // Access private variable using getter and setter
        dataObj.setName("Curry");
        System.out.println(dataObj.getName());


    }
}
