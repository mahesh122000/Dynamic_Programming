class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0)
            return 0;
        int n=matrix.length;
        int m=matrix[0].length;
        int a[][]=new int[n][m];
        PriorityQueue<int[]>pq=new PriorityQueue<>((p,q)->p[0]-q[0]);
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
         pq.add(new int[]{matrix[i][j],i,j});
        }
        int ans=0;
        while(!pq.isEmpty())
        {int x[]=pq.poll();
         int i=x[1];
         int j=x[2];
         int v=0;
         if(i>0 && matrix[i][j]>matrix[i-1][j])
             v=Math.max(v,a[i-1][j]);
         if(j>0 && matrix[i][j]>matrix[i][j-1])
             v=Math.max(v,a[i][j-1]);
         if(i<n-1 && matrix[i][j]>matrix[i+1][j])
             v=Math.max(v,a[i+1][j]);
         if(j<m-1 && matrix[i][j]>matrix[i][j+1])
             v=Math.max(v,a[i][j+1]);
         a[i][j]=v+1;
         ans=Math.max(ans,v+1);
        }
        return ans;
    }
}