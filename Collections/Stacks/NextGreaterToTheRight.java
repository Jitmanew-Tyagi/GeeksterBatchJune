import java.util.*;
public class NextGreaterToTheRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 0, 1, 2, 5, 1, 6, 0, 0, 1, 9};
        //           2 4 5 5 6 1 2 5 6 6 9 1 1 9 -1 
        display(ngr(arr));
    }

    public static int[] ngr(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i --) {
            int ele = arr[i];
            if(st.isEmpty()) ans[i] = -1;
            else if(st.peek() > ele) ans[i] = st.peek();
            else {
                while(!st.isEmpty() && st.peek() <= ele) st.pop();
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(ele);
        }
        return ans;
    }

    public static int[] ngrBeautified(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i --) {
            int ele = arr[i];
            while(!st.isEmpty() && st.peek() <=  ele) st.pop();
            ans[i] = st.isEmpty() ? -1  : st.peek();
            st.push(ele);
        }
        return ans;
    }

    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}

