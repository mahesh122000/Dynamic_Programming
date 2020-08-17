class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int a[]=new int[n];
        if(n==0)
            return 0;
        int max=-prices[0];
        for(int i=1;i<n;i++)
        {
            a[i]=Math.max(a[i-1],prices[i]+max-fee);
            max=Math.max(max,a[i-1]-prices[i]);
        }
        return a[n-1];
    }
}