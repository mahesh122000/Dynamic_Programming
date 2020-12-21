class Solution {
    public int smallestRangeII(int[] a, int k) {
        Arrays.sort(a);
        int n=a.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int min=Math.min(a[0]+k,a[i]-k);
            int max=Math.max(a[n-1]-k,i>=1?a[i-1]+k:a[n-1]-k);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}