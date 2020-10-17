class Solution {
    public int numMusicPlaylists(int n, int l, int k) {
        long mod=1000000007;
        long a[][]=new long[l+1][n+1];
        a[0][0]=1;
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=(a[i-1][j-1]*(n-(j-1)))%mod;
                if(j>k)
                {
                    a[i][j]=(a[i][j]+(a[i-1][j]*(j-k))%mod)%mod;
                }
            }
        }
        return (int)(a[l][n]);
    }
}
//dp[i][j] means i songs in pl, with j different song types;