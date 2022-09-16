import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        // printInc(5);
        // func(2, 5, 1);
        // System.out.println(pow(2, 5));
        // printArray(new int[] {1, 4, 2, 1, 3, 4, 5, 56, 6, 7}, 9);
        // System.out.println(max(new int[] {1, 4, 2, 1, 3, 4, 5, 56, 6, 7}, 9));
        // System.out.println(firstIndex(new int[] {2, 3, 4, 1, 1, 2, 3, 1, 1, 1, 4, 5}, 0, 1));
        System.out.println(firstIndexReversed(new int[] {2, 3, 4, 1, 1, 2, 3, 1, 1, 1, 4, 5}, 11, 1));
        // System.out.println(gss("pqrs"));
        // System.out.println(fiboElongated(8));
        System.out.println("Command returned");
    }

    public static void printDec(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if(n == 0) return;
        printInc(n - 1);
        System.out.println(n);
    }

    public static void printIncDec(int n) {
        if(n == 0) return;
        System.out.println(n);
        printIncDec(n - 1);
        System.out.println(n);
    }

    public static int pow(int x, int n) {
        if(n == 1) return x;
        int faith = pow(x, n - 1);
        int exp = faith * x;
        return exp;
    }

    public static void func(int x, int n, int ans){
        if(n == 0)  {
            System.out.println(ans);
            return;
        }
        func(x, n-1, ans * x); //call
    }

    public static void Get_value_without_return(int value, int pow, int ans){
        if(pow == 0){
            System.out.println(ans);
            return;
        }
        ans= value*ans;
        Get_value_without_return(value, pow-1, ans);
    }

    public static void printArray(int[] arr, int idx) {
        // faith : 0 - n-1 
        // work : nth value printing
        if(idx == -1) return;
        printArray(arr, idx - 1);
        System.out.println(arr[idx]);
    }

    public static int max(int[] arr, int idx) {
        //base case
        if(idx == 0) return arr[idx];
        int faith = max(arr, idx - 1);
        return Math.max(faith, arr[idx]);
    }

    public static void puzzle(int n) { //n = 5
        if(n <= 1) {
            System.out.println("BASE: " + n);
            return;
        }

        System.out.println("PRE: " + n);
        puzzle(n - 1);
        System.out.println("IN: " + n);
        puzzle(n - 2);
        System.out.println("POST: " + n);
    }

    // public static int fibo(int n) {
    //     return n <= 1 ? n : fibo(n - 1) + fibo(n - 2);
    // }

    public static int fiboElongated(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int faith1 = fiboElongated(n - 1);
        int faith2 = fiboElongated(n - 2);
        int exp = faith1 + faith2;
        return exp;
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length) return -1;
        if(arr[idx] == x) return idx;
        return firstIndex(arr, idx + 1, x);
    }

    public static int firstIndexReversed(int[] arr, int idx, int x) {
        if(idx == -1) return -1;
        int faith = firstIndexReversed(arr, idx - 1, x);
        if(faith == -1) {
            if(arr[idx] == x) return idx;
            else return -1; 
        } else {
            return faith;
        }
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> faith = gss(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        for(String fvs : faith) ans.add(fvs);
        for(String fvs : faith) ans.add(str.charAt(0) + fvs);
        return ans;
    }
}
