class Solution {
    public int longestMountain(int[] a) {
        int n=a.length;
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=1,j=n-2;i<n;i++,j--)
        {
            if(a[i]>a[i-1])
            {
                l[i]=l[i-1]+1;
            }
            else
            {
                l[i]=0;
            }
            if(a[j]>a[j+1])
            {
                r[j]=r[j+1]+1;
            }
            else
            {
                r[j]=0;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(l[i]>0 && r[i]>0)
            ans=Math.max(ans,l[i]+r[i]+1);
        }
        return ans>=3?ans:0;
    }
}