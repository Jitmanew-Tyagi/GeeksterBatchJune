import java.util.*;
public class FreqMap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(char c = 'a'; c <= 'z'; c ++) {
            if(hm.get(c) != null) System.out.println(c + " : " + hm.get(c));
        }
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

// 1 - 100_000 ->
// 2 : 3
// 3 : 3
// 57 : 100
// 105 : 105
// .
// .
// .
// .
// You will be given integers between 1-10^5 (1 and 10^5 both inclusive)
// You need to first take in n as an integer input.
// Then you will be given n integers.
// Print those integers whose frequency is equal to the integer’s value.
// Do this question using a for-each loop.

