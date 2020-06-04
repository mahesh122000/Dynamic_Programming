class Solution {
    static int ans;
    public int getMaximumGold(int[][] grid) {
        ans=0;
        for(int i=0;i<grid.length;i++)
        {for(int j=0;j<grid[0].length;j++)
        {if(grid[i][j]!=0)
        {int b[][]=new int[grid.length][grid[0].length];
         find(grid,b,i,j,0);
        }}}
        return ans;
    }
    static int rows[]={0,1,0,-1};
    static int cols[]={1,0,-1,0};
    public void find(int a[][],int b[][],int i,int j,int sum)
    {
        b[i][j]=1;
        sum+=a[i][j];
        ans=Math.max(ans,sum);
        for(int k=0;k<4;k++)
        {if(i+rows[k]>=0 && i+rows[k]<a.length && j+cols[k]>=0 && j+cols[k]<a[0].length && b[i+rows[k]][j+cols[k]]==0                       && a[i+rows[k]][j+cols[k]]!=0) 
         find(a,b,i+rows[k],j+cols[k],sum);
        }
        b[i][j]=0;
    }
}