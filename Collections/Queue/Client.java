import java.util.*;
public class Client {
    public static void main(String[] args) {
        // CustomQueue que = new CustomQueue();
        // for(int i = 0; i < 6; i ++) que.add(i);
        // System.out.println(que);
        // System.out.println(que.remove());
        // System.out.println(que.peek());
        // System.out.println(que.isEmpty());
        // System.out.println(que);
        // System.out.println(que.size());
        // while(!que.isEmpty()) que.remove();
        Queue<Integer> que = new ArrayDeque<>();
        for(int i = 0; i < 6; i ++) que.add(i);
        System.out.println(que);
        System.out.println(que.remove());
        System.out.println(que.peek());
        System.out.println(que.isEmpty());
        System.out.println(que);
        System.out.println(que.size());
        // while(!que.isEmpty()) que.remove();
        for(int i : que) System.out.println(i);
        System.out.println(que);

    }
}