class Solution {
    public boolean stoneGame(int[] a) {
        int n=a.length;
        int dp[][]=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        for(int d=0;d<n;d++)
        {
            for(int i=0,j=d;j<n;i++,j++)
            {
                int x=0,y=0,z=0;
                if(i+2<=j)
                    x=dp[i+2][j];
                if(i+1<=j-1)
                    y=dp[i+1][j-1];
                if(i<=j-2)
                    z=dp[i][j-2];
                dp[i][j]=Math.max(a[i]+Math.min(x,y),a[j]+Math.min(y,z));
            }
        }
        return dp[0][n-1]>sum-dp[0][n-1];
    }
}