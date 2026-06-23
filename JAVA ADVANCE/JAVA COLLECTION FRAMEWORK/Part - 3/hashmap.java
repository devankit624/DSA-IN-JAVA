// map interface stores the key value pair
// Each key is unique but the dublicate value accepted
// Map -> key
// Map -> value
// Map -> Key value pair

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class hashmap{
    public static void main(String[] args){
        Map<String, String> mapping = new HashMap<>();

        //insertion
        mapping.put("in" , "India");
        mapping.put("in" , "India");
        mapping.put("en" , "england");
        mapping.put("us" , "UnitedStates");
        System.out.println(mapping);

        // new map creation
        Map<String, String> m = new HashMap<>();
        m.put("br" , "brazil");
        System.out.println("before " + m);
        m.putAll(mapping);
        System.out.println("After " + m);
        m.remove("en");
        System.out.println(m);

        m.putIfAbsent("is" , "ireland");
        System.out.println(m.get("us"));
        System.out.println(m.getOrDefault("usa" , "No found"));
        System.out.println(m.containsKey("in"));
        System.out.println(m.containsValue("India"));
        // System.out.println(m.size());
        // m.clear();
        // System.out.println(m);

        System.out.println(m);
        m.replace("in" , "Rusia");
        System.out.println(m);

        // All the Keys Set

        Set<String> keyset =  m.keySet();
        System.out.println(keyset);

       // All the Key values
        Collection<String> values = m.keyvalues();
        System.out.println(values);


    }
}