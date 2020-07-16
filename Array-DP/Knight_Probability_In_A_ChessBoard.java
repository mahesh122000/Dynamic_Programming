class Solution {
    static double a[][][];
    static int row[]={-2,-1,1,2,2,1,-1,-2};
    static int col[]={1,2,2,1,-1,-2,-2,-1}; 
    public double knightProbability(int n, int k, int r, int c) {
        a=new double[n+1][n+1][k+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                for(int p=0;p<=k;p++)
                {
                    a[i][j][p]=-1.0;
                }
            }
        }
        return find(n,k,r,c);
    }
    double find(int n,int k,int r,int c)
    {
        if(r<0||c<0||r>=n||c>=n)
            return 0.0;
        if(k==0)
            return 1;
        double val=0.0;
        if(a[r][c][k]!=-1)
            return a[r][c][k];
        for(int i=0;i<8;i++)
        {
            val+=find(n,k-1,r+row[i],c+col[i]);
        }
        a[r][c][k]=val/8;
        return val/8;
    }
}