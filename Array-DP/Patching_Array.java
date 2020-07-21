class Solution {
    public int minPatches(int[] nums, int n) {
        long miss_value=1;
        int i=0,l=nums.length;
        int count=0;
        while(miss_value<=n)
        {
            if(i<l && nums[i]<=miss_value)
            {
                miss_value+=nums[i++];
            }
            else
            {
                miss_value+=miss_value;
                count++;
            }
        }
        return count;
    }
}


/*
Let miss be the smallest sum in [0,n] that we might be missing. Meaning we already know we can build all sums in [0,miss). Then if we have a number num <= miss in the given array, we can add it to those smaller sums to build all sums in [0,miss+num). If we don't, then we must add such a number to the array, and it's best to add miss itself, to maximize the reach.
*/