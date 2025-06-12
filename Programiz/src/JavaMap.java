// Java Map

/*
* Map
* Store elements in key/value pairs
*
* Keys are unique values associated with unique values
*
* Key: Unique identifier of a value in the map
* Value: Elements associated by keys in the map
*
* A map cannot contain duplicated Keys
*
* Classes that implements Map:
* HashMap, EnumMap, LinkedHashMap, WeakHashMap, TreeMap
* */

// Import Map
import java.util.Map;
import java.util.HashMap;

public class JavaMap {
    public static void main(String[] args) {

        // Create map
        Map<String, Integer> numbers = new HashMap<>();

        // Insert element
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        // Access Keys
        System.out.println("Keys: " + numbers.keySet());

        // Access Values
        System.out.println("Values: " + numbers.values());

        // Access entries (Key and value)
        System.out.println("Entries: " + numbers.entrySet());

        // Remove element
        int removedNumber = numbers.remove("One");
        System.out.println("Removed element: " + removedNumber);
    }
}
