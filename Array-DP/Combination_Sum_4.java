class Solution {
    public int combinationSum4(int[] nums, int t) {
        int a[]=new int[t+1];
        a[0]=1;
        for(int i=1;i<=t;i++)
        {for(int j=0;j<nums.length;j++)
        {if(i>=nums[j])
         a[i]+=a[i-nums[j]];}}
        return a[t];
    }
}