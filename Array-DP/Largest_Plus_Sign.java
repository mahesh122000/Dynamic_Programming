class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int a[][]=new int[n][n];
        int left[][]=new int[n][n];
        int up[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=1;
        }
        for(int x[]:mines)
        {
            a[x[0]][x[1]]=0;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                left[i][j]=a[i][j]==0?0:j==0?1:left[i][j-1]+1;
                up[i][j]=a[i][j]==0?0:i==0?1:up[i-1][j]+1;
            }
        }
        int ans=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                left[i][j]=a[i][j]==0?0:j==n-1?1:Math.min(left[i][j+1]+1,left[i][j]);
                up[i][j]=a[i][j]==0?0:i==n-1?1:Math.min(up[i+1][j]+1,up[i][j]);
                ans=Math.max(ans,Math.min(left[i][j],up[i][j]));
            }
        }
        return ans;
    }
}