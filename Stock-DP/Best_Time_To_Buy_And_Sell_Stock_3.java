class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0)
            return 0;
        int a[][]=new int[3][n];
        for(int i=1;i<=2;i++)
        {int v=-prices[0];
         for(int j=1;j<n;j++)
         {a[i][j]=Math.max(a[i][j-1],v+prices[j]);
         v=Math.max(v,a[i-1][j]-prices[j]);}}
        return a[2][n-1];
    }
}