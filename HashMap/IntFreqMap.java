import java.util.*;
public class IntFreqMap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = scn.nextInt();
        while(n --> 0)  {
            int x = scn.nextInt();
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) == key) System.out.println(key);
        }
        System.out.println(hm);
    }
}