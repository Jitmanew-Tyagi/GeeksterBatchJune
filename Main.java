import java.util.*;
import p1.*;
public class Main {
    public static void main(String[] args) {
        // List<Integer> arl = new ArrayList<>();
        // arl.add(1);
        // arl.add(2);
        // arl.add(-3);
        // System.out.println(getAT(arl));
        // C1 obj = new C1();
        // obj.display();
        System.out.println(area(5));
        System.out.println(area(5.0f));
        System.out.println(area(5, 6));
    }

    public static int area(int a) {
        return a * a;
    }

    public static int area(float a) {
        return (int)(a * a);
    }

    public static int area(int l, int b) {
        return l * b;
    }

    

    public static long getAT(List<Integer> arr) {
        int n = arr.size(), idx = 0;
        long total = 0, ans = Long.MIN_VALUE, preSum[] = new long[n];
        for(int i : arr) 
            preSum[idx ++] = (total += i);
        for(int i = 0; i < n; i ++) 
            ans = Math.max(Math.max(preSum[i], 
            (total - preSum[i] + arr.get(i))), ans);
        return ans;
    }

    
}