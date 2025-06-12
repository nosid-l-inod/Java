// Hash

/*
* Stores the data in Key/Value pairs
* */

// Import HashMap
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // Add elements - put()
        languages.put(1, "Python");
        languages.put(2, "Java");
        languages.put(3, "JavaScript");

        System.out.println("HashMap: " + languages);

        // Access elements - get(Key)
        String element = languages.get(2);
        System.out.println("First element: " + element);

        // Access Keys - keySet()
        System.out.println("Keys: " + languages.keySet());

        // Access values
        System.out.println("Values: " + languages.values());

        // Access key-value pairs
        System.out.println("Key-Values: " + languages.entrySet());

        // Change values - replace()
        // Replace element with key 2
        languages.replace(2, "C");
        System.out.println("New HashMap: " + languages);

        // Remove element
        String removedLanguage = languages.remove(2);
        System.out.println("Removed element: "+ removedLanguage);

        // Iterate Key/Values
        System.out.println("Values: ");
    }
}