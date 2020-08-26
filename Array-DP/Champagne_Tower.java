class Solution {
    public double champagneTower(int k, int n, int m) {
        double a[][]=new double[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0)
                {
                    a[i][j]=k;
                }
                else
                {
                    if(j==0)
                    {
                        a[i][j]=(a[i-1][j]<=1)?0:(a[i-1][j]-1)/2.0;
                    }
                    else if(j==i)
                    {
                        a[i][j]=(a[i-1][j-1]<=1)?0:(a[i-1][j-1]-1)/2.0;
                    }
                    else
                    {
                        a[i][j]=(a[i-1][j-1]<=1)?0:(a[i-1][j-1]-1)/2.0;
                        a[i][j]+=(a[i-1][j]<=1)?0:(a[i-1][j]-1)/2.0;
                    }
                }
            }
        }
        if(a[n][m]>=1.00)
            return 1.0000;
        return a[n][m];
    }
}