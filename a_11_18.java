import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a_11_18 {

    /*
    18. Write a method called reverse that accepts a map from strings to strings as a parameter and returns a new map that
    is the reverse of the original. The reverse of a map is a new map that uses the values from the original as its keys and
    the keys from the original as its values. Since a map’s values need not be unique but its keys must be, you should
    have each value map to a set of keys. In other words, if the original map maps keys of type K to values of type V, the
    new map should map keys of type V to values that are Sets containing elements of type K. For example, the map
    {42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed} has a reverse of {Marty=[42, 3],
    Sue=[81], Ed=[17, 56, 29], Dave=[31]}. (The order of the keys and values does not matter.)
     */

    public static void main(String[] args) {

        Map<String, String> testMap = new HashMap<>();

        String resultString = "Result should be:\n{Marty=[42, 3], Sue=[81], Ed=[17, 56, 29], Dave=[31]}";

        testMap.put("42", "Marty");
        testMap.put("81", "Sue");
        testMap.put("17", "Ed");
        testMap.put("31", "Dave");
        testMap.put("56", "Ed");
        testMap.put("3", "Marty");
        testMap.put("29", "Ed");

        System.out.println(resultString);
        System.out.println("Result is:\n" + reverse(testMap));
    }

    public static Map<String, String> reverse(Map<String, String> map) {

        Map<String, String> returnMap = new HashMap<>();

        Set<String> setOfKeys = map.keySet();

        Iterator<String> iter = setOfKeys.iterator();

        while (iter.hasNext()) {

            String key = iter.next();

            if (!returnMap.containsKey(map.get(key))) {

                returnMap.put(map.get(key), key);
            } else {
                returnMap.put(map.get(key), returnMap.get(map.get(key)) + ", " + key);

            }
        }

        return returnMap;
    }
}
