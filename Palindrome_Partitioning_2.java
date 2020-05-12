class Solution {
    public int minCut(String s) {
        int n=s.length();
        if(n<=1)
            return 0;
        boolean b[][]=new boolean[n][n];
        for(int k=0;k<n;k++)
        {for(int i=0,j=i+k;j<n;i++,j++)
        {if(k==0)
         b[i][j]=true;
        else
         b[i][j]=(s.charAt(i)==s.charAt(j))?(k==1?true:b[i+1][j-1]):false;}}
        int a[][]=new int[n][n];
        for(int k=0;k<n;k++)
        {for(int i=0,j=i+k;j<n;i++,j++)
        {if(b[i][j]==false)
        {int v=Integer.MAX_VALUE;
        for(int r=i;r<j;r++)
         v=Math.min(v,a[i][r]+a[r+1][j]+1);
        a[i][j]=v;}}}
        return a[0][n-1];
    }
   
}

      