static int playWithWords(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        dp[i][i]=1;
        for(int d=2;d<=n;d++)
        {
            for(int i=0;i<n-d+1;i++)
            {
                int j=i+d-1;
                if(s.charAt(i)==s.charAt(j) && d==2)
                dp[i][j]=2;
                else if(s.charAt(i)==s.charAt(j))
                dp[i][j]=dp[i+1][j-1]+2;
                else
                dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
            }
        }
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
            ans=Math.max(ans,dp[0][i]*dp[i+1][n-1]);
        }
        return ans;
    }
