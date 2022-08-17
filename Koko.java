class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1, e = maxOfArray(piles);
        int ans = e;
        while(s <= e) {
            int mid = s + ((e - s)/2);
            int noh = getHours(piles, mid);
            if(noh <= h) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    
    public int getHours(int[] piles, int sp) {
        int noh = 0;
        for(int nob : piles)
            noh += (int)Math.ceil(nob / (sp * 1.0));
        return noh;
    }
    
    public int maxOfArray(int[] arr) {
        int max = 0;
        for(int i : arr) if(i > max) max = i;
        return max;
    }
    
}