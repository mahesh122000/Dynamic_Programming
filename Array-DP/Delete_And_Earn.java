class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int max=0;
        for(int i:nums)
            max=Math.max(max,i);
        int c[]=new int[max+1];
        for(int i:nums)
            c[i]++;
        int a[]=new int[max+1];
        a[0]=0;
        a[1]=c[1];
        for(int i=2;i<=max;i++)
            a[i]=Math.max(a[i-1],a[i-2]+i*c[i]);
        return a[max];
    }
}
//after collecting frequencies, it is similar to getting max value without taking consecutive values in an array.