class Solution {
    public int largestRectangleArea(int[] heights) {
        return computeMaxArea(heights);   
    }
    
    public int[] nsl(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i ++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    
    public int[] nsr(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i --) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    
    public int computeMaxArea(int[] arr) {
        int n = arr.length;
        int[] nsl = nsl(arr);
        int[] nsr = nsr(arr);
        int maxArea = 0;
        for(int i = 0; i < n; i ++) {
            int width = nsr[i] - nsl[i] - 1;
            maxArea = Math.max(maxArea, arr[i] * width);
        }
        return maxArea;
    }
}