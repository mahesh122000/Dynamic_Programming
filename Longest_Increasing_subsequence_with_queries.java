public static void answerLISQueries(int arr[], int queries[], int N, int Q)
    {
        int[][] dp = new int[N][51];
        for(int i=0; i<N; i++)
            for(int j=0; j<51; j++)
                dp[i][j]=0;
        
        int res[] = new int[N];
        for(int i=0; i<N; i++)
            res[i]=0;
        
        dp[N - 1][arr[N - 1]] = 1;
        res[N - 1] = 1;
        
        for(int i = N - 2; i >= 0; i--)
        {
            int curr = arr[i];
            for(int j = 0; j <= 50; j++)
                dp[i][j] = dp[i + 1][j];
            
            for(int j = curr; j <= 50; j++)
                dp[i][curr] = max( dp[i][curr] , dp[i + 1][j] + 1);
            
            res[i] = 0;
            for(int j = 0; j <= 50; j++)
                res[i] = max( res[i] , dp[i][j] );
        }
        
        // Answer Queries
        for(int i = 0; i < Q; i++) {
            int k = queries[i];
            System.out.println( res[k - 1] );
        }
    }