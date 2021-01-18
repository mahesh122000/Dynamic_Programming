class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<h)
        {
            if(nums[l]+nums[h]>k)
                h--;
            else if(nums[l]+nums[h]==k)
            {
                count++;
                l++;
                h--;
            }
            else
            {
                l++;
            }
        }
        return count;
    }
}