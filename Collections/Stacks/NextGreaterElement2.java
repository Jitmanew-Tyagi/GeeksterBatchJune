class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i = n - 1; i >= 0; i --) {
            while(!st.isEmpty() && st.peek() <= nums[i]) st.pop();
            st.push(nums[i]);
        }
        
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i --) {
            int ele = nums[i];
            while(!st.isEmpty() && st.peek() <= ele) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(ele);
        }
        return ans;
    }
}