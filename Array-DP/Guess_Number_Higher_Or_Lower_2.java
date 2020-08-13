class Solution {
    public int getMoneyAmount(int n) {
        int a[][]=new int[n+1][n+1];
        for(int l=2;l<=n;l++)
        {
            for(int i=0;i<=n-l;i++)
            {
                int j=i+l;
                a[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++)
                {
                    a[i][j]=Math.min(a[i][j],Math.max(a[i][k],a[k+1][j])+k+1);
                }
            }
        }
        return a[0][n];
    }
}