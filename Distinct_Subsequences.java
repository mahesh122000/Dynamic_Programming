class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int a[][]=new int[n+1][m+1];
        int count=0;
        for(int i=0;i<=n;i++)
            a[i][0]=1;
        for(int i=1;i<=n;i++)
        {for(int j=1;j<=m;j++)
        {if(s.charAt(i-1)==t.charAt(j-1))
        {a[i][j]=a[i-1][j-1]+a[i-1][j];}
        else
        {a[i][j]=a[i-1][j];}}}
        return a[n][m];
    }
}