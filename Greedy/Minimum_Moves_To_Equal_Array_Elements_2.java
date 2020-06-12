class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0;
        int n=nums.length;
        if(n==0)
            return 0;
        if(n%2==0)
        mid=(nums[n/2]+nums[n/2-1])/2;
        else
        mid=nums[n/2];
        int ans=0;
        for(int i=0;i<n;i++)
            ans+=Math.abs(mid-nums[i]);
        return ans;
    }
}