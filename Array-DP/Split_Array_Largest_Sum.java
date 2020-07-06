class Solution {
    static int ans;
    static int b[][];
    public int splitArray(int[] nums, int m) {
        int n=nums.length;
        if(n==0)
            return 0;
        ans=Integer.MAX_VALUE;
        int val=0;
        b=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=-1;
            }
        }
        if(m==1)
        {
            int sum=0;
            for(int i=0;i<n;i++)
                sum+=nums[i];
            return sum;
        }
        for(int i=0;i<=n-m;i++)
        {
            val+=nums[i];
            ans=Math.min(ans,Math.max(val,find(nums,i+1,m-1,n)));
        }
        return ans;
    }
    int find(int a[],int j,int k,int n)
    {
        if(k<=0)
            return Integer.MAX_VALUE;
        if(j>=n)
            return Integer.MAX_VALUE;
        if(b[j][k]!=-1)
            return b[j][k];
        if(k==1)
        {
            int sum=0;
            for(int i=j;i<n;i++)
                sum+=a[i];
            b[j][k]=sum;
            return sum;
        }
        int sum=0;
        int val=Integer.MAX_VALUE;
        for(int i=j;i<=n-k;i++)
        {
            sum+=a[i];
            val=Math.min(val,Math.max(sum,find(a,i+1,k-1,n)));
        }
        b[j][k]=val;
        return val;
    }
}