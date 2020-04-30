 public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        if(n==0)
            return 0;
        int a[][]=new int[n][n];
        for(int i=n-1;i>=0;i--)
        {for(int j=0;j<triangle.get(i).size();j++)
        {if(i==n-1)
         a[i][j]=triangle.get(i).get(j);
         else
          a[i][j]=triangle.get(i).get(j)+Math.min(a[i+1][j],a[i+1][j+1]);
        }}
        return a[0][0];
    }