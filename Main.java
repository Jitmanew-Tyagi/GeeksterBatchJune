import java.util.*;
import p1.*;
public class Main {
    // public static void main(String[] args) {
    //     // List<Integer> arl = new ArrayList<>();
    //     // arl.add(1);
    //     // arl.add(2);
    //     // arl.add(-3);
    //     // System.out.println(getAT(arl));
    //     // C1 obj = new C1();
    //     // obj.display();
    //     System.out.println(area(5));
    //     System.out.println(area(5.0f));
    //     System.out.println(area(5, 6));
    // }

    public static void main(String args[]){ 
        StringBuffer sb=new StringBuffer("Hello"); 
        sb.replace(1,3,"Java"); 
        System.out.println(sb);
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

    public int noOfSteps(int n) {
        int ans = 0;
        while(n > 1) {
            ans ++;
            if(n % 2 == 0) n /= 2;
            else if(n % 3 == 0) n = (n * 2) / 3;
            else if(n % 5 == 0) n = (n * 4) / 5;
            else return  -1;
        }
        return ans;
    }

    public int[][] listOfIndices(int[] arr, int k) {
        int s = 0, n = arr.length;
        List<int[]> arl = new ArrayList<>();
        while(s < n) {
            for(int j = s + 1; j < n; j ++) {
                if(arr[s] * arr[j] == k) arl.add(new int[] {s, j});
            }
        }
        int size = arl.size(), idx = 0;
        int[][] ans = new int[size][2];
        while(idx < size) {
            ans[idx] = new int[] {arl.get(idx)[0], arl.get(idx)[1]};
            idx ++;
        }
        return ans;
    }
    
}