class Solution {
    public int totalHammingDistance(int[] nums) {
        int n=nums.length;
        int ans=0;
        int val=0;
        for(int i=0;i<32;i++)
        {
            val=0;
            for(int j=0;j<n;j++)
            {
                val+=nums[j]>>i &1;
            }
            ans+=val*(n-val);
        }
        return ans;
    }
}