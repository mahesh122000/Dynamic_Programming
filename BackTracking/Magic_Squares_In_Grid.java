class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        if(n<=2)
            return 0;
        int m=grid[0].length;
        if(m<=2)
            return 0;
        int count=0;
        for(int i=0;i<=n-3;i++)
        {
            for(int j=0;j<=m-3;j++)
            {
                if(safe(grid,i,j))
                    count++;
            }
        }
        return count;
    }
    boolean safe(int a[][],int i,int j)
    {
        if(a[i+1][j+1]!=5)
            return false;
        HashSet<Integer>hs=new HashSet<>();
        for(int p=i;p<i+3;p++)
        {
            int sum=0;
            for(int q=j;q<j+3;q++)
            {
                sum+=a[p][q];
                hs.add(a[p][q]);
            }
            if(sum!=15)
                return false;
        }
        if(hs.size()!=9)
            return false;
        for(int k=1;k<=9;k++)
        {
            if(!hs.contains(k))
                return false;
        }
        for(int q=j;q<j+3;q++)
        {
            int sum=0;
            for(int p=i;p<i+3;p++)
            {
                sum+=a[p][q];
            }
            if(sum!=15)
                return false;
        }
        int sum=0;
        for(int k=0;k<3;k++)
        {
            sum+=a[i+k][j+k];
        }
        if(sum!=15)
            return false;
        return true;
    }
}