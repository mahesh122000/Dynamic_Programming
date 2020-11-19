class Solution {
    public int maxScoreSightseeingPair(int[] a) {
        int n=a.length;
        int max=a[n-1]-(n-1);
        int ans=0;
        for(int i=n-2;i>=0;i--)
        {
            ans=Math.max(ans,max+a[i]+i);
            max=Math.max(max,a[i]-i);
        }
        return ans;
    }
}