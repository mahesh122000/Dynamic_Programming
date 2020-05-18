class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        if(n==0)
            return 0;
        int m=matrix[0].length;
        if(m==0)
            return 0;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(matrix[i][j]==0)
        {}
        else
        {int t=i>0?a[i-1][j]:0;
        int l=j>0?a[i][j-1]:0;
        int tl=i>0 && j>0?a[i-1][j-1]:0;
        a[i][j]=Math.min(t,Math.min(l,tl))+1;}}}
        int ans=0;
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {
         ans+=a[i][j];}
         
        }
        return ans;
    }
}