import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("India", 1.3);
        hm.put("China", 1.5);
        hm.put("USA", 0.65);
        hm.put("Japan", 0.1);
        hm.put("India", 1.5);
        // System.out.println(hm);
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Japan"));
        // hm.remove("Japan");
        // System.out.println(hm.get("Japan"));
        // System.out.println(hm.size());

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("india"));
        for(String key : hm.keySet()) 
            System.out.println(key +  ": " + hm.get(key));
    }
}
    //  a s c v f f d a s
    //  a : 2
    //  c : 1
    //  d : 1
    //  f : 2
    //  s : 2
    //  v : 1

// You will be given small-case alphabets between a-z (a and z both inclusive)
// You need to first take in n as an integer input.
// Then you will be given n alphabets.

// You have to print the frequency of each alphabet in alphabetical order from a to z using a for loop.


