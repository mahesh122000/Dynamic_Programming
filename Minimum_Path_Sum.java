class Solution {
    public int minPathSum(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        if(n==0 || m==0)
            return 0;
        int b[]=new int[m];
        b[0]=a[0][0];
        for(int i=1;i<m;i++)
            b[i]=b[i-1]+a[0][i];
        for(int i=1;i<n;i++)
        {int c[]=new int[m];
        c[0]=b[0]+a[i][0];
        for(int j=1;j<m;j++)
         c[j]=Math.min(b[j],c[j-1])+a[i][j];
        b=c;}
        return b[m-1];
    }
}