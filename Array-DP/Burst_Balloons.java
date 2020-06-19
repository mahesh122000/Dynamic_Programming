class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int a[][]=new int[n][n];
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n-k;i++)
            {
                int j=i+k;
                int left=(i==0)?1:nums[i-1];
                int right=(j==n-1)?1:nums[j+1];
                a[i][j]=0;
                for(int q=i;q<=j;q++)
                {
                    int lsum=(q==i)?0:a[i][q-1];
                    int rsum=(q==j)?0:a[q+1][j];
                    a[i][j]=Math.max(a[i][j],lsum+left*nums[q]*right+rsum);
                }
            }
        }
        return a[0][n-1];
    }
}

