class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>(); //key -> array vals, Value -> arr index
        for(int i = 0; i < n; i ++) hm.put(nums[i], i); 
        for(int i = 0; i < n; i ++) {
            int complement = target - nums[i];
            if(hm.containsKey(complement) && hm.get(complement) != i) {
                int indexOfCompl = hm.get(complement);
                ans[0] = i;
                ans[1] = indexOfCompl;
                return ans;
            }
        }
        return ans;
    }
}