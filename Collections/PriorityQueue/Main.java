import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(8);
        pq.add(50);
        pq.add(-5);
        pq.add(-15);
        pq.add(-21);
        System.out.println(pq);
        while(!pq.isEmpty()) System.out.println(pq.remove()); 
    }
}