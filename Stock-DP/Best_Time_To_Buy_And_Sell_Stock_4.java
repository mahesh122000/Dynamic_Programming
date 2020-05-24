class Solution {
    public int maxProfit(int k, int[] prices) {
          int n=prices.length;
        if(n==0)
            return 0;
        int ans=0;
        if(k>=n)
        {for(int i=1;i<n;i++)
        {if(prices[i]>prices[i-1])
         ans+=prices[i]-prices[i-1];}
        return ans;}    
          int a[][]=new int[k+1][n];
          for(int i=1;i<=k;i++)
          {int md=-prices[0];
           for(int j=1;j<n;j++)
           {a[i][j]=Math.max(a[i][j-1],md+prices[j]);
           md=Math.max(md,a[i-1][j]-prices[j]);}}
        return a[k][n-1];
    }
}

