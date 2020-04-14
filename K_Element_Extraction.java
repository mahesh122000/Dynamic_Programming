 public static int getMaximumKSum(int[][] matrix, int N, int M, int K) 
    {

        int dp[][] = new int[N + 1][K + 1];
        for(int i=0; i<= N;i++)
            for(int j = 0;j<= K;j++)
                dp[i][j] = -10000000;
        
        dp[0][0] = 0;
        for(int i = 1; i <= N; i++) {
            int prefix_sum[] = new int[M + 1];
            prefix_sum[0] = 0;
            for(int j = 1; j <= M; j++)
                prefix_sum[j] = prefix_sum[j - 1] + matrix[i - 1][j - 1];
            
            for(int j = 0; j <= K; j++)
                for(int x = 0; x <= Math.min(M, j); x++)
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - x] + prefix_sum[x]);
        }
        
        return dp[N][K];
    }