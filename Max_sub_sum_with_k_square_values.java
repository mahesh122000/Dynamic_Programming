public static long findmaximumSubarraySum(int arr[], int N, int K) 
    {

        long pre[] = new long[N + 1];
        pre[0] = 0;
        for(int i = 1; i <= N; i++) {
            long curr = arr[i - 1];
            pre[i] = ((curr * curr) + pre[i - 1]);
        }
        long dp[][] = new long[N + 1][2];
        for(int i = 0; i <= N; i++)
            dp[0][0] = dp[0][1] = 0;
    
        dp[1][0] = arr[0];
        if(K!=0)
            dp[1][1] = (long)Math.pow(-10,17);
    
        for(int i = 2; i <= N; i++) {
            long curr = arr[i - 1];
            dp[i][0] = Math.max(dp[i - 1][0] + curr, curr);
            dp[i][1] = (long)Math.pow(-10,17);
        }
    
        for(int i = Math.max(1, K); i <= N; i++) {
            long curr = arr[i - 1];
            long subarray_sum = pre[i] - pre[i - K];
            dp[i][1] = Math.max(dp[i - 1][1] + curr, dp[i - K][0] + subarray_sum);
            if(K!=0) {
                dp[i][1] = Math.max(dp[i][1], subarray_sum);
            }
        }
    
        long res = (long)Math.pow(-10,17);
        for(int i = 1; i <= N; i++) {
            res = Math.max(res, dp[i][1]);
        }
        return res;
    }with