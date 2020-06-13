class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
     int s=strs.length;
        int a[]=new int[s];
        int b[]=new int[s];
        for(int i=0;i<s;i++)
        {int c[]=find(strs[i]);
        a[i]+=c[0];
        b[i]+=c[1];}
        int dp[][]=new int[n+1][m+1];
        for(int k=0;k<s;k++)
        {for(int i=n;i>=b[k];i--)
        {for(int j=m;j>=a[k];j--)
         dp[i][j]=Math.max(dp[i][j],dp[i-b[k]][j-a[k]]+1);}}
        return dp[n][m];
    }
    public int[] find(String s)
    {
        int a[]=new int[2];
        for(int i=0;i<s.length();i++)
        {if(s.charAt(i)=='0')
         a[0]++;
        else
         a[1]++;}
        return a;
    }
}