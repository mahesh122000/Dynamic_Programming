class Solution {
    public int numSubarrayBoundedMax(int[] a, int l, int r) {
        int n=a.length;
        int start=0,max=0;
        int ans=0;
        int sl=0;
        for(int end=0;end<n;end++)
        {
            if(a[end]>=l)
                sl=0;
            else
                sl++;
            if(max>r)
            {
                start=end;
                max=0;
            }
            max=Math.max(max,a[end]);
            if(max>=l && max<=r)
            {
                ans+=end-start+1-sl;
            }
            
        }
        return ans;
    }
}