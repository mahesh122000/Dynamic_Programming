class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {if(nums[i]>b && b>a)
         return true;
        if(nums[i]>a)
         b=nums[i];
        else if(nums[i]<a)
            a=nums[i];
        }
        return false;
    }
}