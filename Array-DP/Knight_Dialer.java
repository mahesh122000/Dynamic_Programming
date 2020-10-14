class Solution {
    static int[][] nxt={{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4},{0,1,2,3,4,5,6,7,8,9}};
    static int mod=1000000007;
    public int knightDialer(int n) {
        if(n==1)
            return 10;
        int a[]=new int[11];
        int b[]=new int[11];
        Arrays.fill(a,1);
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=10;j++)
            {
                for(int k:nxt[j])
                {
                    b[j]=(b[j]+a[k])%mod;
                }
            }
            int c[]=a;
            a=b;
            b=c;
            Arrays.fill(b,0);
        }
        return a[10];
    }
}