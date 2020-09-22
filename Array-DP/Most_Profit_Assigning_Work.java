class Solution {
    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        int max=0;
        int n=d.length;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,d[i]);
        }
        int a[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            a[d[i]]=Math.max(a[d[i]],p[i]);
        }
        for(int i=1;i<=max;i++)
        {
            a[i]=Math.max(a[i],a[i-1]);
        }
        int ans=0;
        for(int i=0;i<w.length;i++)
        {
            if(w[i]<max)
            {
                ans+=a[w[i]];
            }
            else
            {
                ans+=a[max];
            }
        }
        return ans;
    }
}