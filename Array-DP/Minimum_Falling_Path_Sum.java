class Solution {
    public int minFallingPathSum(int[][] a) {
        int n=a.length;
        if(n==0)
            return 0;
        if(n==1)
            return a[0][0];
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                {
                    a[i][j]=Math.min(a[i][j]+a[i+1][j],a[i][j]+a[i+1][j+1]);
                }
                else if(j==n-1)
                {
                    a[i][j]=Math.min(a[i][j]+a[i+1][j],a[i][j]+a[i+1][j-1]);
                }
                else
                {
                    a[i][j]=a[i][j]+Math.min(a[i+1][j],Math.min(a[i+1][j+1],a[i+1][j-1]));
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
            ans=Math.min(ans,a[0][j]);
        return ans;
    }
}