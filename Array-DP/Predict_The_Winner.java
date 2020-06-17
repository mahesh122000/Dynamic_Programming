class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        int a[][]=new int[n][n];
        for(int d=0;d<n;d++)
        {for(int i=0,j=d;j<n;j++,i++)
        {
            int x=0,y=0,z=0;
            if(i+2<=j)
                x=a[i+2][j];
            if(i+1<=j-1)
                y=a[i+1][j-1];
            if(i<=j-2)
                z=a[i][j-2];
            a[i][j]=Math.max(nums[i]+Math.min(x,y),nums[j]+Math.min(y,z));
        }   
        }
       return a[0][n-1]>=(sum+1)/2;
    }
}