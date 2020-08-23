static String indianJob(int g, int[] a) {
        int n=a.length;
        int sum=0;
        int val=0;
        for(int i:a)
        sum+=i;
        val=sum;
        sum=(sum+1)/2;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        dp[i][0]=true;
        for(int i=1;i<=sum;i++)
        dp[0][i]=false;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(a[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j]|dp[i-1][j-a[i-1]];
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        int ind=0;
        for(int i=sum;i>=0;i--)
        {
            if(dp[n][i])
            {
                ind=i;
                break;
            }
        }
        if(val-ind>g)
        return "NO";
        return "YES";
    }
