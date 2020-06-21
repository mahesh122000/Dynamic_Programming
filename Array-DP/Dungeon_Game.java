class Solution {
    public int calculateMinimumHP(int[][] d) {
        int n=d.length;
        if(n==0)
            return 0;
        int m=d[0].length;
        if(m==0)
            return 0;
        int a[]=new int[m+1];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                int min=a[j+1]==0?a[j]:a[j]==0?a[j+1]:Math.min(a[j],a[j+1]);
                a[j]=Math.max(Math.max(min,1)-d[i][j],1);
            }
        }
        return a[0];
    }
}