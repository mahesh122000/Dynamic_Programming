 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        if(n==0)
            return 0;
        int m=obstacleGrid[0].length;
        int a[][]=new int[n][m];
        a[0][0]=1;
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {
        if(obstacleGrid[i][j]==1)
         a[i][j]=0;
        else if(i==0 && j==0)
            a[i][j]=1;
        else if(i==0)
         a[i][j]=a[i][j-1];
        else if(j==0)
            a[i][j]=a[i-1][j];
        else
            a[i][j]=a[i-1][j]+a[i][j-1];
        }}
        return a[n-1][m-1];
    }