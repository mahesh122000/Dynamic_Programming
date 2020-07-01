class Solution {
    static int a[][];
    public int integerBreak(int n) {
        a=new int[n+1][2];
        a[1][0]=1;
        a[1][1]=1;
        for(int i=2;i<=n;i++)
        {
            a[i][1]=i-1;
            a[i][0]=i;
        }
        for(int i=4;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                a[i][1]=Math.max(a[i][1],find(a[j][0],a[j][1],a[i-j][0],a[i-j][1]));
            }
        }
        return a[n][1];
    }
    public int find(int p,int q,int r,int s)
    {
        return Math.max(p*r,Math.max(p*s,Math.max(q*r,q*s)));
    }
    
}