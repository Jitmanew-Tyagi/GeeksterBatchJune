class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int s = 1, e = (int)1e9, ans = -1;
        if(bloomDay.length < (m * k)) return ans;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(doable(bloomDay, mid, m, k)) {
                ans = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return ans;
    }
    
    public boolean doable(int[] arr, int days, int m, int k) {
        int cf = 0;
        for(int i : arr) {
            if(i <= days) {
                cf ++;
                if(cf == k) {
                    m --;
                    cf = 0;
                }
            } else {
                cf = 0;
            }
        }
        return m <= 0;
    }    
}