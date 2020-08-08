class Solution {
    public int strangePrinter(String s) {
        s=s.replaceAll("(.)\\1+","$1");
        int n=s.length();
        int dp[][]=new int[n][n];
        return find(0,n-1,s,dp);
    }
    int find(int l,int r,String s,int dp[][])
    {
        if(l>r)
            return 0;
        if(dp[l][r]!=0)
            return dp[l][r];
        int k=0;
        int j=l;
        while(j<=r && s.charAt(j)==s.charAt(l))
            j++;
        int min=1+find(j,r,s,dp);
        for(int i=j;i<=r;i++)
        {
            if(s.charAt(i)==s.charAt(l))
            {
                min=Math.min(min,find(i,r,s,dp)+find(l+1,i-1,s,dp));
            }
        }
        dp[l][r]=min;
        return min;
    }
}

