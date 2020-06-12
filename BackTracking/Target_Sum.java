class Solution {
    static int count;
    public int findTargetSumWays(int[] nums, int S) {
        count=0;
        find(nums,nums[0],0,S);
        find(nums,-nums[0],0,S);
        return count;
    }
    public void find(int a[],int v,int i,int s)
    {
        if(i==a.length-1)
        {if(v==s)
         count++;
        return;}
        find(a,v+a[i+1],i+1,s);
        find(a,v-a[i+1],i+1,s);
    }
}