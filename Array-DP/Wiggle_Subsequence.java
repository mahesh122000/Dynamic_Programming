class Solution {
    public int wiggleMaxLength(int[] nums) {
        int ans=1;
        int n=nums.length;
        if(n==0)
            return 0;
        int pre=2;
        int cur=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                cur=0;
                if((cur^pre)!=0)
                    ans++;
                pre=cur;
            }
            else if(nums[i]<nums[i-1])
            {
                cur=1;
                if((cur^pre)!=0)
                    ans++;
                pre=cur;
            }
        }
        return ans;
    }
}