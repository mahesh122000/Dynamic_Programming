class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
            a[i][i]=1;
        for(int d=2;d<=n;d++)
        {
            for(int i=0;i<n-d+1;i++)
            {
                int j=i+d-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    if(d==2)
                        a[i][j]=2;
                    else
                        a[i][j]=a[i+1][j-1]+2;
                }
                else
                {
                    a[i][j]=Math.max(a[i][j-1],a[i+1][j]);
                }
            }
        }
        return a[0][n-1];
    }
}