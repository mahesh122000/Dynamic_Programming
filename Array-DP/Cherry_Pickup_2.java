class Solution {
    public int cherryPickup(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        int dp[][][]=new int[n][m][m];
        for(int r=n-1;r>=0;r--)
        {
            for(int c1=m-1;c1>=0;c1--)
            {
                for(int c2=m-1;c2>=0;c2--)
                {
                    if(c1!=c2)
                        dp[r][c1][c2]=a[r][c1]+a[r][c2];
                    else
                        dp[r][c1][c2]=a[r][c1];
                    int val=0;
                    for(int dx=-1;dx<=1;dx++)
                    {
                        for(int dy=-1;dy<=1;dy++)
                        {
                            if(r+1<n && c1+dx>=0 && c1+dx<m && c2+dy>=0 && c2+dy<m)
                                val=Math.max(val,dp[r+1][c1+dx][c2+dy]);
                        }
                    }
                    dp[r][c1][c2]+=val;
                }
            }
        }
        return dp[0][0][m-1];
    }
}


