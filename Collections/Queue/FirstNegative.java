class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int N, int k)
    {
        int i = 0, j = 0, idx = 0;
        long[] ans = new long[N - k + 1];
        Queue<Long> que = new LinkedList<>();
        while(j < N) {
            if(arr[j] < 0) que.add(arr[j]);
            if(j == i + k - 1) {
                ans[idx ++] = que.isEmpty() ? 0 : que.peek();
                if(arr[i] < 0) que.remove();
                i ++;
            }
            j ++;
        }
        return ans;
    }
}