class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int a[]=new int[n-1];
        int b[]=new int[n-1];
        if(n==1)
        return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        else
        {
          a[0]=nums[0];
          a[1]=Math.max(nums[1],nums[0]);
          for(int i=2;i<n-1;i++)
              a[i]=Math.max(a[i-1],a[i-2]+nums[i]);
          b[0]=nums[1];
          b[1]=Math.max(nums[1],nums[2]);
          for(int i=2;i<n-1;i++)
              b[i]=Math.max(b[i-1],b[i-2]+nums[i+1]);
        return Math.max(a[n-2],b[n-2]);}
    }
}