class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int start=0;
        int val=1;
        int ans=0;
        for(int end=0;end<n;end++)
        {
            val=val*nums[end];
            while(val>=k && end>start)
            {
                val=val/nums[start++];
            }
            if(val<k)
                ans+=(end-start)+1;
        }
        
        return ans;
    }
}