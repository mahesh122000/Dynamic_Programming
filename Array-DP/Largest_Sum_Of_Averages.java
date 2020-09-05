class Solution {
    double dp[][];
    public double largestSumOfAverages(int[] a, int k) {
        int n=a.length;
        dp=new double[n+1][k+1];
        double val=0.0;
        double ans=0.0;
        for(int i=0;i<=n-k;i++)
        {
            val+=(double)a[i];
            ans=Math.max(ans,find(val/(i+1),i+1,k-1,n,a));
        }
        return ans;
    }
    double find(double val,int i,int k,int n,int a[])
    {
        if(i>=n)
            return val;
        if(k==0)
            return Double.MIN_VALUE;
        if(k==1)
        {
            double d=0.0;
            for(int j=i;j<n;j++)
                d+=(double)a[j];
            d=d/(n-i);
            return val+d;
        }
        if(dp[i][k]!=0.0)
            return val+dp[i][k];
        double d=0.0;
        double ans=0.0;
        for(int j=i;j<=n-k;j++)
        {
            d+=(double)a[j];
            ans=Math.max(ans,find(d/(j-i+1),j+1,k-1,n,a));
        }
        dp[i][k]=ans;
        return ans+val;
    }
}