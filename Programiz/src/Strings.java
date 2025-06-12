// Java strings

/*
* Strings are not primitive data types in Java
* Strings are objects of the class String
*
* Strings are immutable
* Once created we cannot change it
* */

public class Strings {
    public static void main(String[] args) {

        // Create strings
        String dallas = "Luka";
        String warriors = "Curry";


        // Length
        int length = dallas.length();
        System.out.println("Length: " + length);

        // Concat
        String novaString = dallas.concat(warriors);
        String plusConcat = dallas + " " + warriors; // Other method
        System.out.println("Concatenated string: " + novaString);

        // Compare two strings
        boolean result = dallas.equals(warriors);
        System.out.println("The string are the same: " + result);

        // Immutable but we can change it?????????? Damn
        String example = "hello ";
        example = example.concat(" World");
        System.out.println(example);

        // Create string New keyword
        String lakers = new String("Magic Johnson");
        System.out.println("New string: " + lakers);



    }
}
