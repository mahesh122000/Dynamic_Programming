public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        if(n==0)
            return 0;
        int m=matrix[0].length;
        if(m==0)
            return 0;
        int a[][]=new int[n][m];
        int max=0;
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(matrix[i][j]=='0')
        {}
        else
        {int top=i>0?a[i-1][j]:0;
        int left=j>0?a[i][j-1]:0;
        int topleft=i>0&&j>0?a[i-1][j-1]:0;
        a[i][j]=Math.min(topleft,Math.min(top,left))+1;
        max=Math.max(max,a[i][j]);
        }}}
        return max*max;
    }