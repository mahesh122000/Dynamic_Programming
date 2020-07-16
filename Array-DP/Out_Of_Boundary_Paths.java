class Solution {
    static int ans;
    static int a[][][];
    static int mod=1000000007;
    public int findPaths(int n, int m, int k, int i, int j) {
        ans=0;
        a=new int[n][m][k];
        if(k==0)
            return 0;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                for(int ki=0;ki<k;ki++)
                {
                    a[r][c][ki]=-1;
                }
            }
        }
        ans=(ans+find(n,m,k-1,i-1,j)%mod)%mod;
        ans=(ans+find(n,m,k-1,i,j+1)%mod)%mod;
        ans=(ans+find(n,m,k-1,i+1,j)%mod)%mod;
        ans=(ans+find(n,m,k-1,i,j-1)%mod)%mod;
        return ans;
    }
    public int find(int n,int m,int k,int i,int j)
    {
        if(i<0||j<0||i>=n||j>=m)
            return 1;
        if(k<=0)
            return 0;
        if(a[i][j][k]!=-1)
            return a[i][j][k];
        int val=0;
        val=(val+find(n,m,k-1,i-1,j)%mod)%mod;
        val=(val+find(n,m,k-1,i,j+1)%mod)%mod;
        val=(val+find(n,m,k-1,i+1,j)%mod)%mod;
        val=(val+find(n,m,k-1,i,j-1)%mod)%mod;
        a[i][j][k]=val%mod;
        return val%mod;
    }
}