class Solution {
    public int lenLongestFibSubseq(int[] a) {
        int n=a.length;
        int dp[][]=new int[n][n];
        int ans=0;
        for(int k=2;k<n;k++)
        {
            int i=0,j=k-1;
            while(i<j)
            {
                int val=a[i]+a[j]-a[k];
                if(val<0)
                    i++;
                else if(val>0)
                    j--;
                else
                {
                    dp[j][k]=dp[i][j]+1;
                    ans=Math.max(ans,dp[j][k]);
                    i++;
                    j--;
                }
            }
        }
        return ans+2>=3?ans+2:0;
    }
}