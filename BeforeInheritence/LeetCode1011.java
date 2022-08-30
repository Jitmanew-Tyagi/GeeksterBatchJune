class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = max(weights), e = (int)1e9, ans = 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(doable(weights, mid, days) == true)  {
                ans = mid;
                e = mid- 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    
    public boolean doable(int[] wts, int mcap, int days) {
        int d = 1, cw = 0;
        for(int i : wts) {
            cw += i;
            if(cw > mcap) {
                d ++;
                cw = i;
            }
        }
        return d <= days;
    }
    
    public int max(int[] arr) {
        int max = arr[0];
        for(int i : arr) if(i > max) max = i;
        return max;
    }
    
}