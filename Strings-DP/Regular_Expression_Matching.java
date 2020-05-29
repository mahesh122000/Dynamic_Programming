class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        boolean a[][]=new boolean[n+1][m+1];
        a[0][0]=true;
        for(int i=1;i<=m;i++)
        {a[0][i]=(p.charAt(i-1)=='*')?a[0][i-2]:false;}
        for(int i=1;i<=n;i++)
        {for(int j=1;j<=m;j++)
        {
            if(p.charAt(j-1)=='.'||p.charAt(j-1)==s.charAt(i-1))
                a[i][j]=a[i-1][j-1];
            else if(p.charAt(j-1)=='*')
            {
                a[i][j]=a[i][j-2];
                if(!a[i][j] && (s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2)=='.'))
                    a[i][j]=a[i-1][j];
            }
        }}
        return a[n][m];
    }
}